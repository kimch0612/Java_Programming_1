package week05;

import java.util.Random;

public class LottoNumber {
    public static void main(String[] args) {
        Random rand = new Random();
        int num1 = rand.nextInt(45) + 1;
        System.out.println(num1);
    }
}
