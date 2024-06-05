package 변수와자료형.일곱_메소드;

public class Test_1_1_3 {
    public static void main(String[] args) {
        test1();
        test2_1();
        test2_2();
        test3(10);
    }

    //1번 메서드
    public static void test1(){
        System.out.println("안녕하세요");
    }

    //2번 메서드
    public static void test2_1(){
        System.out.print("반갑습니다" + " ");
    }
    public static void test2_2(){
        System.out.println("어서오세요");
    }

    //3번 메서드
    public static void test3(int x){
        System.out.println(x);
    }
}
