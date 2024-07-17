package com.green.ReactStudent.service;

import com.green.ReactStudent.vo.StudentVO;

import java.util.List;

public interface StudentService {
    // 학생 정보 조회
    List<StudentVO> getStuInfo();

    StudentVO getDetail();

}
