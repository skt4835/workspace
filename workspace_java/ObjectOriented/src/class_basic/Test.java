package class_basic;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        int[] n = new int[10];

        int sum = 0;
        for (int i = 0; i < n.length; i++){
            if (n[i] % 2 == 0){
                sum += n[i];
            }
        }
        System.out.println(sum);
    }
}
