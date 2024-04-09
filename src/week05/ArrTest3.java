package week05;
import java.util.Scanner;

// 1, 2반의 점수를 저장해서 출력하기
// 1반은 3명, 2반은 4명
public class ArrTest3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] score = new int[2][];
        // score[0] = new int[4];
        // score[1] = new int[5];
        // for (int i=0; i<score[0].length; i++) {
        //     System.out.print(i + "번째 1반의 점수를 입력하세요: "); score[0][i] = sc.nextInt();
        //     score[0][3] += score[0][i]; 
        // }
        // for (int i=0; i<score[1].length; i++) {
        //     System.out.print(i + "번째 2반의 점수를 입력하세요: "); score[1][i] = sc.nextInt();
        //     score[1][4] += score[1][i];
        // }
        score[0] = new int[]{40, 50, 60};
        score[1] = new int[]{70, 80, 90, 20};
        for (int[] m : score) {
            for (int n : m) {
                System.out.print(n + " ");
            }
        }
        System.out.println();
        for (int i=0; i<score.length; i++) {
            for (int k=0; k<score[i].length; k++) {
                System.out.print(score[i][k] + " ");
            }
        }
        System.out.println();
    }
}
