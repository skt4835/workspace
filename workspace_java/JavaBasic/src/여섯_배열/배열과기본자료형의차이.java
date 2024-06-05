package 변수와자료형.여섯_배열;

public class 배열과기본자료형의차이 {
    public static void main(String[] args) {

        //모든 참조 자료형은 아래와 같이 적용됨
        //기본 자료형과 다름
        int[] a = {1,3,5};
        int[] b = a;
        a[0] = 10;
        b[2] = 50;

        for (int e : a){
            System.out.print(e + " ");
        }
        for (int e : b){
            System.out.print(e + " ");
        }

        //배열의 복사
        int[] c = {1, 2, 3};
        int[] d = c.clone();
    }
}
