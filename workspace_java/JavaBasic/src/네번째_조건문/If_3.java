package 변수와자료형.네번째_조건문;

import java.util.Scanner;

public class If_3 {
    public static void main(String[] args) {
        //키보드로 정수 하나를 입력받아,
        //입력받은 수가 양수이면 '1'
        //음수이면 '2'
        // 0이면 '0' 출력

        Scanner sc = new Scanner(System.in);
        System.out.print("정수 입력 : ");
        int num = sc.nextInt();
        //만약에...
        if(num > 0){
            System.out.println(1);
        }
        //그렇지 않고 만약에...
        //else if 는 if문과 else문 사이 몇개든지 가능함
        else if(num < 0){
            System.out.println(2);
        }
        //그렇지 않으면...
        //위 조건문 외에 모든 조건이기에 한번만
        else {
            System.out.println(3);
        }
    }
}
