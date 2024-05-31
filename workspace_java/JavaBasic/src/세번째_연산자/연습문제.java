package 세번째_연산자;

/*
키보드로 이름, 국어점수, 영어점수, 수학점수를 입력받는다.
단, 점수들은 정수만 입력한다고 가정한다.
모든 정보를 입력받은 후
입력받은 이름, 국어점수, 영어점수, 수학점수와 총점 및 평균을 출력.
 */

import java.util.Scanner;

public class 연습문제 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("이름을 입력해주세요");
        System.out.println("이름");
        String name = sc.next();

        System.out.println("점수를 입력해주세요");
        System.out.println("국어점수");
        int korea = sc.nextInt();
        System.out.println("영어점수");
        int english = sc.nextInt();
        System.out.println("수학점수");
        int math = sc.nextInt();

        System.out.println("당신의 이름은 " + name);
        System.out.println("국어점수는" + korea);
        System.out.println("영어점수는" + english);
        System.out.println("수학점수는" + math);
        System.out.println("총점은" + (korea + english + math) + "입니다.");
        int total = korea+english+math;
                double b = total/3.0;
        System.out.println("평균은" + (b) + "입니다.");




    }
}
