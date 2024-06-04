package 변수와자료형.다섯_반복문.While;

public class Test13 {
    public static void main(String[] args) {
        int i = 1;
        int x = 0;

        while (i <= 100){
            if (i % 5 == 0){
                System.out.println(i);
                x++;
            }
            i++;
        }
        System.out.println("5의 배수 개수 : " + x);
    }
}
