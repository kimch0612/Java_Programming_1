package week03;

public class PrimaryTypes {
    public static void main(String[] args) {
        byte dataB = 127;
        byte dataB2 = (byte)128; // byte 범위 초과
        short dataS = 32767;
        short dataS2 = (short)32768; // short 범위 초과
        
        System.out.println(dataB);
        System.out.println(dataB2);
        System.out.println(dataS);
        System.out.println(dataS2);
        
        // 기본 자료형
        // - 정수 (byte, short, int, long)
        // - 실수 (float, double)
        // - 문자(정수) char    - 논리자료형 (boolean)
        // 참조 자료형
        // - 문자열 (String)
    }
}
