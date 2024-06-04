package 변수와자료형.다섯_반복문.For;

public class For_1 {
    public static void main(String[] args) {
//        int i = 1;
//
//        while (i < 11){
//            System.out.println(i);
//            i++;
//        }
        //--------------------------//
//        for(int i = 1; i <11; i++){
//            System.out.println(i);
//        }

        //1~10 까지 합
        int sum = 0;
        for (int i = 1; i < 11; i++){
            sum = sum + i;
        }
        System.out.println(sum);
    }
}
