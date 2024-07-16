package test;

public class MathUtilImpl implements MathUtil{
    //매개변수로 받은 세 수의 합이 짝수이면서
    //동시에 5의 배수일 경우에만 리턴 true
    @Override
    public boolean isEven(int a, int b, int c) {
           int sum = a+b+c;
//        if (sum == sum / 2 && sum == sum % 5){
//            return true;
//        }
        return sum == sum / 2 && sum == sum % 5;

    }

    //1부터 매개변수로 받은 수까지의 합을 리턴
    @Override
    public int getSumFromOne(int num) {
        int sum = 0;
        for (int i = 1; i <= num; i++){
            sum += i;
        }

        return sum;
    }

    @Override
    public int getArraySum(int[] arr) {
        int sum = 0;

        for (int i = 0; i < arr.length; i++){
            sum += sum + i;
        }
        return sum;
    }
}
