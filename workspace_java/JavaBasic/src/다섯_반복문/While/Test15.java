package 변수와자료형.다섯_반복문.While;

import java.util.Scanner;

public class Test15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 입력 : ");
        int i = sc.nextInt();
        int x = 1;
        int a = 0;

        while (x <= i){
           if (x % 2 == 0){
                a++;
           }
            x++;
        }
        System.out.println("짝수 의 개수 : " + a);
    }
}
