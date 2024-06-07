package 변수와자료형.일곱_메소드;

import java.util.Arrays;

public class Test_3_1 {
    public static void main(String[] args) {
        Test1(3);
        Test2(3);
        System.out.println(Test3(1,50));
        Test4(3);
        int[] array = {1, 7, 5 ,3, 2};
        System.out.println(Test6(array));
        //int[] a = {2, 7, 33};
        //Test5(a);
        String[] ar = {"a", "b", "c"};
        String result = Test7(array);
        System.out.println(result);

        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] result1 = Test9(a);

        System.out.println(Arrays.toString(result1));
    }

    //Test9
    public static int[] Test9(int[] array){
        //매개변수로 넘어온 배열 요소 중 짝수의 개수
        int cnt = 0;
        for (int e : array){
            if (e % 2 == 0);
            cnt++;
        }
        //짝수만 저장된 배열 생성
        int[] resultArr = new int[cnt];
        int index = 0;
        for (int i = 0; i < array.length; i++){
            if(array[i] % 2 == 0){
                resultArr[index] = array[i];
                index++;
            }
        }
        return resultArr;
    }

    //Test8
    public static void Test8(){

    }

    //Test7
    public static String Test7(int[] array){
        String result = "";
        for (int i = 0; i < array.length; i++){
            result = result + array[i];
        }
        return result;
    }

    //Test6
    public static int Test6(int[] array) {
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        return max;
    }

    //Test5
    //정수형 배열을 매개변수로 받아
    //배열의 모든 요소를 출력하는 메소드를 만들고 호출하세요.
    public static void Test5(int[] arr){
        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }

    //Test4
    public static int Test4(int a){
        if (a % 2 == 0){
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
        return a;
    }

    //Test3
    public static double Test3(int x, int y){
        return (int)(Math.random() * (x + y)) + x;
    }

    //Test2
    public static void Test2(int a){
        for (int i = 1; i <= 100; i++){
            if (i % a == 0){
                System.out.println(i);
            }
        }
    }

    //Test1
    public static void Test1(int a){
        int[] x = new int[9];
        for (int i = 1; i <= x.length; i++){
            System.out.println(a + "*" + i + "=" + a*i);
        }
    }
}
