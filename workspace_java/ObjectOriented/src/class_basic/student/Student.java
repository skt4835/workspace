package class_basic.student;

//setter : 멤버변수 각각의 값을 변경하는 메서드
//setter 의 이름은 set + 변수명 으로 반드시 지정
//이름을 변경하는 메서드
//getter : 멤버변수 각각의 값을 return 받는 메서드
//getter 의 이름은 get + 변수명으로 반드시 지정
//이름을 리턴하는 메서드
public class Student {
    private String name;
    private int age;
    private String address;
    private int studentNumber;
    private int number;

    public Student(String name,
                   int age,
                   String address,
                   int studentNumber,
                   int number){
        this.name = name;
        this.age = age;
        this.address = address;
        this.studentNumber = studentNumber;
        this. number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(int studentNumber) {
        this.studentNumber = studentNumber;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void printStudentInfo(){
        System.out.println("이름 : " + name);
        System.out.println("나이 : " + age);
        System.out.println("주소 : " + address);
        System.out.println("학번 : " + studentNumber);
        System.out.println("연락처 : " + number);
    }
}
