package week11;

class Goods {
    private String ShopName = "", owner = "";
    private String[][] GoodsList = new String[3][];
    // GoodsList[n]: Category List (Living, Bathroom, kitchen)
    private int[][] GoodsQTY = new int[3][];

    void Insert_Goods(int a, int b, String item, int qty) {
        GoodsList[a][b] = item;
        GoodsQTY[a][b] = qty;
        System.out.println("반영 완료");
    }

    void print_info() {
        System.out.println("가게 이름: " + ShopName);
        System.out.println("사장 이름: " + owner);
        System.out.println("// 취급 물건 //");
        for (String[] i : GoodsList)
            for (String k : i)
                System.out.println(k);
    }

    public Goods(String ShopName, String owner) {
        this.ShopName = ShopName;
        this.owner = owner;
        GoodsList[0] = new String[1];
        GoodsList[1] = new String[3];
        GoodsList[2] = new String[2];
        GoodsQTY[0] = new int[10];
        GoodsQTY[1] = new int[10];
        GoodsQTY[2] = new int[10];
    }
}

public class GoodsMain {

}
