package 변수와자료형.다섯_반복문.While;

public class Test5 {
    public static void main(String[] args) {
        //1번 방법
        int i = 2;
        while (i <= 10){
            System.out.print(i + " ");
            i = i + 2;
        }
        System.out.println();
        //2번 방법
        int j = 2;
        while (j < 11){
            //j가 짝수일때만 출력
            if(j % 2 == 0){
                System.out.print(j + " ");
            }
            j++;
        }
    }
}
