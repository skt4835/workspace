package 변수와자료형.네번째_조건문;

/*
    switch case break
    switch(변수){
        case 값1 :
        case 값2 :
        case 값3 :
        case는 부합하는 변수부터 break만나기 전까지 출력함.
    }
 */

public class Case_1 {
    public static void main(String[] args){
        System.out.println("프로그램 시작");

        int num = 3;


        switch (num){
            case 1 : //num 값이 1일 때 실행 내용
                System.out.println(1);
                break; //break 문을 만나면 switch문 종료
            case 3 :
                System.out.println(3);
                break;
            case 5 :
                System.out.println(5);
                System.out.println(5);
                break;
            case 7 :
                System.out.println(7);
                break; //마지막에는 break를 사용하지 않음 (사용하는 의미없음)
            default : //그 밖에는
                System.out.println("해당 없음");
        }

        System.out.println("프로그램 종료");
    }
}
