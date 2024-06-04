package 변수와자료형.다섯_반복문.문제;

import java.util.Scanner;

//2. 키보드로 두 정수를 입력받아 입력받은 두 정수 사이의 모든 정수의 합을 출력하여라.
public class Test_2_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("첫 번째 정수 입력 : ");
        int x = sc.nextInt();
        System.out.print("두 번째 정수 입력 : ");
        int y = sc.nextInt();

        //큰 수, 작은 수 결정
        int max, min;
        if (x > y){
            max = x;
            min = y;
        }
        else {
            max = y;
            min = x;
        }

        // min = 1, max = 10  2~9까지의 합
        int sum = 0;
        for (int i = min + 1; i < max; i++){
            sum = sum + i;
        }
        System.out.println(sum);
    }
}
