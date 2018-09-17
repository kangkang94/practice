package com.json;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by kang on 18/9/12.
 */
public class ReflectPractice {
    public static void main(String[] args) throws Exception {

        Demo1();
        System.out.println("=============================================");

        Demo2();
        System.out.println("=============================================");

        Demo3();
        System.out.println("=============================================");

        Demo4();
        System.out.println("=============================================");

        Demo5();
        System.out.println("=============================================");

        Demo6();
        System.out.println("=============================================");

        Demo7();
        System.out.println("=============================================");

        Demo8();
        System.out.println("=============================================");


    }

    private static void Demo8() {
    }

    private static void Demo7() {
    }

    private static void Demo6() {
    }






    // Demo1: 通过Java反射机制的到类的包名与类名
    private static void Demo1() {
        JsonObjectSample jsonObjectSample = new JsonObjectSample();

        System.out.println("Demo1: 包名" + jsonObjectSample.getClass().getPackage().getName() + ", " + " 完整类名：" + jsonObjectSample.getClass().getName());
    }

    // Demo2: 验证所有类都是class类的实例对象
    private static void Demo2() throws ClassNotFoundException {

        Class<?> c1 = null;
        Class<?> c2 = null;

        c1 = Class.forName("com.json.JsonObjectSample");
        c2 = ReflectPractice.class;


        System.out.println("Demo2: 包名" + c1.getPackage().getName() + ", " + " 完整类名：" + c1.getName());
        System.out.println("Demo2: 包名" + c2.getPackage().getName() + ", " + " 完整类名：" + c2.getName());

    }

    // Demo3: 通过Java反射机制，用class创建类对象（反射的真正目的）
    private static void Demo3() throws ClassNotFoundException, IllegalAccessException, InstantiationException {

        Class<?> class1 = null;
        class1 = Class.forName("com.json.Person");

        Person p = (Person) class1.newInstance();
        p.setAge(24);
        p.setFirstName("minghang");

        System.out.println("Demo 3: " + p.getFirstName() + ": " + p.getAge());

    }

    private static void Demo4() throws ClassNotFoundException, IllegalAccessException, InvocationTargetException, InstantiationException {

        Class<?> class1 = null;
        class1 = Class.forName("com.json.Person");

        Constructor<?>[] constructors = class1.getConstructors();

        Person person1 = (Person) constructors[0].newInstance();
        person1.setFirstName("minghang");
        person1.setAge(25);

        Person person2 = (Person) constructors[1].newInstance("kangkang",24);

        System.out.println(person1 +" ===" + person2);
    }

    private static void Demo5() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InstantiationException, InvocationTargetException {
        Class<?> class1 = null;
        class1 = Class.forName("com.json.Person");

        Method method1 = class1.getMethod("getFirstName");
        System.out.println("    "+ method1.invoke(class1.newInstance()));

        Method method2 = class1.getMethod("setFirstName", String.class);
        method2.invoke(class1.newInstance(),"minghang");

    }


}
