package week08;

class SampleClass {
    // 필드==데이터==속성==변수 또는 상수==멤버변수
    String name;
    int age;
    // 메소드
    void print() {
        System.out.println(name + ", " + age);
    }
    // 생성자==객체생성==필드초기화
    public SampleClass() {
        name = "No Name";
        age = -99;
    }

    public SampleClass(String name, int age) {
        this.name = name;  // this는 자기 자신의 객체
        this.age = age;
    }
}

public class WhatIsClass {
    public static void main(String[] args) {
        SampleClass a = new SampleClass(); // a 객체 생성
        a.name = "aa";
        a.age = 12;
        a.print();
        String str = new String("egg");
        SampleClass b = new SampleClass("Hello", 19);
        b.print();
    }
}
