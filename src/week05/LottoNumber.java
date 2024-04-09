package week05;

import java.util.Random;

public class LottoNumber {
    public static void main(String[] args) {
        Random rand = new Random(); // new는 heap에 공간 할당
        // Scanner와 Random은 붕어빵 틀이고, rand는 객체 (== 참조변수)이며 주소값(위치)를 갖는다.
        // int num1 = rand.nextInt(45) + 1; // 1에서 45 사이의 정수 발생
        // System.out.println(num1);
        for (int i=0; i<6; i++) System.out.print(rand.nextInt(45) + 1 + " ");
        System.out.println();
    }
}
