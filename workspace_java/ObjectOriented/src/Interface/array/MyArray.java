package Interface.array;

public class MyArray implements MyArrayUtil{
    //매개변수로 받은 두 배열의 모든 요소의 평균을 리턴
    @Override
    public double getTwoArrayAvg(int[] arr1, int[] arr2) {
        for (int i = 0; i < arr1.length; i++){
            arr1[i] = i + 1;
        }
        for (int i = 0; i < arr2.length; i++){
            arr2[i] = i + 1;
        }
        double sum1 = 0;
        for (int e1 : arr1){
            sum1 += e1;
        }
        double sum2 = 0;
        for (int e2 : arr2){
            sum2 += e2;
        }
        double sum3 = sum1 + sum2;
        return sum3;
    }

    //매개변수로 받은 배열의 모든 요소가 짝수일 때만 리턴 true.
    @Override
    public boolean isEvenArray(int[] array) {
        for (int i = 0; i < array.length; i++){

        }
        return false;
    }
}
