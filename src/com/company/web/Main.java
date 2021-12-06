package com.company.web;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchFieldException {
        //Task 5
        Class t4 = Class.forName("com.company.web.Task3Child");
        //Task 6
        System.out.println("SimpleName " + Task3Child.class.getSimpleName());
        System.out.println("Name " + Task3Child.class.getName());
        System.out.println("CanonicalName " + Task3Child.class.getCanonicalName());
        //Task 7
        System.out.println(Task3Child.class.getSuperclass());
        //Task 8
        System.out.println(Task3Child.class.getInterfaces()[0]);
        //Task 9
        Arrays.stream(Task3Child.class.getConstructors())
                .map((a12) -> "constructor " + a12.toString())
                .forEach(System.out::println);
        Constructor c8 = Task3Child.class.getConstructor(new Class[]{});
        System.out.println("con " + c8);
        Task3Child t8 = (Task3Child) c8.newInstance();
        //Task 10
        Arrays.stream(Task3Child.class.getFields())
                .map((a12) -> "field " + a12.toString())
                .forEach(System.out::println);
        Arrays.stream(Task3Child.class.getDeclaredFields())
                .map((a12) -> "Declared field " + a12.toString())
                .forEach(System.out::println);
        System.out.println("public field " + Task3Child.class.getField("t1_3"));
        System.out.println("private field " + Task3Child.class.getDeclaredField("t1_2"));
        //Task 11
        Task3Child t11 = new Task3Child("abc");
        String s11 = (String) Task3Child.class.getField("t1_3").get(t11);
        System.out.println("string fieldt 1_3: " + s11);
        //Task 12
        Task3Child t12 = new Task3Child("abc", "def");
        System.out.println(Task3Child.class.getDeclaredField("t1_2").canAccess(t12));
        Field f12 = Task3Child.class.getDeclaredField("t1_2");
        f12.setAccessible(true);
        System.out.println(f12.canAccess(t12));
        System.out.println(f12.get(t12));
        // Task 13
        Task3Child t13 = new Task3Child("abc", "def");
        Arrays.stream(Task3Child.class.getMethods())
                .map(a13 -> "methods: " + a13.toString())
                .forEach(System.out::println);
        Arrays.stream(Task3Child.class.getDeclaredMethods())
                .map(a13 -> "Declared methods: " + a13.toString())
                .forEach(System.out::println);
        Method m13 = Task3Child.class.getMethod("getT1_3");
        Method m13_1 = Task3Child.class.getDeclaredMethod("getT1_2");
        //Task 14
        Task3Child t14 = new Task3Child("abc");
        Method m14 = Task3Child.class.getMethod("getT1_3");
        System.out.println(m14.invoke(t14));
        //Task 15
        Task3Child t15 = new Task3Child("abc", "def");
        Method m15 = Task3Child.class.getDeclaredMethod("getT1_2");
        m15.setAccessible(true);
        System.out.println(m15.canAccess(t15));
        System.out.println(m15.invoke(t15));
        //Task 16
        System.out.println(Task3Child.class.getModifiers());
        System.out.println(Task3Child.class.getField("t1_3").getModifiers());
        System.out.println(Task3Child.class.getMethod("getT1_3").getModifiers());
        System.out.println(Task3Child.class.getMethod("setT1_3", String.class).getModifiers());
    }
}
