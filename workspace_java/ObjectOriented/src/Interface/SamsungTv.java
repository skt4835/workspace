package Interface;

public class SamsungTv implements Tv {

    public void turnOn(){
        System.out.println("삼성티비 - 전원 켬");
    }

    public void turnOff(){
        System.out.println("삼성티비 - 전원 끔");
    }

    public void volumeDown(){
        System.out.println("삼성티비 - 소리 내림");
    }

    public void volumeUp(){
        System.out.println("삼성티비 - 소리 올림");
    }
}
