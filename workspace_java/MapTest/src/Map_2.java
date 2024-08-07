import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Map_2 {
    public static void main(String[] args) {
        //학생 객체 3명 생성 후
        //3명의 학생을 map 에 저장하시오.
        //이때 키는 각 학생의 학번으로 지정합니다.
        Student s1 = new Student(1, "ja");
        Student s2 = new Student(2, "va");
        Student s3 = new Student(3, "ka");

        Map<Integer, Student> stuMap = new HashMap<>();
        stuMap.put(s1.getStuNum(), s1);
        stuMap.put(s2.getStuNum(), s2);
        stuMap.put(s3.getStuNum(), s3);

        // 키가 2번인 학생의 학생 이름 출력
        System.out.println(stuMap.get(2).getStuName());
    }
}
