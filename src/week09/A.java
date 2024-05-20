package week09;

class Aa {
    int a, b;
    Aa () {
        System.out.println("기본 생성자");
    } Aa (int a) {
        this(); // 생성자 A()를 호출하는 메소드
        this.a = a;
        System.out.println("매개변수가 1개인 두번째 생성자");
    } Aa (int a, int b) {
        this(a); // 생성자 Aa (int a) 호출
        this.b = b;
    }
}

public class A {
    public static void main(String[] args) {
        Aa a1 = new Aa();
        Aa a2 = new Aa(5);
        Aa a3 = new Aa(4, 8);
        Modifier m = new Modifier();
        m.d = 4;
    }
}
