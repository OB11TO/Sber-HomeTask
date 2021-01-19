import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.Class;
import java.lang.reflect.Modifier;


public class Main {
    public static void main(String[] args) {

        Calculator calculator = new CalculatorImpl();
        Calculator myProxy = (Calculator) MyProxy.newInstance(calculator);
       // Calculator myCalculator = new PerformanceProxy(new Calculator()));


        System.out.println("Test calculator");
        System.out.println(calculator.calc(4));

        System.out.println("Task 2");
        Class<? super CalculatorImpl> clazz = CalculatorImpl.class.getSuperclass();
        Method[] methods = clazz.getDeclaredMethods();

        for (Method method : methods) {
            method.setAccessible(true);
            System.out.println(method);
        }

        System.out.println("Task 3");
        for(Method method : methods){
            if(isGetter(method)) System.out.println("getter: " + method);
        }
        System.out.println("Task 5");
        myProxy.calc(4);
        myProxy.calc(3);
        myProxy.calc(4);
        myProxy.calc(3);

        System.out.println("Task 5");
        System.out.println(calculator.calc(3));

    }

    public static boolean isGetter(Method method){
        if (!method.getName().startsWith("get")) {
            return false;
        }
        if (method.getParameterTypes().length != 0) {
            return false;
        }
        return !void.class.equals(method.getReturnType());
    }
}