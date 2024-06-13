package 상속;

public class A {
    public int i;
    //protected 사용해도됨
    private int j;
    public void setJ(int n){
        j = n;
    }
    public int getJ(){
        return j;
    }
}

class B extends A {
    private int n;
    public void setN(int i){
        n = i;
    }

    public int getN(){
        return n;
    }
    public int getSum(){
        return n + i + getJ();
    }
}
