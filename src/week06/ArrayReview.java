package week06;

public class ArrayReview {
    public static void main(String[] args) {
        // 정수 배열 자료형 선언 score
        int[] score = new int[20];
        int[] score2 = new int[]{10, 20, 30};
        int[] score3 = new int[3];
        score3[0] = 20;
        score3[1] = 90;
        score3[2] = 80;
        int[] score4 = {55, 77, 100};
        int[] score5 = score;

        for (int i=0; i<score4.length; i++) System.out.println(score4[i]);
        for (int k : score4) System.out.println(k);

        // int[][] jumsu = new int[3][];
        // jumsu[0] = new int[23];
        // jumsu[1] = new int[24];
        // jumsu[2] = new int[30];
        int[][] jumsu = new int[][]
            { {0, 0}, {0, 0}, {0, 0} }; // 3행 2열
        for (int[] k : jumsu)
            for (int t : k)
                System.out.println(t);
    }
}
