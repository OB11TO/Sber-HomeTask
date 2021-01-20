import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;


public class BeanUtils {
    /**
     * Scans object "from" for all getters. If object "to"
     * contains correspondent setter, it will invoke it
     * to set property value for "to" which equals to the property
     * of "from".
     * <p/>
     * The type in setter should be compatible to the value returned
     * by getter (if not, no invocation performed).
     * Compatible means that parameter type in setter should
     * be the same or be superclass of the return type of the getter.
     * <p/>
     * The method takes care only about public methods.
     *
     * @param to   Object which properties will be set.
     * @param from Object which properties will be used to get values.
     */
    public static void assign(Object to, Object from) {
        Class<?> classTo = to.getClass();
        Class<?>  classFrom = from.getClass();

        for(Method method : classFrom.getMethods()){
            if(method.getName().startsWith("get")){
                System.out.println("Геттер" + method);
            }
            String setterName = method.getName().replace("get", "set");
            System.out.println("Поиск сеттера: " + setterName);

            for(Method m : classTo.getMethods()){
                if(m.getName().equals(setterName)){
                    if (method.getReturnType().isAssignableFrom(m.getParameterTypes()[0])) {
                        System.out.println("Найден сеттер: " + m);
                        try {
                            m.invoke(to, method.invoke(from));
                            System.out.println("Значение установлено.");
                        } catch (IllegalAccessException e) {
                            System.out.println("Нет доступа к методу " + method);
                        } catch (InvocationTargetException e) {
                            System.out.println("Возникли проблемы с вызовом метода " + method);
                        }
                    }
                }
            }
        }
    }
}
