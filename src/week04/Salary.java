package week04;
import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("현재 연봉 : "); double currentSalary = sc.nextDouble();
        System.out.print("근무평가등급 : "); int step = sc.nextInt();
        double newSalary = 0;
        switch(step) {
            case 1: newSalary = currentSalary * 1.06; break;
            case 2: newSalary = currentSalary * 1.04; break;
            case 3: newSalary = currentSalary * 1.02; break; 
            default: newSalary = currentSalary * 1; break;
        }
        double raise = newSalary - currentSalary;
        System.out.println("현재 연봉액 : " + (int)currentSalary);
        System.out.println("연봉 인상액 : " + (int)raise);
        System.out.println("새로운 연봉 : " + (int)newSalary);
    }
}
