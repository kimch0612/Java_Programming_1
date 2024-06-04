package week14;

abstract class A {
    abstract void abc();
}

// class B extends A {
//     void abc() {
//         System.out.println("Class B에서 abc()를 구현함");
//     }
// }

public class BBB {
    public static void main(String[] args) {
        // A a = new B();
        // B b = new B();
        A a = new A() {
            void abc() {
                System.out.println("Class B에서 abc()를 구현함");
            }
        }; // 익명 inner class
    }
}

// 일반 클래스와 동일한 모습을 가지나, 추상 메소드가 1개라도 포함되어 있으면 추상 클래스
// 추상 클래스는 키워드 abstract 를 앞에 덧붙임
// 메소드의 모습이 미완서잉어서 객체 생성은 불가능
// 미완성인 메소드를 누군가는 완성시켜야 함 -- 상속받은 하위 클래스가 구현의 책임과 의무를 가짐
