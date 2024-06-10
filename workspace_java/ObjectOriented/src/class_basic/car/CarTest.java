package class_basic.car;public class CarTest {
    public static void main(String[] args){
        Car c1 = new Car();

        //c1의 변수를 출력
        System.out.println(c1.brand);
        System.out.println(c1.price);

        //c1 변수의 값 변경
        c1.brand = "BMW";
        c1.price = 5080;

        System.out.println(c1.brand);
        System.out.println(c1.price);

        System.out.println();

        Car c2 = new Car();
        c2.printCarInto();
        System.out.println("------------");
        c2.setBrand("VOLVO");
        c2.setModelName("SC45");
        c2.setCarNumber("1567");
        c2.setPrice(4680);
        c2.printCarInto();
    }
}
