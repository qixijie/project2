package com.ytf;

/**
 * person demo
 */
public class Person {
    public static final int max;

    static {
        max = 100;
    }

    private  String name;

    public static int getMax() {
        return max;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }



}
