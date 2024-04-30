package week09;

class Pet {
    String name, bossName;
    int age;

    void search() {
        System.out.println(bossName);
    }
    void showPet() {
        System.out.println(name);
    }
    void delName() {
        name = "";
    }
    void delBossName() {
        bossName = "";
    }
    public Pet () {
        name = "Default name";
        bossName = "Default bossName";
    }
    public Pet (String name, String bossName) {
        this.name = name;
        this.bossName = bossName;
    }
}

public class PetMain {
    public static void main(String[] args) {
        Pet a = new Pet();
        a.showPet();
        a.search();
        Pet b = new Pet("AA", "BB");
        b.showPet();
        b.search();
        b.delBossName();
        b.delName();
        b.showPet();
        b.search();
    }
}
