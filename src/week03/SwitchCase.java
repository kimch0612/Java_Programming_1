package week03;

public class SwitchCase {
    public static void main(String[] args) {
        int jumsu = 40;
        char hakjum;

        switch(jumsu/10) {
            case 9: hakjum = 'A'; break;
            case 8: hakjum = 'B'; break;
            case 7: hakjum = 'C'; break;
            case 6: hakjum = 'D'; break;
            default: hakjum = 'F';
        }
        
        System.out.println(hakjum + "학점입니다.");
    }
}
