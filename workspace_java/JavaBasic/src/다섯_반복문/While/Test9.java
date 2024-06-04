package 변수와자료형.다섯_반복문.While;

public class Test9 {
    public static void main(String[] args) {
        int i = 1;
        int x = 0;

        while (i <= 10){
            x = x + i; // x += i;
            i++;
        }
        System.out.println(x);
    }

}
