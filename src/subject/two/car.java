package subject.two;

class Car_Template {
    String brand, model, fuel, color;
    int fuel_capacity;

    void car_info() {
        System.out.println("브랜드: " + brand);
        System.out.println("모델명: " + model);
        System.out.println("색상: " + color);
        System.out.println("연료 타입: " + fuel);
        System.out.println("연료 용량: " + fuel_capacity);
    }
}

class Car_Truck extends Car_Template {
    String freight, dest;
    int capacity, max_capacity;

    void truck_info() {
        car_info();
        System.out.println("현재 적재된 화물: " + freight);
        System.out.println("화물 용량: " + capacity);
        System.out.println("목적지: " + dest);
        System.out.println("적재 가능한 최대 용량: " + max_capacity);
    }
}

class Car_Bus extends Car_Template {
    String bus_stop;
    int passenger, max_passenger;

    void bus_info() {
        car_info();
        System.out.println("탑승한 승객 수: " + passenger);
        System.out.println("탑승할 수 있는 승객 수: " + max_passenger);
        System.out.println("다음 버스정류장: " + bus_stop);
    }
}

public class car {

}
