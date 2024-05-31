package 변수와자료형.IF_문제_1;

/*5. 정수형 변수 하나를 선언하고 0 ~ 100까지의(0,100 포함)
  숫자 중 임의의 값으로 초기화하자. 그 후 변수의 값이 90보다 크고 100보다
  작거나 같으면 ‘학점은 A입니다.’를 출력하고, 80보다 크고 90보다 작거나
  같으면 ‘학점은 B입니다.’를 출력하고, 80점 이하라면 ‘학점은 C입니다.’
  를 출력해보자.
*/



public class Test5 {
    public static void main(String[] args) {
        int x = 89;

        if(90 < x && x <= 100){
            System.out.println("학점은 A입니다.");
        }
        else if (80 < x){
            System.out.println("학점은 B입니다.");
        }
        else{
            System.out.println("학점은 C입니다.");
        }
    }
}
