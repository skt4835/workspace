package class_basic.Member;

public class Member1 {
    String name;
    String id;
    String password;
    int age;

    public Member1(){
        name = "김자바";
        id = "java";
        password = "12345";
        age = 30;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void displayInfo(){
        System.out.println("이름 : " + name);
        System.out.println("아이디 : " + id);
        System.out.println("비밀번호 : " + password);
        System.out.println("나이 : " + age);
    }
}
