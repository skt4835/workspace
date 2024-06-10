package class_basic.calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Calculator cal = new Calculator();

        System.out.print("첫 번째 수 : ");
        int x = sc.nextInt();
        System.out.print("두 번째 수 : ");
        int y = sc.nextInt();
        System.out.print("연산자 : ");
        String z = sc.next();

        //cal 객체의 x와 y를 키보드로 입력받은 값으로 변경
        cal.setNumber(x, y);

        if (z.equals("+")){
            System.out.println(x + " + " + y + " = " + cal.getPlus());
        }
        else if (z.equals("-")){
            System.out.println(x + " - " + y + " = " + cal.getMinus());
        }
        else if (z.equals("*")){
            System.out.println(x + " * " + y + " = " + cal.getMultiplication());
        }
        else if (z.equals("/")){
            System.out.println(x + " / " + y + " = " + cal.getDivision());
        }
        else {
            System.out.println("연산자 입력 오류");
        }

    }
}
