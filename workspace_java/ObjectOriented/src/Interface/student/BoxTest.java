package Interface.student;

import Interface.Box;

//Wrapper Class : 기본 자료형을 클래스로 표현한 것.
//Wrapper Class 는 기본 자료형처럼 사용하면 된다.
//int -> Integer
//double -> Double
//boolean -> Boolean
//float -> Float
public class BoxTest {
    public static void main(String[] args) {
        //정수 10을 클래스화
        Integer a = Integer.valueOf(10);
        Integer c = 10;
        int d = 10;

        Box b = new Box();
        b.setBox(10); // 10 -> Integer 로 자동으로 변환해줌
    }
}
