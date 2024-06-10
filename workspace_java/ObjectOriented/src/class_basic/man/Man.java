package class_basic.man;

public class Man {
    String name;
    int age;
    String address;

    public String getName(String name1){
        name = name1;
        return name;
    }

    public int getAge(int age1){
        age = age1;
        return age;
    }

    public String getAddress(String address1){
        address = address1;
        return address;
    }

    public void printMemberInfo(){
        System.out.println("이름 : " + name);
        System.out.println("나이 : " + age);
        System.out.println("주소 : " + address);
    }


}
