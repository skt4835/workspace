package class_basic.Member;

public class MemberTest {
    public static void main(String[] args) {
        Member m1 = new Member();

        m1.setMemberInfo("홍길동", "아이디", "비번", "33");
        m1.printMemberInfo();
    }
}
