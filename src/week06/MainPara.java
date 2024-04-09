package week06;

public class MainPara {
    public static void main(String[] ar) {
        String a = ar[0], b = ar[1], c = ar[2];
        
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        System.out.println(b+1);
        System.out.println(c+1);

        int d = Integer.parseInt(b);
        double e = Double.parseDouble(c);

        System.out.println(d+1);
        System.out.println(e+1);
    }
}
