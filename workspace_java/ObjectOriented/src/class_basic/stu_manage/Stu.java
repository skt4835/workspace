package class_basic.stu_manage;

public class Stu {
    private String name;
    private int age;
    private String grade;
    private String tell;

    public Stu(String name, int age, String grade, String tell) {
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.tell = tell;
    }

    //학생의 모든 정보를 출력
    public void showInfo(){
        System.out.println("이름 : " + name);
        System.out.println("나이 : " + age);
        System.out.println("학점 : " + grade);
        System.out.println("연락처 : " + tell);
    }
}
