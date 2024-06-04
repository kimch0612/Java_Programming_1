package week12;

import java.util.Scanner;

class Dongari {
    String Dname, boss;
    int count;

    public String getDname() {
        return this.Dname;
    }

    public String getBoss() {
        return this.boss;
    }

    public void setBoss(String boss) {
        this.boss = boss;
    }

    public void setCount(int count) {
        this.count = count;
    }

    void dongari_info() {
        System.out.println("동아리 이름: " + Dname);
        System.out.println("동아리 회장 이름: " + boss);
        System.out.println("동아리 인원 수: " + count);
    }

    public Dongari(String Dname, String boss, int count) {
        this.Dname = Dname;
        this.boss = boss;
        this.count = count;
    }

    public Dongari() {
        this("Default Dname", "Default boss", -1);
    }
}

public class DongariMain {
    public static void main(String[] args) {
        Dongari[] dong = new Dongari[3];
        dong[0] = new Dongari();
        dong[1] = new Dongari("컴퓨터", "철수", 10);
        dong[2] = new Dongari("문예부", "영희", 7);
        Scanner sc = new Scanner(System.in);
        String tmp_str = "";
        System.out.print("찾으려는 동아리 이름을 입력하세요: "); tmp_str = sc.nextLine();
        for (int i=0; i<dong.length; i++) {
            if (tmp_str.equalsIgnoreCase(dong[i].getDname()))
                System.out.println(i+1 + "번째 동아리입니다.");
        }
        System.out.print("인원 수를 수정하려는 동아리 이름을 입력하세요: "); tmp_str = sc.nextLine();
        for (int i=0; i<dong.length; i++) {
            if (tmp_str.equalsIgnoreCase(dong[i].getDname())) {
                System.out.print(dong[i].getDname() + " 동아리의 수정하려는 인원 수를 입력하세요: ");
                dong[i].setCount(sc.nextInt());
                sc.nextLine();
                dong[i].dongari_info();
            }
        }
        System.out.print("회장 이름을 수정하려는 동아리 이름을 입력하세요: "); tmp_str = sc.nextLine();
        for (int i=0; i<dong.length; i++) {
            if (tmp_str.equalsIgnoreCase(dong[i].getDname())) {
                System.out.print(dong[i].getDname() + " 동아리의 수정하려는 회장 이름을 입력하세요: ");
                dong[i].setBoss(sc.nextLine());
                dong[i].dongari_info();
            }
        }
    }
}
