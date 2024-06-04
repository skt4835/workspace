package 변수와자료형.다섯_반복문.For;

import java.util.Scanner;

public class Test16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("정수 입력 : ");
        int num = sc.nextInt();

        int x = 0;
        for (int i = 1; i < num + 1; i++){
            if (i % 2 == 0){
                x++;
            }
        }
        System.out.println(x);
    }
}
