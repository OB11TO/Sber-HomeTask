package org.ob11to;

import java.net.URL;
import java.net.URLClassLoader;

public class Test {
    public static void main(String[] args) {
        URLClassLoader classLoader = (URLClassLoader) Test.class.getClassLoader();
        for( URL url:  classLoader.getURLs()){
                System.out.println(url);
        }
    }
}
