package week09;

class Pet {
    String name, bossName;
    int age;

    void search() {
        System.out.println(bossName);
    }
    void showPet() {
        System.out.println(name + " " + age);
    }
    void delName() {
        name = "";
    }
    void delAge() {
        age = 0;
    }
    void delBossName() {
        bossName = "";
    }
    public Pet () {
        name = "Default name";
        bossName = "Default bossName";
        age = 0;
    }
    public Pet (String name, String bossName, int age) {
        this.name = name;
        this.bossName = bossName;
        this.age = age;
    }
}

public class PetMain {
    public static void main(String[] args) {
        Pet a = new Pet();
        a.showPet();
        a.search();
        Pet b = new Pet("AA", "BB", 10);
        b.showPet();
        b.search();
        b.delBossName();
        b.delName();
        b.delAge();
        b.showPet();
        b.search();
    }
}
