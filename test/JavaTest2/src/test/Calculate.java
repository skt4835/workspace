package test;

public class Calculate {

    private int num1;
    private int num2;

    public void setNumber(int num1, int num2){
        this.num1 = num1;
        this.num2 = num2;
    }

    public int getSum() {
        return num1 + num2;
    }

    public int getMax() {
        return (num1 > num2) ? num1 : num2;
    }

    public double getAvg() {
        int length = Math.abs(num1 - num2) -1;
        int max = getMax();
        double sum = 0;

        if(length <= 0){
            return 0;
        }

        for (int i = 0; i <= length; i++){
            sum += (max - i);
        }
        return sum / length;
    }
}
