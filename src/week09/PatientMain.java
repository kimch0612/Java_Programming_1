package week09;

class Patient {
    String name, disease;
    int age;
    
    void showPatient() {
        System.out.println("이름: " + name);
        System.out.println("질병: " + disease);
        System.out.println("나이: " + age);
    }
    public Patient() {}
    public Patient(int age, String name) {
        this.name = name;
        this.age = age;
    }
    public Patient(int age, String name, String disease) {
        this(age, name);
        this.disease = disease;
    }
}

public class PatientMain {
    public static void main(String[] args) {
        Patient p1 = new Patient();
        p1.showPatient();
        Patient p2 = new Patient(20, "홍길동", "폐렴");
        p2.showPatient();
        Patient p3 = new Patient(50, "아무개", "간염");
        p3.showPatient();
    }
}
