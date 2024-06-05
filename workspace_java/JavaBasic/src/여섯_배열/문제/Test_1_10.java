package 변수와자료형.여섯_배열.문제;

import java.util.Scanner;

public class Test_1_10 {
    public static void main(String[] args) {
        int[] arr = new int[5];

        for (int i = 0; i < arr.length; i++) {
            Scanner sc = new Scanner(System.in);
            System.out.print(i + "번째 요소 입력 : ");
            arr[i] = sc.nextInt();
        }

        System.out.println("배열에 저장된 요소");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        for (int e : arr){
            System.out.print(e + " ");
        }


    }
}
