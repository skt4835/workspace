package class_basic.man;

public class ManTest {
    public static void main(String[] args) {
        Man m1 = new Man();

        m1.getName("김자바");
        m1.getAge(33);
        m1.getAddress("김주소");
        m1.printMemberInfo();
    }
}
