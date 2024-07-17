package com.green.ReactBoard.controller;

import com.green.ReactBoard.service.BoardService;
import com.green.ReactBoard.vo.BoardVO;
import jakarta.annotation.Resource;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//RestController 어노테이션이 붙은 클래스는 컨트롤러 역할을 한다.
//Controller 어노테이션과 다른 점
// 1. 해당 클래스의 리턴은 html 파일명이 아니다.
// 2. 리턴되는 것은 react로 만든 화면에 보여줄 데이터를 리턴한다.
// 3. 메서드의 리턴타입을 잘 지정해야 함!
@RestController
public class BoardController {
    @Resource(name = "boardService")
    private BoardService boardService;

    //게시글 목록 조회
    @GetMapping("/boardList")
    public List<BoardVO> getBoardList(){
        List<BoardVO> boardList = boardService.getBoardList();

        return boardList;
    }

    //상세 보기
    @GetMapping("/boardDetail/{boardNum}")
    public BoardVO getBoardDetail(@PathVariable("boardNum") int boardNum){
        return boardService.getBoardDetail(boardNum);
    }

    //글 등록
    @PostMapping("/regBoard")
    public void regBoard(@RequestBody BoardVO boardVO){
        System.out.println(boardVO);
        boardService.regBoard(boardVO);
    }

    //글 삭제
    @DeleteMapping("/deleteBoard/{boardNum}") //{변수명 기입}
    public void deleteBoard(@PathVariable("boardNum") int boardNum){
        boardService.deleteBoard(boardNum);

    }





}






