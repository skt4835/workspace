package test;

public class MemberTest {
    public static void main(String[] args) {
        Member member = new Member();

        //Member 클래스에 대한 객체값 변경
        member.setInfo("자바", "java", "abcd1234", 20);

        //생성한 객체의 모든 정보 출력
        member.showInfo();

        //로그인 가능
        showLoginMessage(member.isLogin("java", "abcd1234"));

        //로그인 불가능
        showLoginMessage(member.isLogin("java", "abcd"));
    }

    public static void showLoginMessage(boolean isLogin){
        if (isLogin) {
            System.out.println("로그인 가능");
        }else {
            System.out.println("로그인 불가능");
        }
    }
}
