package week05;

import java.util.Scanner;

public class ArrTest2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] score = new int[4];
        for (int i=0; i<3; i++) {
            System.out.print("점수를 입력하세요: "); score[i] = sc.nextInt();
            score[3] += score[i];
        }
        System.out.printf("1번째: %d, 2번째: %d, 3번째: %d\n총합: %d점\n", score[0], score[1], score[2], score[3]);
    }
}
