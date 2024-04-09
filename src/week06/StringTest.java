package week06;

public class StringTest {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "Hello";
        System.out.println((s1==s2) ? "동일" : "다름");
        String s3 = new String("Hello");
        System.out.println((s1==s3) ? "ㅇㅇ" : "ㄴㄴ");
        System.out.println(System.identityHashCode(s1));
        System.out.println(System.identityHashCode(s2));
        System.out.println(System.identityHashCode(s3));
        String s4 = "Hello";
        System.out.println(System.identityHashCode(s4));
    }
}
