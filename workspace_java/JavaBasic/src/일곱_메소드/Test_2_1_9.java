package 변수와자료형.일곱_메소드;

import java.util.Scanner;

public class Test_2_1_9 {
    public static void main(String[] args) {
        System.out.println(Test1(10, 20));
        Scanner sc = new Scanner(System.in);
        System.out.print("첫 번째 정수 입력 : ");
        int x = sc.nextInt();
        System.out.print("두 번째 정수 입력 : ");
        int y = sc.nextInt();
        System.out.println(Test2(x, y));
        System.out.println(Test4("wk","qk"));
        System.out.println(Test5(75));
        System.out.println(Test7(10.6));
        System.out.println(Test8(10, 5, 3));
        System.out.println(Test9(5));
    }

    //9번 문제
    public static int Test9(int x){
        int sum = 0;
        for (int i = 1; i < x + 1; i++){
            if (i % 2 == 1){
                sum = sum + i;
            }
        }
        return sum;
    }

    //8번 문제
    public static double Test8(int a, int b, int c){
        return (a + b + c) / 3.0;
    }

    //7번 문제
    public static double Test7(double a){
        return a * a;
    }

    //6번 문제
    public static String Test6(int a){
        //정수 -> 문자열
        String bb = String.valueOf(10);

        //문자열 -> 정수
        int aa = Integer.parseInt("10");


        return a + "";
    }

    //5번 문제
    public static String Test5(int a){
       if (a >= 90){
           return "A";
       }
       else if (a >= 70){
           return "B";
       }
       else {
           return "C";
       }
    }

    //4번 문제
    public static String Test4(String a, String b){
        return a + b;
    }


    //3번 문제
    public static int Test3(int a, int b){
        return a > b ? a : b;
//        if (a > b){
//            return a;
//        }
//        else {
//            return b;
//        }
    }

    //2번 문제
    public static int Test2(int x, int y){
        return x*y;
    }

    //1번 문제
    public static int Test1(int a, int b){
        return a + b;
    }
}
