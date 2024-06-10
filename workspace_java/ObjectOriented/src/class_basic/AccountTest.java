package class_basic;

public class AccountTest {
    public static void main(String[] args) {
        Account acc = new Account();
        acc.printAccount();

        System.out.println("----------");

        Account acc1 = new Account(100000);
        acc1.printAccount();

        //acc1.setAccount();



//        객체 초기화 (객체 생성 시 최초 1회 실행)
//        acc.initAccount();
//
//        acc.printAccount();
    }
}
