package Interface;

//interface 는 method 의 이름만 존재.
//멤버변수 X, 생성자 X
//생성자가 없기 때문에 인터페이스는 객체 생성 불가
//인터페이스는 클래스에 얹혀 살아야 됨.
//클래스에 인터페이스를 적용하는 문법(클래스 선언시 적용)
// public class ClassName implements InterfaceName
// 위의 코드를 해석하면
// ' interface 를 구현한 class 를 생성하겠다.
//인터페이스 안의 추상메서드는 public을 생략하면
//인터페이스를 구현한 클래스의 생성자로 인터페이스 객체 생성
public interface Machine {

    public void takeCoffee();
    public void takeMilk();

}
