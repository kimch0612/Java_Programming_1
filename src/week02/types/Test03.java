package week02.types;

public class Test03 {
    public static void main(String[] args) {
        int num1 = 20;
        int num2 = 30;
        String res = (num1 == num2) ? "정수일치":"정수불일치";

        String str1 = "안녕";
        String str2 = "안녕";
        String res2 = (str1 == str2) ? "안녕일치":"안녕불일치";

        String s1 = new String("안녕");
        String s2 = new String("안녕");
        String res3 = (s1 == s2) ? "new일치":"new불일치";
        String res4 = (s1.equals(s2)) ? "newnew일치":"newnew불일치"; 

        System.out.println(res);
        System.out.println(res2);
        System.out.println(res3);
        System.out.println(res4);
    }
}
