package com.green.BasicBoard.service;

import com.green.BasicBoard.vo.BoardVO;
import com.green.BasicBoard.vo.SearchVO;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("BoardService")
public class BoardServiceImpl implements BoardService{
    @Autowired
    private SqlSessionTemplate sqlSession;

    //게시글 목록 조회
    @Override
    public List<BoardVO> getBoardList(SearchVO searchVO) {
//        List<BoardVO> list = sqlSession.selectList("boardMapper.getBoardList");
//        return list;
        return sqlSession.selectList("boardMapper.getBoardList", searchVO);
    }

    //게시글 상세 조회
    @Override
    public void writeForm(BoardVO boardVO) {
        sqlSession.insert("boardMapper.writeForm", boardVO);
    }

    @Override
    public BoardVO getDetail(int boardNum) {
        BoardVO boardVO = sqlSession.selectOne("boardMapper.getDetail", boardNum);
        return boardVO;
    }

    //게시글 삭제
    @Override
    public void deleteBoard(int boardNum) {
        sqlSession.delete("boardMapper.deleteBoard", boardNum);

    }

    //게시글 조회수 증가
    @Override
    public void updateReadCnt(int boardNum) {
        sqlSession.update("boardMapper.getBoardReadCnt", boardNum);

    }


}
