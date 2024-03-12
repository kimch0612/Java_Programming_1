package week02.types;

public class Test03 {
    public static void main(String[] args) {
        int mainA = 30; // mainA의 유효범위는 main함수 내 전체
        System.out.println("mainA = " + mainA);
        if (mainA == 30) {
            System.out.println("mainA는 30");
            mainA = 20;
            int B = 30; // B의 유효범위는 if문 내에서만
        } // B변수 소멸
        System.out.println("B = " + B);
    }
}
