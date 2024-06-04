package 변수와자료형.다섯_반복문.While;

public class While_3 {
    public static void main(String[] args) {
        //10부터 0까지 출력
        int i = 10;

        while (i >= 0);{
            System.out.println(i);
            i--;
        }
        //1부터 20까지의 수 중에서 홀수만 출력
        int e = 1;

        while (e <= 20);{
            System.out.println(e);
            e = e + 2;
        }

        //1부터 5까지의 수 중에서 짝수만 출력

        int a = 1;
        while (a <= 5){
            //짝수만 출력
            if(a % 2 == 0){
                System.out.println(i);
            }
            i++;
        }

    }
}
