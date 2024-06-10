package class_basic.car;

//접근제한자 : class, method, 멤버변수에서 사용.
//1. public : project 내에 존재하면 접근 가능
//2. default : 같은 package 내에 있으면 접근 가능
//3. protected : pass
//4. private : 변수, method 가 선언된 class 안에서만 접근 가능

//멤버변수에는 무조건 private
//메서드는 무조건 public
public class Phone {
    private int price;
    String modelName;

    //생성자
    public Phone(){
        this.price = 0;
        this.modelName = "";
    }

    public void setPrice(int price){
        if (price < 0){
            this.price = 0;
        }
        else {
            this.price = price;
        }
    }
}
