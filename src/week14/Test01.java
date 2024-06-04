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
// 변수 뿐만 아니라 메소드에서도 사용이 가능함 단, 이 경우 오버라이딩 기능을 사용하지 못 함 (변경해서 재정의하는게 안 됨)
// 클래스에 final을 붙이는 경우 상속 자체가 불가능 함

// String name = "Kim";
// Kim은 Constant string pool에 들어가있음 (heap 내에 constant string pool 내에 kim 저장)
// Constant string pool에 저장된 kim의 주소값이 name에 저장됨