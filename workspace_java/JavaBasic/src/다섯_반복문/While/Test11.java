package 변수와자료형.다섯_반복문.While;

public class Test11 {
    public static void main(String[] args) {
        int i = 1;
        int x = 0;
        while (i <= 100){
            if (i%3==0){
                x++;
            }
            i++;
        }
        System.out.println(x);
    }
}
