import javax.lang.model.util.ElementScanner6;
import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 세 정수를 Scanner 로 입력받아 큰 수부터 나열하여
        // 출력하는 프로그램을 작성하시오.
        // 단, 입력받는 세 수는 중복 값이 없다고 가정한다.

        System.out.print("첫 번째 정수 입력 : ");
        int num1 = sc.nextInt();
        System.out.print("두 번째 정수 입력 : ");
        int num2 = sc.nextInt();
        System.out.print("세 번째 정수 입력 : ");
        int num3 = sc.nextInt();

        // 큰 수 나열
        int max = 0;
        int mid = 0;
        int min = 0;

        // num1이 가장 큰 경우
        if (num1 >= num2 && num1 >= num3){
            max = num1;
            if (num2 >= num3){
                mid = num2;
                min = num3;
            } else {
                mid = num3;
                min = num2;
            }
        }

        // num2가 가장 큰 경우
        if (num2 >= num1 && num2 >= num3){
            max = num2;
            if (num1 >= num3){
                mid = num1;
                min = num3;
            } else {
                mid = num3;
                min = num1;
            }
        }

        //num3이 가장 큰 경우
        if (num3 >= num1 && num3 >= num2){
            max = num3;
            if (num1 >= num2){
                mid = num1;
                min = num2;
            } else {
                mid = num2;
                min = num1;
            }
        }

        // 출력
        System.out.println("입력받은 정수 나열 :" + max + " > " + mid + " > " + min);

    }
}
