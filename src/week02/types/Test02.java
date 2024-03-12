package week02.types;

public class Test02 {
	public static void main(String[] argc) {
		System.out.println("바이트 코드 생성 결과 확인하기");
		System.out.println(4+6);
		System.out.println(4 + 6 + "println메소드");
		System.out.println("println()" + 4 + 6);
		System.out.println(4 + "println()" + 8 + 3);
		System.out.println(4 + "println()" + (8 + 3));
		System.out.println(); // 줄바꿈
		System.out.print(4+9+"출력 메소드 확인 중...\n");
		System.out.print("집가고싶다");
		System.out.printf("%3d + %3d = %5d\n", 2, 4, 2+4);
	}
}
