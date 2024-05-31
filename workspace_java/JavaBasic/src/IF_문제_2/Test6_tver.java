package 변수와자료형.IF_문제_2;

import java.util.Scanner;

public class Test6_tver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x, y, z;
        int max, mid, min;

        System.out.print("첫 번째 수 : ");
        x = sc.nextInt();
        System.out.print("두 번째 수 : ");
        y = sc.nextInt();
        System.out.print("세 번째 수 : ");
        z = sc.nextInt();

        //x가 가장 큰 수라면..
        if(x > y && x > z){
            max = x;
            if(y > z){
                mid = y;
                min = z;
            }
            else {
                mid = z;
                min = y;
            }
        }

        //y가 가장 큰 수라면..
        else if (y > x && y > z){
            max = y;
            if(x > z){
                mid = x;
                min = z;
            }
            else {
                mid = z;
                min = x;
            }
        }
        //z가 가장 큰 수라면..
        else {
            max = z;
            if(x > y){
                mid = x;
                min = y;
            }
            else {
                mid = y;
                min = x;
            }
        }

        System.out.println(max + ">" + mid + ">" + min);

    }
}
