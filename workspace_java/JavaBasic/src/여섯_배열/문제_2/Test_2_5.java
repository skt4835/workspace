package 변수와자료형.여섯_배열.문제_2;

public class Test_2_5 {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        int[] newArr = new int[5];

        for (int i = 0; i < arr.length; i++){
            newArr[i] = arr[i];
        System.out.print(i + " ");
        }

        for (int e : newArr){
            System.out.println(e);
        }
    }
}
