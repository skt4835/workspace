package 변수와자료형.여섯_배열;

public class 배열_1 {
    public static void main(String[] args) {
        //정수를 여러개 저장할 수 있는 배열 선언
        //배열은 같은 자료형을 여러개 저장할 수 있음

        //배열 선언
        int[] arr1;
        String[] arr2;
        double[] arr3;

        //배열 생성 (초기화 라고 안함)
        arr1 = new int[3]; //정수를 저장할 공간 3개를 생성
        arr2 = new String[5]; //문자열 저장할 공간 5개를 생성
        arr3 = new double[10]; //실수 저장할 공간 10개를 생성

        //arr1 배열을 출력
        //배열명을 출력하면 이상한 값이 출력됨
            System.out.println(arr1);

        //배열을 선언과 생성을 동시에
        //정수 3개를 저장할 수 있는 배열 선언
        int[] num = new int[3];
        //문자 5개를 저장할 수 있는 배열 선언
        String[] str = new String[5];
        //실수 10개를 저장할 수 있는 배열 선언
        double[] dou = new double[10];


        int a; //변수의 선언
        a = 10; // 변수의 초기화
        //변수 선언 후 변수의 초기화가 필요함




    }
}
