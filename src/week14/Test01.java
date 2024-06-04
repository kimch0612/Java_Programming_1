package week14;

abstract class Animal {
    abstract void cry(); // 추상메소드가 하나라도 있다면 클래스도 추상이 되어야 함
}

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

// abstract (추상적인)
// prototype은 원형(시제품)이라고 생각하면 됨, c에서 함수의 원형을 작성했던 것이랑 동일한 듯?

// Animal animal1 = new Cat(); 이 경우 animal1은 Animal을 따라가나, 메소드 등을 호출할 때에는 하위클래스의 오버라이딩 된 것들을 사용함
// 추상 메소드는 몸체가 없고, abstract 키워드를 가지며, 하나라도 존재하는 경우 클래스 또한 추상클래스가 된다.