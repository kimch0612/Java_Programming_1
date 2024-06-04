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
