package com.green.DataPractice.Controller;


import com.green.DataPractice.vo.ScoreVO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.SortedMap;

@Controller
public class ScoreController {

    //시작 페이지로 이동
    @GetMapping("/first")
    public String first(){
        return "score_first";
    }

    //첫 번째 페이지에 넘오언 데이터 받아, 두 번째 페이지로 이동
    @PostMapping("/second")
    public String second(ScoreVO scoreVO){
        System.out.println(scoreVO);
        return "score_second";
    }

    //세 번째 페이지로 이동
    @PostMapping("/third")
    public String third(ScoreVO scoreVO){
        System.out.println(scoreVO);
        return "score_third";
    }

    //네 번째 페이지로 이동
    @PostMapping("/fourth")
    public String fourth(ScoreVO scoreVO, Model model){
        System.out.println(scoreVO);

        //평균
        double avg = (scoreVO.getKorScore() + scoreVO.getEngScore() + scoreVO.getMathScore()) / 3.0;
        model.addAttribute("avg", avg);
        return "score_fourth";
    }




}
