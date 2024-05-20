package week06;
import java.util.Scanner;
// 배열 없이 코드 구현해보긴
public class SumWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int res = 0;
        System.out.print("영어 단어 입력: "); String word = sc.nextLine();
        word = word.toUpperCase();
        char[] arr = word.toCharArray();
        for (int i=0; i<word.length(); i++) {
        	switch(arr[i]) {
        	case 'A': res += 1; break;
        	case 'B': res += 2; break;
        	case 'C': res += 3; break;
        	}
        }
        System.out.println("합은 " + res);
    }
}
