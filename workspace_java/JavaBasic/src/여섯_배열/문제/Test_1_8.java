package 변수와자료형.여섯_배열.문제;

public class Test_1_8 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        int x = 1;

        for (int i = 0; i < arr.length; i++){
            arr[i] = x++;
            System.out.println(i + ":" + arr[i]);
        }
    }
}
