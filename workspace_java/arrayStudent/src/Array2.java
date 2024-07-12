public class Array2 {
    public static void main(String[] args) {
        int[][] arr = new int[5][8];

//        System.out.println(arr[0][0]);
//
//        System.out.println(arr.length);
//        System.out.println(arr[0].length);



        for(int j = 0 ; j < arr.length ;j ++){
            for(int i = 0 ; i < arr[j].length ;i++){
                System.out.println(arr[j][i]);
            }
        }




    }
}
