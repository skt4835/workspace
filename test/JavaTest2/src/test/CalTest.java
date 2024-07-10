package test;

public class CalTest {
    public static void main(String[] args) {

        // 1) Calculate 클래스에 대한 객체 생성
        Calculate cal = new Calculate();

        // 2) 해당 객체가 가진 두 정수를 setNumber() 메서드를 호출하여 변경
        cal.setNumber(10, 20);

        // 3) 객체가 가진 두 정수의 합을 출력
        System.out.println("두 정수의 합 : " + cal.getSum());

        // 4) 객체가 가진 두 정수 중 큰 수를 출력
        System.out.println("두 정수 중 큰 수는 " + cal.getMax() + " 입니다.");


        // 5) 객체가 가진 두 정수 사이의 정수들의 평균을 리턴
        System.out.println("두 정수 사이의 합 평균 : " + cal.getAvg());
    }
}
