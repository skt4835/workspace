package com.green.ReactStudent.controller;

import com.green.ReactStudent.service.StudentService;
import com.green.ReactStudent.vo.StudentVO;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {
    @Resource(name = "StudentService")
    private StudentService studentService;

    //학생 정보 조회 페이지
    @GetMapping("/getList")
    public List<StudentVO> getStuInfo(){
        List<StudentVO> stuInfo = studentService.getStuInfo();
        return stuInfo;
    }

    @GetMapping("/detail")
    public StudentVO getDetail(){

        return studentService.getDetail();
    }


}
