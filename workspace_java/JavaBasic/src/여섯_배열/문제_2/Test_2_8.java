package 변수와자료형.여섯_배열.문제_2;

import java.util.Arrays;

public class Test_2_8 {
    public static void main(String[] args) {
        int[] lotto = new int[6];

        for (int i = 0; i < lotto.length; i++){
            lotto[i] = (int)(Math.random() * 45 + 1);
        }

        System.out.println(Arrays.toString(lotto));

//        // 0.0 <= x < 1.0 실수
//        int r = (int)(Math.random() * 45 + 1);

    }
}
