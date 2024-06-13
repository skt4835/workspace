package Static;

public class InitTest {
    public static void main(String[] args) {

        StaticInit i1 = new StaticInit();
        StaticInit i2 = new StaticInit();
        StaticInit i3 = new StaticInit();

        //static 변수를 읽고 사용하는 방법
        //객체명.변수명으로 static 변수도 사용가능함.
        System.out.println(i1.num);
        System.out.println(i2.num);

        //static 변수 및 메서드는
        //클래스명.변수명 으로 접근
        //이러한 접근 방법은 객체를 만들지 않아도 사용 가능
        System.out.println(StaticInit.num);

        /////////////////////////////////////////////////

        //객체명.메서드명
        Math.random();

        System.out.println();
        //println(); = overload 가 적용되어있음

    }
}
