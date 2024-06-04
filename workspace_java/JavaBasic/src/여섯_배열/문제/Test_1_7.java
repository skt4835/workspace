package 변수와자료형.여섯_배열.문제;

//7. 정수를 10개 저장할 수 있는 배열을 생성하고 모든 요소에 3을 넣어라. 그리고 3이 잘 들어갔는지 출력하여 확인해보아라.
public class Test_1_7 {
    public static void main(String[] args) {
        int[] x = new int[10];

        for (int i = 0; i < x.length; i++){
            x[i] = 3;
            System.out.println(i+ ":" + x[i]);
        }
    }
}
