import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.*;

public class MyProxy implements InvocationHandler {

    private final Map<KeyForMap, Object> cache = new HashMap<>();
    private final Object obj;

    public static Object newInstance(Object obj) {
        return Proxy.newProxyInstance(
                obj.getClass().getClassLoader(),
                obj.getClass().getInterfaces(),
                new MyProxy(obj));
    }

    private MyProxy(Object obj) {
        this.obj = obj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object value;
        if (!method.isAnnotationPresent(Cache.class)) {
            value = method.invoke(obj, args);
            System.err.println("Метод: " + "'" + method.getName() + "'" + " с аргументами : " + Arrays.asList(args) + " не кешировался, так как не помечен аннотацией @Cache. Ответ = " + value);
        } else {
            KeyForMap key = new KeyForMap(method.getName(), args);

            value = cache.get(key);
            if (value == null) {
                value = method.invoke(obj, args);
                cache.put(key, value);
                System.err.println("Метод: " + "'" + method.getName() + "'" + " с аргументами : " + Arrays.asList(args) + " не вызывался, ответ кеширован. Ответ = " + value);
            } else {
                System.err.println("Метод: " + "'" + method.getName() + "'" + " с аргументами : " + Arrays.asList(args) + " уже вызывался, ответ получен из кеша. Ответ = " + value);
            }
        }
        return value;
    }

}

class KeyForMap {

    private final String methodName;

    private final List<Object> args;

    public KeyForMap(String methodName, Object[] args) {
        this.methodName = methodName;
        this.args = Arrays.asList(args);
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof KeyForMap)) {
            return false;
        }
        KeyForMap that = (KeyForMap) o;
        return Objects.equals(methodName, that.methodName) &&
                Objects.equals(args, that.args);
    }

    @Override
    public int hashCode() {

        return Objects.hash(methodName, args);
    }
}