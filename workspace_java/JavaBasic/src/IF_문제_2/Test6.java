package 변수와자료형.IF_문제_2;

import java.util.Scanner;

public class Test6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("첫 번째 수 : ");
        int x = sc.nextInt();

        System.out.print("두 번째 수 : ");
        int y = sc.nextInt();

        System.out.print("세 번째 수 : ");
        int z = sc.nextInt();

        int max = x;
        if(y > max){
            max = y;
        }
        if(z > max){
            max = z;
        }
        System.out.println(y + " > " + z + " > " + x);
    }

}
