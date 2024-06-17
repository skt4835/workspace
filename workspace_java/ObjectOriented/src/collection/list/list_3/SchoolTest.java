package collection.list.list_3;

import java.util.ArrayList;
import java.util.List;

public class SchoolTest {
    public static void main(String[] args) {
        //자바반에 소속될 학생 3명 생성
        Student s1 = new Student("java kim", 20, 80);
        Student s2 = new Student("java lee", 25, 70);
        Student s3 = new Student("java park", 30, 90);

        //자바반에 저장할 학생 list
        List<Student> studentList1 = new ArrayList<>();
        studentList1.add(s1);
        studentList1.add(s2);
        studentList1.add(s3);

        //자바반
        StudyClass javaClass = new StudyClass("자바반", "강사_자바", studentList1);

        //캐드반에 저장될 학생 3명생성
        Student s4 = new Student("cad kim", 25, 75);
        Student s5 = new Student("cad lee", 20, 95);
        Student s6 = new Student("cad park", 30, 85);

        //캐드반 학생들이 저장될 list 생성 및 해당 list 에 캐드반 학생 저장
        List<Student> studentList2 = new ArrayList<>();
        studentList2.add(s4);
        studentList2.add(s5);
        studentList2.add(s6);

        //캐드반 객체 생성 + 캐드반에 위에서 만든 캐드반 학생 목록 저장
        StudyClass cadClass = new StudyClass("캐드반", "강사_캐드", studentList2);

        //영상반에 저장될 학생 3명 생성
        Student s7 = new Student("media kim", 21, 78);
        Student s8 = new Student("media lee", 31, 98);
        Student s9 = new Student("media park", 27, 88);

        //영상반 학생들이 저장될 list 생성 및 해당 list 에 영상반 학생저장
        List<Student> studentList3 = new ArrayList<>();
        studentList3.add(s7);
        studentList3.add(s8);
        studentList3.add(s9);

        //영상반 객체 생성 + 영상반에 위에서 만든 영상반 학생 목록 저장
        StudyClass mediaClass = new StudyClass("영상반", "강사_영상", studentList3);

        //교실을 여러개 저장할 수 있는 list 생성
        List<StudyClass> classList = new ArrayList<>();
        classList.add(javaClass);
        classList.add(cadClass);
        classList.add(mediaClass);


        School school = new School(classList);

        //학교 안의 모든 학생의 정보 출력
        for (int i = 0; i < school.getClassList().size(); i++){
            for (int j = 0; j < school.getClassList().get(i).getStudentList().size(); j++){
                
            }
        }




    }
}
