package com.green.DataPractice.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ScoreController {

    @GetMapping("/stu")
    public String stu(){
        return "name";
    }

    @PostMapping("/info")
    public String info(Model model){
        model.addAttribute("name", name);
        return "info";
    }

    @PostMapping("/score")
    public String score(, Model model){
        model.addAttribute("name", name);
        return "score";
    }

    @PostMapping("/stuInfo")
    public String stuInfo(, Model model){
        model.addAttribute("name", name);
        return "stuInfo";
    }

}
