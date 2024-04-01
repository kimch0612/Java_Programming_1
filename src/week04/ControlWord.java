package week04;

public class ControlWord {
    public static void main(String[] arvs) {
        int line = 0;
        for (int i=1; i<=100; i++) {
            if (i%5==0){
                if (line <= 9) {
                    System.out.print(i + " ");
                    line++;
                }
                else {
                    System.out.println();
                    System.out.print(i + " ");
                    line = 0;
                }
            }
            else continue;
        }
        System.out.println();
    }
}
