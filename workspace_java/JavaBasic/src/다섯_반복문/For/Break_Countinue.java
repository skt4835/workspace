package 변수와자료형.다섯_반복문.For;

public class Break_Countinue {
    public static void main(String[] args) {
        //반복문(while, for)에서의 break 역할
        //break문을 만나면 가장 가까이에 있는 반복문을 벗어남
        for (int i = 1; i < 11; i++){
            if(i == 5){
                break;
            }
            System.out.println(i);


        }

        System.out.println();

        //반복문(while, for)에서의 continue역할
        //continue를 만나는 순간 반복문의 끝으로 이동한다.
        //continue부터 반복문 끝 사이에 있는 내용 스킵 후 다음 반복진행함.
        for (int i = 1; i < 11; i++){
            if(i == 5){
                continue;
            }
            System.out.println(i);


        }



    }
}
