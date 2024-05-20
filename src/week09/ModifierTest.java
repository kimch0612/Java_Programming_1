package week09;

class Modifier {
    public int a; // 
    private int b; // 동일 클래스 내에서만 접근 가능
    protected int c; // 
    int d; // 동일 패키지의 동일 클래스에서 접근 가능

    public void print() {
        System.out.println(b);
    } ;
    private void print(int a) {} ;
    protected void print(int a, int b) {} ;
    void print(double d) {} ;
}

public class ModifierTest {
    public static void main(String[] args) {
        Modifier m = new Modifier();
        m.a=3; m.c=5; m.d=6;

    }
}
