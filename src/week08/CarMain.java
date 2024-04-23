package week08;

class Car {
    String Color, brand;
    int fuel;
    void drive() {
        System.out.println(brand + "차량을 운전 중입니다.");
    }
    void start() {
        System.out.println(brand + "차량을 출발 중입니다.");
    }
    void stop() {
        System.out.println(brand + "차량을 정지 중입니다.");
    }
    void print() {
        System.out.println(Color + ", " + brand + ", " + fuel);
    }
    public Car() {
        Color = "Default Color";
        brand = "Default Brand";
        fuel = 0;
    }
    public Car(String Color, String brand, int fuel) {
        this.Color = Color;
        this.brand = brand;
        this.fuel = fuel;
    }
}

public class CarMain {
    public static void main(String[] args) {
        Car a = new Car();
        a.print();
        Car b = new Car("Yellow", "Hyundai", 1000);
        b.print();
        b.drive();
        a.start();
        a.stop();
    }
}
