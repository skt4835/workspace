package Interface.student;

public class Student {
    private String name;
    private int KorScore;
    private int mathScore;
    private int engScore;

    public Student(String name, int korScore, int mathScore, int engScore) {
        this.name = name;
        this.KorScore = korScore;
        this.mathScore = mathScore;
        this.engScore = engScore;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getKorScore() {
        return KorScore;
    }

    public void setKorScore(int korScore) {
        KorScore = korScore;
    }

    public int getMathScore() {
        return mathScore;
    }

    public void setMathScore(int mathScore) {
        this.mathScore = mathScore;
    }

    public int getEngScore() {
        return engScore;
    }

    public void setEngScore(int engScore) {
        this.engScore = engScore;
    }
}
