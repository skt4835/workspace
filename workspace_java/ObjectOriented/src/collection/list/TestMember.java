package collection.list;

import java.util.ArrayList;
import java.util.List;

public class TestMember {
    public static void main(String[] args) {
        List<Member> list = new ArrayList<>();

        Member m1 = new Member("java", "pa1", "kim", 23);
        Member m2 = new Member("python", "pas2", "park", 30);
        Member m3 = new Member("c++", "pa3", "lee", 34);

        list.add(m1);
        list.add(m2);
        list.add(m3);

        //6번
        for (Member e : list){
            System.out.println(e.toString());
        }

        System.out.println("--------------");

        //7번 List 에 저장된 모든 회원의 나이의 합
        int sum = 0;
        for (int i = 0; i < list.size(); i++){
            sum = sum + list.get(i).getAge();
        }
        System.out.println("나이의 합 : " + sum);

        //8번 list 에 저장된 회원 중 id가 java 인 회원을 지우는 코드
        int index = 0;
        for (int i = 0; i < list.size(); i++){
            if (list.get(i).getId().equals("java")){
                index = i;
            }
        }
        list.remove(index);
        System.out.println();
    }
}
