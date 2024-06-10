package class_basic;

import javax.crypto.interfaces.PBEKey;

//좋은 클래스의 여건
//1. 멤버변수는 반드시 초기값을 설정!
//2. 초기값 설정은 멤버변수의 선언과는 별도로 진행!

//생성자 : 선언한 변수의 값을 초기화할 용도로 사용
//문법
/*
    public 클래스명(){

    }
 */

//클래스 안에는 반드시 생성자가 존재해야 함!
//만약 클래스 안에 생성자를 하나도 선언하지 않았다면 눈에 보이지 않는
//기본 생성자를 자동으로 만들어 줌(내용과 매개변수가 없는 생성자)
//ex) public 클래스명(){
//생성자는 여러개 만들 수 있음


public class Account {
    String accNumber;
    String owner;
    int money; //예금액

    //생성자(변수의 초기화)
    //생성자의 이름은 클래스명과 똑같게 해야함
    public Account(){
        accNumber = "미정";
        owner = "미정";
        money = 10000;
    }

    public Account(int a){
        money = a;
    }

    //모든 변수의 값을 초기화하는 메서드 생성
    public void setAccount(String accNumber,
                           String owner,
                           int money){
        //이 클래스에서 선언한 accNumber
        this.accNumber = accNumber;
        this.owner = owner;
        this.money = money;
    }

    public void printAccount(){
        System.out.println("계좌번호 : " + accNumber);
        System.out.println("계좌주 : " + owner);
        System.out.println("예금액 : " + money);
    }


}
