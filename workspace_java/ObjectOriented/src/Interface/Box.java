package Interface;

//무엇이든 넣고 뺄 수 있는 만능 박스
public class Box {
    Object str;

    // 매개변수가 Object 로 오면 모든 클래스를 받을 수 있다.
    public void setBox(Object str){
        this.str = str;
    }

    public Object getBox(){
        return str;
    }

}
