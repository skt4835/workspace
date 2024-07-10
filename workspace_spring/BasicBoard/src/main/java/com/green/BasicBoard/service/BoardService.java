package com.green.BasicBoard.service;

import com.green.BasicBoard.vo.BoardVO;
import com.green.BasicBoard.vo.SearchVO;

import java.util.List;

public interface BoardService {
   //글번호, 제목, 작성자, 작성일, 조회수 가져오기
   List<BoardVO> getBoardList(SearchVO searchVO);

   //게시글 등록
   void writeForm(BoardVO boardVO);

   //게시글 상세 조회
   BoardVO getDetail(int boardNum);

   //게시글 삭제
   void deleteBoard(int boardNum);

   //조회수 증가
   void updateReadCnt(int boardNum);
}
