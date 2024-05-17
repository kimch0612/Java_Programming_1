package subject.two; // 패키지 선언
import java.util.Scanner; // Scanner 클래스 임포트
import java.util.Random; // Random 클래스 임포트

// 계정 템플릿 클래스 정의
class Account_Template {
    String name, mobile; // 이름과 전화번호 변수
    boolean credit, membership, register = true; // 카드 등록 여부, 멤버십 여부, 회원 등록 여부 변수
    long credit_num, membership_num; // 카드 번호와 멤버십 번호 변수
    Scanner sc = new Scanner(System.in); // 입력을 받기 위한 Scanner 객체 생성

    // 계정 생성 메서드
    void create_account(String name, String mobile) {
        if (!register) System.out.println("/// 이미 가입이 완료된 회원입니다. ///"); // 중복가입 차단
        else {
            this.name = name; // 이름 설정
            this.mobile = mobile; // 전화번호 설정
            System.out.print("카드 간편결제를 등록하시겠습니까? (true/false): "); credit = sc.nextBoolean(); // 카드 등록 여부 입력
            if (credit) System.out.print("등록할 카드의 번호를 숫자로만 입력하세요: "); credit_num = sc.nextLong(); // 카드 번호 입력
            System.out.print("멤버십을 가입하겠습니까? (true/false): "); membership = sc.nextBoolean(); // 멤버십 가입 여부 입력
            if (membership) { // 멤버십 가입 시
                Random mem_random = new Random(); // 랜덤 객체 생성
                membership_num = 1000000000L + (long)(mem_random.nextDouble() * 900000000L); // 멤버십 번호 생성
                System.out.println("발급된 멤버십 번호는 " + membership_num + "입니다."); // 발급된 멤버십 번호 출력
            }
            register = false; // 등록 완료 상태로 변경
        }
    }
}

// 계정 관리자 클래스 정의
class Account_Manager extends Account_Template {
    int purchased_amount = 0; // 구매 금액 변수
    boolean vip; // VIP 여부 변수

    // 구매 메서드
    void purchase(int amount) {
        System.out.println("물건을 " + amount + "만큼 결제했습니다."); // 구매 금액 출력
        purchased_amount += amount; // 구매 금액 합산
        if (purchased_amount >= 1000000) vip = true; // VIP 조건 확인
    }

    // 계정 정보 출력 메서드
    void account_info() {
        System.out.println("이름: " + name); // 이름 출력
        System.out.println("전화번호: " + mobile); // 전화번호 출력
        System.out.print("카드번호: ");
        if (credit) System.out.println(credit_num); // 카드 번호 출력
        else System.out.println("등록하지 않았습니다."); // 카드 미등록 시 메시지 출력
        System.out.print("멤버십 번호: ");
        if (membership) System.out.println(membership_num); // 멤버십 번호 출력
        else System.out.println("가입하지 않았습니다."); // 멤버십 미가입 시 메시지 출력
        System.out.print("고객 등급: ");
        if (vip) System.out.println("VIP"); // VIP 등급 출력
        else System.out.println("일반"); // 일반 등급 출력
    }

    // 기본 생성자
    public Account_Manager() {
        name = "Default String"; mobile = "Default String"; // 기본 값 설정
        credit = false; membership = false; // 기본 값 설정
        credit_num = -1; membership_num = -1; // 기본 값 설정
    }

    // 오버로드 생성자
    public Account_Manager(String name, String mobile, boolean credit, boolean membership, int credit_num) {
        System.out.println("정보를 강제로 설정합니다.");
        this.name = name; // 이름 설정
        this.mobile = mobile; // 전화번호 설정
        this.credit = credit; // 카드 등록 여부 설정
        this.membership = membership; // 멤버십 여부 설정
        this.credit_num = credit_num; // 카드 번호 설정
        if (membership) { // 멤버십 가입 시
            Random mem_random = new Random(); // 랜덤 객체 생성
            membership_num = 1000000000L + (long)(mem_random.nextDouble() * 900000000L); // 멤버십 번호 생성
        }
        register = false; // 등록 완료 상태로 변경
    }
}

// 메인 클래스
public class market_account {
    public static void main(String[] args) {
        Account_Manager a = new Account_Manager(); // 기본 생성자로 계정 관리자 객체 생성
        a.create_account("Changhwan", "01000000000"); // 계정 생성 메서드 호출
        a.account_info(); // 계정 정보 출력 메서드 호출
        System.out.println();

        Account_Manager b = new Account_Manager("Hong", "01099999999", false, true, 0); // 오버로드 생성자로 계정 관리자 객체 생성
        b.create_account("hongg", "01088888888"); // 중복가입 방지 기능이 잘 작동하는가 테스트
        b.account_info(); // 계정 정보 출력 메서드 호출
        System.out.println();

        Account_Manager c = new Account_Manager(); // 기본 생성자로 계정 관리자 객체 생성
        c.account_info(); // 계정 정보 출력 메서드 호출
        System.out.println();

        // vip 기능 테스트
        a.purchase(10000);
        b.purchase(1000000);
        System.out.println();

        // vip 갱신 여부 확인
        a.account_info();
        System.out.println();
        b.account_info();
        System.out.println();
    }
}
