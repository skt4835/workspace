package com.green.BasicBoard.controller;

import com.green.BasicBoard.service.BoardServiceImpl;
import com.green.BasicBoard.vo.BoardVO;
import com.green.BasicBoard.vo.SearchVO;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ReactController {
    @Resource(name = "BoardService")
    private BoardServiceImpl boardService;

    //게시글 목록 이동
    //get,postMapping 둘다 필요할때 RequestMapping 사용하면됨
    @RequestMapping("/list1")
    public List<BoardVO> list(Model model, SearchVO searchVO){
        // DB 에서 데이터 불러오기 (목록 조회)
        List<BoardVO> boardList = boardService.getBoardList(searchVO);
        return boardList;
    }
}
