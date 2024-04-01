package subject.one;

public class test {
    public static void main(String[] args) {
        int a = 5;
        int b = a++;

        System.out.println(a);      // a는 후위 증가 연산으로 1 증가하여 6가 출력됩니다.
        System.out.println(b);      // b는 후위 증가 연산 전의 a 값인 5가 출력됩니다.
        System.out.println(++a);    // a는 먼저 1 증가하여 7이 되고, 그 후에 출력되므로 7가 출력됩니다.
        System.out.println(++b);    // b는 먼저 1 증가하여 6이 되고, 그 후에 출력되므로 6이 출력됩니다.
        System.out.println(a++ + --b);  // a는 후위 증가 연산 전의 값인 7이 사용되고, b는 먼저 1 감소하여 5가 되어 사용됩니다. 따라서 7 + 5 = 12가 출력됩니다.
        System.out.println(a + b);  
    }
}
