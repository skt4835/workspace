package com.green.DB_Score.controller;

import com.green.DB_Score.service.StudentService;
import com.green.DB_Score.service.StudentServiceImpl;
import com.green.DB_Score.vo.StudentVO;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class StudentController {
    @Resource(name = "StudentService")
    private StudentServiceImpl studentService;

    //학생정보목록 페이지 이동
    @GetMapping("/list")
    public String list(Model model){

        //학생 목록 데이터를 DB 에서 조회
        List<StudentVO> stuList = studentService.getStuList();
        model.addAttribute("stuList", stuList);
        return "/stu_list";
    }

    //학생등록 페이지로 이동
    @GetMapping("/reg")
    public String reg(){
        return "/reg_student";
    }

    //학생정보등록
    @PostMapping("/insert")
    public String insert(StudentVO studentVO){

        studentService.insert(studentVO);
        return "redirect:/list";
    }

    //학생상세페이지로 이동
    @GetMapping("/detail")
    //public String detail(StudentVO studentVO){
    public String detail(@RequestParam(name = "stuNum") int stuNum, Model model){

        //클릭한 학생 정보를 디비에서 조회
        //studentService.getDetail(studentVO.getStuNum());
        StudentVO stu = studentService.getDetail(stuNum);
        model.addAttribute("stu", stu);
        return "/student_detail";
    }

    //학생데이터 삭제
    @GetMapping("/delete")
    public String delete(@RequestParam(name = "stuNum") int stuNum){
        studentService.delete(stuNum);
        return "redirect:/list";
    }

    @GetMapping("/updateFrom")
    public String updateForm(@RequestParam(name = "stuNum") int stuNum, Model model){

        //정보를 수정할 학생을 조회
        StudentVO stu = studentService.getDetail(stuNum);
        model.addAttribute("student", stu);
        return "update_student";
    }

    //학생 정보 수정 + 상세 페이지 이동
    @PostMapping("/updateStudent")
    public String updateStudent(StudentVO studentVO){
        studentService.updateStudent(studentVO);


        return "redirect:/detail?stuNum=" + studentVO.getStuNum();
    }


}
