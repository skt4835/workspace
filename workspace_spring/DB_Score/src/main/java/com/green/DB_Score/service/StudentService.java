package com.green.DB_Score.service;

import com.green.DB_Score.vo.StudentVO;

import java.util.List;

public interface StudentService {

    //학생정보등록 학번, 이름, 국어점수, 영어점수, 자기소개
    List<StudentVO> getStuList();

    void insert(StudentVO studentVO);

    StudentVO getDetail(int stuNum);

    //학생 삭제
    int delete(int stuNum);

    int updateForm();



    //학생 정보 수정
    void updateStudent(StudentVO studentVO);


}
