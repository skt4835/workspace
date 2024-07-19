package com.green.ReactStudent.service;

import com.green.ReactStudent.vo.StudentVO;

import java.util.List;

public interface StudentService {
    // 학생 정보 조회
    List<StudentVO> getStuInfo();

    // 학생 상세 조회
    StudentVO getDetail(int stuNum);

    //학생 정보 등록
    void insertStudent(StudentVO studentVO);

    //학생 정보 삭제
    void deleteStudent(int stuNum);

    //학생 성적 등록
    void updateScore(StudentVO studentVO);


}
