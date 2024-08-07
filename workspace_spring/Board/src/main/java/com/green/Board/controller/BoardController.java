package com.green.Board.controller;

import com.green.Board.service.BoardService;
import com.green.Board.service.BoardServiceImpl;
import com.green.Board.vo.BoardVO;
import com.green.Board.vo.PageVO;
import com.green.Board.vo.SearchVO;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/board")
public class BoardController {
    @Resource(name = "boardService")
    private BoardService boardService;

    //게시글 목록 조회
    @PostMapping("/list")
    public List<BoardVO> getBoardList(@RequestBody(required = false) SearchVO searchVO){
        log.info(searchVO.toString());

        //전체 게시글 수
        int totalDataCnt = boardService.getBoardCnt();


        //페이지 정보를 담을 수 있는 PageVO 객체 생성
        PageVO pageInfo = new PageVO(totalDataCnt);
        pageInfo.setPageInfo();

        return boardService.getBoardList(pageInfo);
    }

    //게시글 등록
    @PostMapping("/insert")
    public void insertBoard(@RequestBody BoardVO boardVO){
        log.info("=======  BoardController : insertBoard() run~ ==========");
        log.info(boardVO.toString());
        boardService.insertBoard(boardVO);
    }

    //게시글 상세 조회
    @GetMapping("/detail/{boardNum}")
    public BoardVO boardDetail(@PathVariable("boardNum") int boardNum){

        return boardService.getBoardDetail(boardNum);
    }

    //게시글 삭제
    @DeleteMapping("/delete/{boardNum}")
    public void deleteBoard(@PathVariable("boardNum") int boardNum){
        boardService.deleteBoard(boardNum);
    }

    //게시글 수정
    @PutMapping("/update")
    public void updateBoard(@RequestBody BoardVO boardVO){
        boardService.updateBoard(boardVO);
    }






}
