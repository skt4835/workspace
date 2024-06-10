package class_basic.Member;

import java.sql.SQLOutput;

public class Member {
    //회원정보 이름, 아이디, 비밀번호, 나이
    String name;
    String id;
    String password;
    String age;

    public void setMemberInfo(String name1, String id1, String password1, String age1){
        name = name1;
        id = id1;
        password = password1;
        age = age1;
    }

    public void printMemberInfo(){
        System.out.println("이름 : " + name);
        System.out.println("아이디 : " + id);
        System.out.println("비밀번호 : " + password);
        System.out.println("나이 : " + age);
    }


}
