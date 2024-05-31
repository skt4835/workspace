package 변수와자료형.IF_문제_1;

/*4. 정수형 변수 하나를 선언하고 임의의 정수로 초기화하자.
 그리고 변수의 값이 3의 배수이면 ‘3의 배수입니다’를 출력해보자.
 */


public class Test4 {
    public static void main(String[] args) {
        int x = 6;

        if(x%3==0){
            System.out.println("3의 배수입니다.");
        }
    }
}
