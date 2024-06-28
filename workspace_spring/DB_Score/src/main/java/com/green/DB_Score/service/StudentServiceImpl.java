package com.green.DB_Score.service;

import com.green.DB_Score.vo.StudentVO;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("StudentService")
public class StudentServiceImpl implements StudentService {
    @Autowired
    private SqlSessionTemplate sqlSession;


    @Override
    public List<StudentVO> getStuList() {
       List<StudentVO> list = sqlSession.selectList("scMapper.getStuList");
        return list;
    }

    @Override
    public void insert(StudentVO studentVO) {
        sqlSession.insert("scMapper.insert", studentVO);
    }

    @Override
    public StudentVO getDetail(int stuNum) {
        StudentVO stu = sqlSession.selectOne("scMapper.getDetail", stuNum);
        return stu;
    }

    @Override
    public int delete(int stuNum) {
        int delete = sqlSession.delete("scMapper.delete", stuNum);
        return delete;
    }

    @Override
    public int updateForm() {
        return 0;
    }

    @Override
    public void updateStudent(StudentVO studentVO) {
        sqlSession.update("scMapper.updateStudent", studentVO);
    }



}
