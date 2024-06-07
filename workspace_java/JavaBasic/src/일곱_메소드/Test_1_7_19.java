package 변수와자료형.일곱_메소드;

import java.util.Scanner;

public class Test_1_7_19 {
    public static void main(String[] args){
//        test7(10, 3);
//        test8("java", "python");
//        test9_1("임꺽정");
//        test9_2(10);
//        test9_3("파리");
//        test10("임꺽정", 10, "파리");
        Scanner sc = new Scanner(System.in);
//        String name = sc.next();
//        int age = sc.nextInt();
//        String addr = sc.next();
//        test10(name, age, addr);
//        test14(10);
//        test15(10, 5);
//        test16(5);
//        test17(12,3);
//        test18(1, 34);
        test19("집에가자", 10);

    }
    //7번 문제
    public static void test7(int x, int y){
        System.out.println("몫 : " + x / y);
        System.out.println("나머지 : " + x % y);
    }
    //8번 문제
    public static void test8(String s1, String s2){
        System.out.println(s1 + s2);
    }

    //9번 문제
    public static void test9_1(String name){
        System.out.println(name);
    }
    public static void test9_2(int age){
        System.out.println(age);
    }
    public static void test9_3(String addr){
        System.out.println(addr);
    }

    //10번 문제
    public static void test10(String name, int age, String addr){
        test9_1(name);
        test9_2(age);
        test9_3(addr);

    }

    //14번 문제
    public static void test14(int num){
        if(num % 2 ==0) {
            System.out.println("짝수");
        }
            else{
            System.out.println("홀수");
        }

    //if else 문때 사용함
    System.out.println(num % 2 == 0 ? "짝수" : "홀수");
    }

    public static void test15(int a, int b){
        if(a % 2 == 0 && b % 2 == 0){
            System.out.println("둘 다 짝수");
        }
        else if(a % 2 != 0 && b % 2 != 0){
            System.out.println("둘 다 홀수");
        }
        else {
            System.out.println("하나만 짝수");
        }

    }

    //16번 문제
    public static void test16(int num){
        for (int i = 0; i < num + 1; i++){
            System.out.println(i);
        }
    }

    //17번 문제
    public static void test17(int a, int b){
        int max = a > b ? a : b;
        int min = a < b ? a : b;

        for (int i = min + 1; i < max; i++){
            System.out.println(i);
        }
    }

    //18번 문제
    public static void test18(int a, int b) {
        int max = a > b ? a : b;
        int min = a < b ? a : b;

        int cnt = 0;
        for (int i = min + 1; i < max; i++) {
            if (i % 5 == 0){
                cnt++;
            }
        }
        System.out.println(cnt);
    }

    //19번 문제
    public static void test19(String s, int num){
        String result = "";
        for (int i = 0; i < num; i++){
            result = result + s;
        }
        System.out.println(result);
    }
}
