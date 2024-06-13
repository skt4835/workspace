package 상속;

//java 에서 다중 상속은 가능한가? (부모 클래스를 여러개 가질 수 있는가?)
// -> 문법적으로는 불가능, 논리적으로 가능
public class Grand {
    int a;
}

class parent1 extends Grand{
    int b;
}

class child1 extends parent1{
    int c;
}
