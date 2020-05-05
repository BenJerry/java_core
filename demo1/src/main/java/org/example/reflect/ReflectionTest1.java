package org.example.reflect;

import java.lang.reflect.Modifier;

public class ReflectionTest1 {

    public static void main(String[] args) {
        String className = "java.lang.Object";
        Class cl;
        try {
            cl = Class.forName(className);
            System.out.println("getName : " + cl.getName());
            System.out.println("getModifiers : " + cl.getModifiers());
            System.out.println(Modifier.toString(cl.getModifiers()));
            System.out.println(cl.getDeclaredConstructors());
            System.out.println(cl.getComponentType());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

}
