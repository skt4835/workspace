package 상속;

public class PhoneTest {
    public static void main(String[] args) {
        MobilePhone m1 = new MobilePhone();
        SmartPhone sp1 = new SmartPhone();

        //부모클래스로는 자식 클래스의 객체를 받을 수 있음.
        //다형성으로 생성된 객체는 부모클래스이 변수, 메서드만 사용 가능
        MobilePhone m2 = new SmartPhone();
        //m2.playApp(); 오류
        m2.sendMsg();

        //SmartPhone sp2 = new MobilePhone(); 오류
    }
}
