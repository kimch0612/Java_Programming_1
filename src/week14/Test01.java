package week14;

class B {
    final void bcd() {
        int a=3;
        final int b=5;
    }
}

public class Test01 {
    public static void main(String[] args) {
        System.out.println("hi");
    }
}

// Final(상수)로 지정된 값은 변경이 불가능 함
// 변수 뿐만 아니라 메소드에서도 사용이 가능함 단, 이 경우 상속은 불가능 함