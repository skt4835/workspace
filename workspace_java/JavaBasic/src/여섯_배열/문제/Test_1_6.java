package 변수와자료형.여섯_배열.문제;

//6. 정수를 10개 저장할 수 있는 배열을 생성하고 모든 요소의 값을 출력해보아라.
public class Test_1_6 {
    public static void main(String[] args) {
        int[] x = new int[10];
        for (int i = 0; i < x.length; i++){
            System.out.println(x[i]);
        }
    }
}
