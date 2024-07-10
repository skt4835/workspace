package com.green.AxiosTest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

//RestController : 컨트롤러 안의 메서드 리턴이 html 파일명이 아니다
// return 값이 데이터로 화면에 표기됨.
@RestController
public class AxiosController {

    @GetMapping("/test1")
    public String test1(){
        return "test1갸아아아아아아아악";
    }
    @GetMapping("/test2")
    public int test2(){
        return 110;
    }

    @GetMapping("/test3")
    public int[] test3(){
        int[] arr = {1, 2, 3, 4, 5};
        return arr;
    }

    @GetMapping("/test4")
    public List<ItemVO> test4(){
        //ItemVO 객체를 세 개 React 로 전달

        ItemVO item1 = new ItemVO(1, "처음 만나는 자바", 20000, "싫어요", "book_1.jpg");
        ItemVO item2 = new ItemVO(2, "디자인 패턴", 20000, "안돼요", "book_2.jpg");
        ItemVO item3 = new ItemVO(3, "모두의 마블", 20000, "하지마세요", "book_3.jpg");

        List<ItemVO> itemList = new ArrayList<>();
        itemList.add(item1);
        itemList.add(item2);
        itemList.add(item3);

        return itemList;
    }
}
