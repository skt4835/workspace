package 변수와자료형.일곱_메소드;

public class Test_1_4_6 {
    public static void main(String[] args){
        test4("문자열");
        test5(1, 2);
        test6(3, 7, 9);

    }

    //4번 문제
    public static void test4(String text){
        System.out.println(text);
    }

    //5번 문제
    public static void test5(int x, int y){
        System.out.println(x + y);
    }

    //6번 문제
    public static void test6(int x, int y, int z){
        System.out.println(x * y * z);
    }
}
