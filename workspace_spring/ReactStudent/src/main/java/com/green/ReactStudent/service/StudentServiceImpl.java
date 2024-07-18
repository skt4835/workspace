package com.green.ReactStudent.service;

import com.green.ReactStudent.vo.StudentVO;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("StudentService")
public class StudentServiceImpl implements StudentService{
    @Autowired
    private SqlSessionTemplate sqlSession;


    //학생 정보 조회
    @Override
    public List<StudentVO> getStuInfo() {
        List<StudentVO> stuInfo = sqlSession.selectList("studentMapper.stuInfo");
        return stuInfo;
    }

    //학생 상세 정보 조회
    @Override
    public StudentVO getDetail(int stuNum) {
        StudentVO detail = sqlSession.selectOne("studentMapper.detail", stuNum);
        return detail;
    }

    //학생 정보 등록
    @Override
    public void insertStudent(StudentVO studentVO) {
        sqlSession.insert("studentMapper.regStu", studentVO);

    }

    @Override
    public void deleteStudent(int stuNum) {
        sqlSession.selectOne("studentMapper.delete", stuNum);
    }

    //학생 정보 삭제



}
