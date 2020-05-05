package org.example.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Scanner;

public class ReflectionTest {

    public static void main(String[] args) {
        String name;
        if(args.length > 0) name = args[0];
        else {
            Scanner in = new Scanner(System.in);
            System.out.println("Enter class name (e.g. java.util.Date): ");
            name = in.next();
        }

        try {
            Class cl = Class.forName(name);
            Class supercl = cl.getSuperclass();
            String modifiers = Modifier.toString(cl.getModifiers());
            if(modifiers.length() > 0) {
                System.out.println(modifiers + " ");
            }
            System.out.println("class " + name);
            if(supercl != null && supercl != Object.class) {
                System.out.println(" extends" + supercl.getName());
            }
            System.out.println("\n{\n");
            printConstructors(cl);
            System.out.println();
            printMethods(cl);
            System.out.println();
            printFields(cl);
            System.out.println("}");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.exit(0);
    }

    public static void printConstructors(Class cl) {
        Constructor[] constructors = cl.getDeclaredConstructors();

        for (Constructor constructor : constructors) {
            String name = constructor.getName();
            System.out.println(" ");
            String modifiers = Modifier.toString(constructor.getModifiers());
            if(modifiers.length() > 0) {
                System.out.println(modifiers + " ");
            }
            System.out.println(name + "(");
            Class[] paramTypes = constructor.getParameterTypes();
            for(int j = 0; j < paramTypes.length; j ++) {
                if(j > 0) {
                    System.out.print(",");
                }
                System.out.print(paramTypes[j].getName());
            }
            System.out.println(");");
        }
    }

    public static void printMethods(Class cl) {
        Method[] methods = cl.getDeclaredMethods();
        for(Method method : methods) {
            Class retType = method.getReturnType();
            String name = method.getName();

            System.out.println(" ");
            String modifiers = Modifier.toString(method.getModifiers());
            if (modifiers.length() > 0) {
                System.out.println(modifiers + " ");
            }
            System.out.println(retType.getName() + " " + name + "(");
            Class[] paramTypes = method.getParameterTypes();
            for(int j = 0; j < paramTypes.length; j ++) {
                if(j > 0) {
                    System.out.println(", ");
                }
                System.out.println(paramTypes[j].getName());
            }
            System.out.println(");");
        }
    }

    public static void printFields(Class cl) {
        Field[] fields = cl.getDeclaredFields();

        for(Field field : fields) {
            Class type = field.getType();
            String name = field.getName();
            String modifiers = Modifier.toString(field.getModifiers());
            if (modifiers.length() > 0) {
                System.out.println(modifiers + " ");
            }
            System.out.println(type.getName() + " " + name + ";");
        }
    }
}
