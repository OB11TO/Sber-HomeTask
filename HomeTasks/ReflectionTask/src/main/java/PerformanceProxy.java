import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Date;

public class PerformanceProxy implements InvocationHandler {
        private final Object delegate;

    public PerformanceProxy(Object delegate) {
        this.delegate = delegate;
    }

    public static Object newInstance(Object delegate) {
        return Proxy.newProxyInstance(
                delegate.getClass().getClassLoader(),
                delegate.getClass().getInterfaces(),
                new PerformanceProxy(delegate));
    }

    @Override
    public Object invoke(Object o, Method method, Object[] args) throws Throwable {
       Object value;
        if(!method.isAnnotationPresent(Metric.class)){
            value = method.invoke(delegate, args);
            System.out.println("Метод: " + "'" + method.getName() + "не использует аннотацию Metric");
        }

        Date date = new Date();
        value = method.invoke(delegate, args);
        long time = new Date().getTime() - date.getTime();
        System.out.println("Время выполнение: " + time);
        return value;
    }
}
