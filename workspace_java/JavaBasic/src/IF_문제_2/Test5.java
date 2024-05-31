package 변수와자료형.IF_문제_2;

import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max; // 큰 수를 저장
        int min; // 작은 수를 저장


        System.out.print("첫 번째 수 : ");
        int x = sc.nextInt();

        System.out.print("두 번째 수 : ");
        int y = sc.nextInt();

        if(x > y){
            max = x;
            min = y;
        }
        else {
            max = y;
            min = x;
        }
        System.out.println(max + " > " + min);

    }
}
