package 변수와자료형.여섯_배열.문제;

public class Test_1_9 {
    public static void main(String[] args) {
        int[] arr = {1, 5, 7};
        int sum = 0;

        for (int i = 0; i < arr.length; i++){
            sum = sum+arr[i];
        }
        System.out.println(sum);
    }
}
