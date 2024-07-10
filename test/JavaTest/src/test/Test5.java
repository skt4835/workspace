package test;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] input = new int[3];
        int strike = 0;
        int ball = 0;
        int[] array = new int[3];
        Random rand = new Random();

        for (int i = 0; i < 3; i++){ // 랜덤숫자 배열에 저장
            array[i] = rand.nextInt(9)+1;
            for (int j = 0; j < i; j++){
                if (array[j] == array[i]){
                    i--;
                        break;
                }
            }
        }






    }
}
