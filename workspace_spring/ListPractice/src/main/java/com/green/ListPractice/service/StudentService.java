package com.green.ListPractice.service;

import com.green.ListPractice.vo.StudentVO;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

//학생관리 프로그램의 핵심 기능을 정의
public class StudentService {
    //학생을 여러명 저장할 수 있는 통
    List<StudentVO> list = new ArrayList<>();

    //학생 목록 조회
    public List<StudentVO> getStuList(){
        return list;
    }

    //학생 등록
    public void regStuList(StudentVO studentVO){
        list.add(studentVO);
    }

    //학생 상세 조회
    public StudentVO getStuDetail(int num){
        //학번이 일치하는 학생을 저장할 공간.
        StudentVO findStudent = null;

        for (StudentVO studentVO : list){
            if (studentVO.getNum() == num){
                findStudent = studentVO;
            }
        }
        return findStudent;
    }


    //학생 삭제
    public void deleteStu(int num){
        //삭제를 위해서는 삭제할 학생의 index 번호 필요
        //index 를 알기위해서는 학번 데이터가 필요
        int index = 0;
        for (int i = 0; i < list.size(); i++){
            if (list.get(i).getNum() == num){
                index = i;
            }
        }
        list.remove(index);
    }

    //학생 정보 수정
    public void updateStu(StudentVO studentVO){
        //리스트에서 정보를 수정하고자 하는 학생을 찾아
        //그 학생의 정보를 input 태그 및 textarea 에서 입력한 정보로 변경한다.
        for (StudentVO student : list){
            if (student.getNum() == studentVO.getNum()){ //학번
                student.setName(studentVO.getName());
                student.setKorScore(studentVO.getKorScore());
                student.setEngScore(studentVO.getEngScore());
                student.setInfo(studentVO.getInfo());
            }
        }

    }

}
