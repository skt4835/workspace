package test;

public class Test3 {
    public static void main(String[] args) {

        int[] array = {5, 11, 20, 40, 30};

        int max = 0;
        int min = array[0];

        for (int i = 0; i < array.length; i++){
            if (array[i] >= max){
                max = array[i];
            }
            if (array[i] <= min){
                min = array[i];
            }
        }
        System.out.println(max + " / " + min);
    }
}
