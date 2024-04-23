package week08;

class SampleClass {
    String name;
    int age;

    void print() {
        System.out.println(name + ", " + age);
    }
}

public class WhatIsClass {
    public static void main(String[] args) {
        SampleClass a = new SampleClass(); // a 객체 생성
        a.name = "aa";
        a.age = 12;
        a.print();
        String str = new String("egg");

    }
}
