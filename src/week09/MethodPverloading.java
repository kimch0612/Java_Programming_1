package week09;

public class MethodPverloading {
    public static void print() {
        System.out.println("No Data");
    }
    public static void print(int a) {
        System.out.println(a);
    }
    public static void print(double a, int b) {
        System.out.println("원 둘레: " + (2*a*r));
    }
    public static String print(String a) {
        return a;
    }
    public static void main(String[] args) {
        print();
        print(30);
        print(3.14, 10); // 원의 둘레 구하고 출력하는 메소드
        System.out.println(print("나비"));
    }
}
