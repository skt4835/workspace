package com.green.Start;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MemberController {

    //1. java 에서 html 로 데이터를 전달하기 위해서는
    //   실행되는 메서드의 매개변수의 model 인터페이스 객체를 선언
    //2. 객체명.addAttributes 메서드를 사용하여 데이터를 전달한다.
    @GetMapping("/main")
    public String goMain(Model model){
        model.addAttribute("name", "java");
        model.addAttribute("age", 10);
        return "main";
    }

    @GetMapping("/login")
    public String goLogin(Model model){
        String[] hobbies = {"독서", "운동","공부"};
        model.addAttribute("abc", hobbies);

        Member m = new Member("java", 20, 90);
        model.addAttribute("member", m);

        return "test_login";
    }

    @GetMapping("/join")
    public String goJoin(Model model){
        List<Member> list = new ArrayList<>();

        Member m1 = new Member("홍길동", 22, 90);
        Member m2 = new Member("이순신", 32, 85);
        Member m3 = new Member("장영실", 40, 95);

        list.add(m1);
        list.add(m2);
        list.add(m3);

        model.addAttribute("memberList", list);

        return "test_join";
    }
}
