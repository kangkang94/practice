package com.json;

/**
 * Created by kang on 18/9/12.
 */
public class Person {
    private String firstName;

    public Person() {
    }

    private int age;

    public Person(String firstName, int age) {
        this.firstName = firstName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return firstName + ":" + age;
    }

    private void function(){

        validate();

        calucate();

        hello();
        hello();


    }

    private void hello() {
        System.out.println("minghang1");
        System.out.println("minghang1");
    }

    private void calucate() {
        System.out.println("minghang1");
        System.out.println("minghang1");
    }

    private void validate() {
        System.out.println("minghang1");
        System.out.println("minghang1");
    }


}
