package week05;

public class ArrTest1 {
    public static void main(String[] args) {
        int[] jumsu = new int[5]; // int 배열자료형 jumsu 선언 및 초기화
        System.out.println(jumsu[0]); // int형은 0으로 초기화 됨
        double[] radius = new double[5];
        System.out.println(radius[0]); // 기본값 0.0
        boolean[] Flag = new boolean[5];
        System.out.println(Flag[0]); // 기본값 false
        char[] ch = new char[5];
        ch[0] = 'A';
        System.out.println(ch[0]); // 기본값 X
        int[] test = new int[] {1, 2, 3, 4, 5};
        int[] test1 = {1, 2, 3, 4, 5};
    }
}
