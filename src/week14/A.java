package week14;

public interface A {
    public static final int MAX = 100;
    double PI = 3.141592;
    public abstract void print();
    abstract void printStar();
    abstract void printBar();
    abstract void printMenu();
}

class Imp1A implements A {
    public static void main(String[] args) {
        System.out.println(MAX);
        System.out.println(PI);
    }
    public void print() {
        System.out.println("Hello");
    }
    public void printStar() {
        System.out.println("*****");
    }
    public void printBar() {
        System.out.println("======");
    }
    public void printMenu() {
        System.out.println("MENU");
    }
}