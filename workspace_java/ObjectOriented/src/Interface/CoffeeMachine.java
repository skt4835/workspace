package Interface;

//Machine interface 에 정의한 method 를 구현한 CoffeeMachine class 를 생성하겠다.
//인터페이스를 구현한 클래스는 멤버변수, 생성자 등 나머지 부분은 클래스와 동일하게 사용
public class CoffeeMachine implements Machine{
    public void takeCoffee(){
        System.out.println("커피가 나옵니다");
    }

    public void takeMilk(){
        System.out.println("우유가 나옵니다");
    }

}
