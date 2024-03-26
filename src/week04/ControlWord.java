package week04;

public class ControlWord {
    public static void main(String[] arvs) {
        for (int i=1; i<=100; i++) {
            if (i % 5 == 0) System.out.println(i);
            else continue;
        }
    }
}
