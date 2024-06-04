package 변수와자료형.네번째_조건문;

import java.util.Scanner;

public class Switch_문제 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("첫 번째 수 : ");
        int x = sc.nextInt();
        System.out.print("두 번째 수 : ");
        int y = sc.nextInt();
        System.out.print("연산자 : ");
        String result = sc.next();

        if(result.equals("+")){
            System.out.println(x + result + y + "=" + (x + y));
        }
        else if(result.equals("*")){
            System.out.println(x + result + y + "=" + (x * y));
        }
        else if(result.equals("-")){
            System.out.println(x + result + y + "=" + (x - y));
        }
        else if(result.equals("/")){
            System.out.println(x + result + y + "=" + (x / (double)y));
        }
        else {
            System.out.println("연산자를 잘못 입력하셨습니다.");
        }




    }
}
