package 변수와자료형.여섯_배열.문제_2;

import java.util.Scanner;

public class Test_2_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 입력 : ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++){
            arr[i] = i + 1;
        }

        double sum = 0;
        for (int e : arr){
            sum += e;
        }

        System.out.print("배열의 평균 : " + sum / (double) n);

    }
}
