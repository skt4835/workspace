package 변수와자료형.일곱_메소드;

//overloading
//메서드명은 원래 중복 불가! 하지만 매개변수의 정보가 다르면 중복 허용 <== 오버로딩
//매개변수 정보 : 매개변수의 자료형, 매개변수의 갯수
public class 메서드오버로딩 {
    public static void main(String[] args) {
        System.out.println("1123");
        println(1);
    }


    public static void println(){

    }
    //메서드 이름이 같아도 매개변수의 정보가 달라서 허용됨
    public static void println(int a){

    }
    //메서드 이름이 같아도 매개변수의 정보가 달라서 허용됨
    public static void println(String a){

    }
    //매개변수 이름이 같아도 다른 변수가 있어서 허용
    public static void println(String a, int b){

    }
}
