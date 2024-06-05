package 변수와자료형.여섯_배열;

public class 향상된For {
    public static void main(String[] args) {
        //for-each문 : 배열에서 값을 읽을 때 사용
        int[] arr1 = {3, 7, 10, 5, 1};
        for(int i = 0; i < arr1.length; i++){
            System.out.println(arr1[i]);
        }

        System.out.println();

        //arr1 = {3, 7, 10, 5, 1}
        //왼쪽항 : 배열에서 데이터 하나씩 차례로 뺏을 때 저장할 변수
        //오른쪽항 : 반복할 배열 기입
        for(int e : arr1){
            System.out.println(e);
        }

        System.out.println();

        double[] arr2 = {1.1, 2.2, 3.3};
        for (double e : arr2){
            System.out.println(e);
        }

        System.out.println();

        String[] arr3 = {"a", "b", "c", "d"};
        for (String e : arr3){
            System.out.println(e);
        }
    }
}
