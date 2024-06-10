package class_basic.calculator;

import java.util.Scanner;

public class Calculator {
    private int x;
    private int y;

    //x, y 값을 변경하는 메서드
    public void setNumber(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getPlus(){
        return x + y;
    }

    public int getMinus(){
        return x - y;
    }

    public double getDivision(){
        return x / y;
    }

    public int getMultiplication(){
        return x * y;
    }
}
