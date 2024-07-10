package test;

import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("1 ~ 999 사이의 숫자를 입력해주세요 : ");
        int ranNum = sc.nextInt();

        if (ranNum < 0 || ranNum > 999){
            System.out.println("잘못된 입력입니다. 1 ~ 999 사이의 숫자를 입력해주세요");
            System.out.print("1 ~ 999 사이의 숫자를 입력해주세요 : ");
            ranNum = sc.nextInt();
        }

        if (ranNum >= 1 && ranNum <= 999){
            int num1 = ranNum / 100; // 100의 자리
            int num2 = (ranNum % 100) / 10; // 10의 자리
            int num3 = (ranNum % 100) % 10; // 1의 자리

            boolean handsClap = num3 == 3 || num3 == 6 || num3 == 9;
            boolean doubleHandsClap = num2 == 3 || num2 == 6 || num2 == 9;
            boolean tripleHandsClap = num1 == 3 || num1 == 6 || num1 == 9;

            if (handsClap && doubleHandsClap && tripleHandsClap){
                System.out.println("짝짝짝");
            } else if (doubleHandsClap || tripleHandsClap){
                System.out.println("짝짝");
            } else if (handsClap){
                System.out.println("짝");
            } else {
                System.out.println("박수 없음");
            }
        }

    }
}
