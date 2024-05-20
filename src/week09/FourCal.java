package week09;

public class FourCal {
    public static void cal(int a, int b) {
        System.out.println(3 + 4);
    }
    public static void cal(double a, double b) {
        System.out.println(a * b);
    }
    public static void cal(int a) {
        System.out.println((a % 2 == 0) ? "짝수" : "홀수");
    }
    public static String cal(String str) {
        return str;
    }
    public static void main(String[] args) {
        cal(3, 4); // 덧셈
        cal(3.0, 5.6); // 곱셈
        cal(6); // 홀수 짝수 판별
        System.out.println(cal("홍길동"));
    }
}
