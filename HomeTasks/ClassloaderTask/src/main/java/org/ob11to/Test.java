package org.ob11to;

import java.net.URL;
import java.net.URLClassLoader;

public class Test  {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        Class clazz= Class.forName("Main");

        Main testModule = (Main)clazz.newInstance();

                System.out.println(testModule);
        }
    }

