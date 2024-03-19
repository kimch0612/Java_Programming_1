package week03;

public class IFControl {
    public static void main(String[] args) {
        int jumsu = 96;
        char hakjum;
        // if (jumsu >= 70) {
        //     System.out.println("Pass");
        //     System.out.println("ㅊㅋ");
        // } else {
        //     System.out.println("Fail");
        //     System.out.println("ㅅㄱ");
        if (jumsu >= 90) hakjum = 'A';
        else if (jumsu >= 80) hakjum = 'B';
        else if (jumsu >= 70) hakjum = 'C';
        else if (jumsu >= 60) hakjum = 'D';
        else hakjum = 'F';

        System.out.println(hakjum + "학점입니다.");
        
    }
}
