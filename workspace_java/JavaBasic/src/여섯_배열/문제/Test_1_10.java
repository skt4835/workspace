package 변수와자료형.여섯_배열.문제;

import java.util.Scanner;

public class Test_1_10 {
    public static void main(String[] args) {
        int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);
//        System.out.print("첫 번째 정수 : ");
//        int num1 = sc.nextInt();
//        System.out.print("두 번째 정수 : ");
//        int num2 = sc.nextInt();
//        System.out.print("세 번째 정수 : ");
//        int num3 = sc.nextInt();
//        System.out.print("네 번째 정수 : ");
//        int num4 = sc.nextInt();
//        System.out.print("다섯 번째 정수 : ");
//        int num5 = sc.nextInt();

//        arr[0] = num1;
//        arr[1] = num2;
//        arr[2] = num3;
//        arr[3] = num4;
//        arr[4] = num5;
//        for (int i = 0; i < arr.length; i++){
//            System.out.println("배열" + i + " : " + arr[i]);
//        }

        for (int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
            System.out.print(i+"배열" + " : " + arr[i]);
        }
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }


    }
}
