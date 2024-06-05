package 변수와자료형.여섯_배열.문제_2;

public class Test_2_2 {
    public static void main(String[] args) {
        int[] arr = new int[100];
        int sum = 0;
        int x = 0;
        for (int i = 1; i < 101; i++){
            sum =+ i;
            if (sum/1==0){
                x++;
            }
        }
                System.out.println(x);
    }
}
