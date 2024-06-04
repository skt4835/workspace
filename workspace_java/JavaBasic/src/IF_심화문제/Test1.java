package 변수와자료형.IF_심화문제;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("첫 번째 변의 길이 : ");
        int x = sc.nextInt();
        System.out.println("두 번째 변의 길이 : ");
        int y = sc.nextInt();
        System.out.println("세 번째 변의 길이 : ");
        int z = sc.nextInt();

        if(x + y > z && y + z > x && x + z > y){
            System.out.println("삼각형 가능");
        }
        else {
            System.out.println("삼각형 불가능");
        }
    }
}
