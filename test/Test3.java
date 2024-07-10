public class Test3 {
    public static void main(String[] args) {

        // 정수 {5, 11, 20, 40, 30}의 초기값을 갖는 배열을 생성하고,
        // 해당 배열에서 가장 큰 값과 가장 작은 값을 출력하시오.

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
