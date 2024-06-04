package week14;

abstract class SimpleClss {
    abstract void myClassName();
}

// class Temp extends SimpleClss {
//     public void myClassName() {
//         System.out.println("클래스 이름 : " + this.getClass().getName());
//     }
// }

public class SimpleClass {
    public static void main(String[] args) {
        // Temp tp = new Temp();
        // tp.myClassName();
        SimpleClss ss = new SimpleClss() {
            public void myClassName() {
                System.out.println("추상클래스 이름 : " + this.getClass().getSimpleName());
                System.out.println("추상클래스 이름 : " + SimpleClss.class.getSimpleName());
            }
        };
        ss.myClassName();
    }
}
