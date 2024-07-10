package com.green.BasicBoard.controller;

import com.green.BasicBoard.service.BoardService;
import com.green.BasicBoard.service.BoardServiceImpl;
import com.green.BasicBoard.vo.BoardVO;
import com.green.BasicBoard.vo.SearchVO;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class BoardController {
    @Resource(name = "BoardService")
    private BoardServiceImpl boardService;

    //게시글 목록 이동
    //get,postMapping 둘다 필요할때 RequestMapping 사용하면됨
    @RequestMapping("/list")
    public String list(Model model, SearchVO searchVO){
        //searchVO 데이터 검사
        System.out.println(searchVO);


        // DB 에서 데이터 불러오기 (목록 조회)
        List<BoardVO> boardList = boardService.getBoardList(searchVO);
        model.addAttribute("boardList", boardList);
        return "/board_list";
    }

    //글쓰기 페이지로 이동
    @GetMapping("/write")
    public String write(){
        return "/write_form";
    }

    //글 작성 후 게시글 목록으로 이동
    @PostMapping("/writeForm")
    public String writeForm(BoardVO boardVO){
        boardService.writeForm(boardVO);
        return "redirect:/list";
    }

    //글 상세 화면으로 이동
    @GetMapping("/detail")
    public String detail(@RequestParam(name = "boardNum") int boardNum, Model model){
        //조회수 증가
        boardService.updateReadCnt(boardNum);

        BoardVO board = boardService.getDetail(boardNum);
        model.addAttribute("board", board);

        return "/board_detail";
    }

    //글 수정 페이지로 이동
    @GetMapping("/update")
    public String update(){
        return "/update_form";
    }

    //글 수정 후 상세 페이지로 이동
    @GetMapping("/writeUpdate")
    public String writeUpdate(){
        return "redirect:/detail";
    }

    //글 삭제 후 목록 페이지로 이동
    @GetMapping("/deleteBoard")
    public String delete(@RequestParam(name = "boardNum")int boardNum){
        boardService.deleteBoard(boardNum);
        return "redirect:/list";
    }


}
