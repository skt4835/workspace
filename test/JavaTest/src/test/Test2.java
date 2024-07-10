package test;

import java.util.Arrays;

public class Test2 {
    public static void main(String[] args) {

        int[] Lotto = new int[6];

        for (int i = 0; i < Lotto.length; i++){
            Lotto[i] = (int)(Math.random() * 46);
        }

        System.out.print(Arrays.toString(Lotto));
    }
}
