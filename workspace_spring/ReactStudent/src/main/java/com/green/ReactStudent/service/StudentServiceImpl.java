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

    @Override
    public StudentVO getDetail() {
        StudentVO detail = sqlSession.selectOne("studentMapper.detail");
        return detail;
    }
}
