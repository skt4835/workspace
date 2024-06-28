package com.green.DB_Member.controller;

import com.green.DB_Member.service.DBService;
import com.green.DB_Member.service.DBServiceImpl;
import com.green.DB_Member.vo.MemberVO;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.naming.Name;
import java.util.List;

@Controller
public class DBController {
    @Resource(name = "dbService")
    private DBServiceImpl dbService;


    //회원번호가 1번인 회원의 이름을 조회
    @GetMapping("/select1")
    public String select1(){
        String name =  dbService.select1();
        System.out.println("조회한 이름 : " + name);
        return "db_result";
    }

    //전달된 회원번호를 지닌 회원의 나이를 조회
    @GetMapping("/select2")
    public String select2(){
        int age = dbService.select2(2);
        System.out.println("조회한 나이는 : " + age);
        return "db_result";
    }

    //전달받은 나이 이상의 회원의 이름을 조회
    @GetMapping("/select3")
    public String select3(){
        List<String> nameList = dbService.select3(40);
        for (String name : nameList){
            System.out.println("조회된 이름 : " + name);
        }

        return "db_result";
    }

    //전달받은 회원번호를 지닌 회원의 회원번호, 이름, 나이, 주소를 조회
    @GetMapping("/select4")
    public String select4(){
        MemberVO member = dbService.select4(2);
        System.out.println(member);
        return "db_result";
    }

    //모든 회원의 회원번호, 이름, 나이, 주소를 조회
    @GetMapping("/select5")
    public String select5(){
        List<MemberVO> list = dbService.select5();
        for (MemberVO member : list){
            System.out.println(member);
        }
        return "db_result";
    }

    //전달받은 회원번호를 가진 회원을 삭제
    @GetMapping("/delete")
    public String delete(){
        int result = dbService.delete(1);
        System.out.println("삭제한 행 개수 : " + result);
        return "db_result";
    }

    @GetMapping("/insert")
    public String insert(){
        MemberVO vo = new MemberVO();
        vo.setMemNum(987);
        vo.setMemName("python");
        vo.setMemAge(25);
        vo.setMemAddr("울산시");
        dbService.insert(vo);

        return "db_result";
    }

    //전달받은 회원번호를 지닌 회원의 이름, 나이, 주소를 변경
    @GetMapping("/update")
    public String update(){
        MemberVO vo = new MemberVO();
        vo.setMemNum(2);
        vo.setMemName("java");
        vo.setMemAge(30);
        vo.setMemAddr("서울시");

        int result = dbService.update(vo);
        System.out.println("업데이트 된 행 개수 : " + result);

        return "db_result";
    }
}
