package 변수와자료형.IF_심화문제;

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("1부터 99 사이의 정수를 입력하세요: ");
        int number = sc.nextInt();

        if (number >= 1 && number <= 99) {
            int digit1 = number % 10; // 일의 자리 숫자
            int digit10 = number / 10; // 십의 자리 숫자

            boolean hasClap = digit1 == 3 || digit1 == 6 || digit1 == 9;
            boolean hasDoubleClap = digit10 == 3 || digit10 == 6 || digit10 == 9;

            if (hasClap && hasDoubleClap) {
                System.out.println("박수짝짝");
            } else if (hasClap || hasDoubleClap) {
                System.out.println("박수짝");
            } else {
                System.out.println("박수 없음");
            }
        } else {
            System.out.println("잘못된 입력입니다. 1부터 99 사이의 정수를 입력하세요.");
        }


    }
}
