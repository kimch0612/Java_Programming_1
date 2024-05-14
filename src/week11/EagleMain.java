package week11;

class Eagle extends Animal {
    String wing;
    void print_info() {
        System.out.println(eye);
        System.out.println(mouth);
        System.out.println(wing);
        System.out.println(Test);
    }
    public Eagle() {
        eye = "default";
        mouth = "default";
        wing = "default";
    }
    public Eagle(String eye, String mouth, String wing) {
        this.eye = eye;
        this.mouth = mouth;
        this.wing = wing;
    }
}

public class EagleMain {
    public static void main(String[] args) {
        Eagle a = new Eagle();
        a.print_info();
        System.out.println();
        Eagle b = new Eagle("red", "yellow", "black");
        b.print_info();
    }
}
