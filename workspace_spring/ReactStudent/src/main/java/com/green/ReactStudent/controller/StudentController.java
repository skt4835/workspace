package com.green.ReactStudent.controller;

import com.green.ReactStudent.service.StudentService;
import com.green.ReactStudent.vo.StudentVO;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/detail/{stuNum}")
    //학생정보 받아오는 메서드 (받을 학생의 번호)
    public StudentVO getDetail(@PathVariable("stuNum") int stuNum){
        // (받아온 학생 번호를 가진) stu~~디테잃을   return한다.
        return studentService.getDetail(stuNum);
    }

    //학생 정보 등록
    @PostMapping("/insertStudent")
    public void insertStudent(@RequestBody StudentVO studentVO){
        System.out.println(studentVO);
        studentService.insertStudent(studentVO);
    }

    //학생 정보 삭제
    @DeleteMapping("/delete/{stuNum}")
    public void deleteStudent(@PathVariable("stuNum") int stuNum){
         studentService.deleteStudent(stuNum);
    }

    //학생 성적 등록
    @PutMapping("/updateScore")
    public void updateScore(@RequestBody StudentVO studentVO){
        studentService.updateScore(studentVO);
    }
}
