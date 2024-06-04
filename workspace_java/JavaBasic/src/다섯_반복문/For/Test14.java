package 변수와자료형.다섯_반복문.For;

public class Test14 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i < 101; i++){
            if (i % 5 == 0){
                System.out.println(i);
                sum++;
            }
        }
        System.out.println(sum);
    }
}
