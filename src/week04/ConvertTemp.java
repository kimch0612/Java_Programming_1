package week04;
import java.util.Scanner;

public class ConvertTemp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("화씨 온도 입력 : "); double f_temp = sc.nextDouble();
        double c_temp = 5/9.0 * (f_temp - 32);
        System.out.println("섭씨 온도 : " + c_temp);
        System.out.print("섭씨 온도 입력 : "); c_temp = sc.nextDouble();
        f_temp = 9/5.0 * c_temp + 32;
        System.out.println("화씨 온도 : " + String.format("%.1f", f_temp));
        sc.close();
    }
}