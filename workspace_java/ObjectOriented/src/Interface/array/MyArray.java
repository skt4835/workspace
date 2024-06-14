package Interface.array;

public class MyArray implements MyArrayUtil{
    //매개변수로 받은 두 배열의 모든 요소의 평균을 리턴
    @Override
    public double getTwoArrayAvg(int[] arr1, int[] arr2) {
        int sum1 = 0; //arr1배열의 합
        int sum2 = 0; //arr2배열의 합

        //arr1 배열의 합
        for (int i = 0; i < arr1.length; i++){
            sum1 = sum1 + arr1[i];
        }
        //arr2 배열의 합
        for (int i = 0; i < arr2.length; i++){
            sum2 = sum2 + arr2[i];
        }

        return (sum1 + sum2) / (double)(arr1.length + arr2.length);

//        for (int i = 0; i < arr1.length; i++){
//            arr1[i] = i + 1;
//        }
//        for (int i = 0; i < arr2.length; i++){
//            arr2[i] = i + 1;
//        }
//        double sum1 = 0;
//        for (int e1 : arr1){
//            sum1 += e1;
//        }
//        double sum2 = 0;
//        for (int e2 : arr2){
//            sum2 += e2;
//        }
//        double sum3 = sum1 + sum2;
//        return sum3;
    }

    //매개변수로 받은 배열의 모든 요소가 짝수일 때만 리턴 true.
    @Override
    public boolean isEvenArray(int[] array) {

        for (int e : array){
            if (e % 2 != 0){
                return false;
            }
        }
        return true;
    }
}
