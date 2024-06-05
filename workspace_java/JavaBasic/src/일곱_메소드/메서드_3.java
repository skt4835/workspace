package 변수와자료형.일곱_메소드;

//매개변수(parameter) : method 정의 부분 소괄호 안에서 정의된 변수


public class 메서드_3 {
    public static void main(String[] args) {
        tellYourName("자바");
        tellYourName("홍");

//        tellYourName(5); 매개변수의 자료형이 일치 필요
    }

    public static void tellYourName(String name){// Strign name = "자바"
        System.out.println("제 이름은 " + name);

    }
}
