package 변수와자료형.여섯_배열.문제;

import java.util.SortedMap;

//4. 다음 소스에서 잘못된 부분은?
public class Test_1_4 {
    public static void main(String[] args) {
//        int[] arr = {1, 2, 3, 4, 5};
//        arr[arr.length] = 0;


        int[] arr = {1, 2, 3, 4, 5};
        arr[arr.length] = 5;

        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }

    }

}
