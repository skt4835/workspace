package collection.list.list_3;

import java.util.ArrayList;
import java.util.List;

public class StudyClass {
    // 교실 이름 1개, 교사명 1명, 학생 여러명
    private List<Student> studentList;
    private String className;
    private String teacher;

    public List<Student> getStudentList(){
        return studentList;
    }

    public StudyClass(String className, String teacher, List<Student> studentList){
        this.className = className;
        this.teacher = teacher;
        this.studentList = studentList;
    }

    //1) 해당 반의 모든 학생의 모든 정보를 출력하는 기능
    public void printStuAll(){
        for (Student student : studentList){
            System.out.println(student);
        }
    }

    //2) 해당 반의 평균 성적을 리턴하는 기능
    //3) 해당 반에서 최고 성적을 지닌 학생을 리턴하는 기능
}
