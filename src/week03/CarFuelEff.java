package week03;
import java.util.Scanner;

public class CarFuelEff {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("자동차 주행거리(km): "); int distance = sc.nextInt();
        System.out.print("연료 소모량(리터): "); int fuel = sc.nextInt();
        System.out.println("-----------------------");
        float gas = (float)distance / (float)fuel;
        System.out.println("연비: " + gas);
    }
}
