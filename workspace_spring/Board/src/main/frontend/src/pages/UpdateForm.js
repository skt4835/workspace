import React, { useEffect, useState } from 'react'
import * as boardApi from '../apis/boardApi';
import { useNavigate, useParams } from 'react-router-dom';

const UpdateForm = () => {
  const navigate = useNavigate();

  //url로 넘어오는 boardNum 값 받기
  const {boardNum} = useParams();

  //게시글 상세 정보를 저장할 state 변수
  const [boardDetail, setBoardDetail] = useState({});

  //게시글 수정 정보
  const [boardUpdate, setBoardUpdate] = useState({
    boardNum : boardNum,
    title : '',
    content : ''
  });

  function onChangeUpdateData(e){
    setBoardUpdate({
      ...boardUpdate,
      [e.target.name] : e.target.value
    })
  }

  //게시글 상세 정보 조회
  useEffect(() => {
    boardApi.getBoardDetail(boardNum)
    .then((res) => {
      setBoardDetail(res.data);

      // boardUpdate 변수의 값을 변경하는 함수
      // 게시글 상세 정보 조회 후 아래 값으로 boardUpdate에 저장
      setBoardUpdate({
        ...boardUpdate, // {}제거하고 안에 있는 내용을 변경할 때 사용
        title : res.data.title,
        content : res.data.content
    });
    })
    .catch((error) => {
      console.log(error)
    })
  }, []);

  //게시글 수정 쿼리 실행
  function updateBoard(){
    console.log(boardUpdate);
    boardApi.updateBoard(boardUpdate)
    .then((res) => {
      alert('수정 완료')
      setBoardUpdate(res.data);
      navigate(`/detail/${boardNum}`);
    })
    .catch((error) => {
      console.log(error)
    })
  }


  return (

    <div>
      <div>
        작성일 : {boardDetail.createDate}
      </div>
      <div>
        작성자 : {boardDetail.memId}
      </div>
      <div>
        제목 <input type='text' value={boardUpdate.title} name='title'
              onChange={(e) => {onChangeUpdateData(e)}}/>
      </div>
      <div>
        내용 <textarea value={boardUpdate.content} name='content'
              onChange={(e) => {onChangeUpdateData(e)}}></textarea> 
      </div>
      <div>
        <button type='button'>뒤로가기</button>
        <button type='button' onClick={(e) => {updateBoard()}} >수정</button>
      </div>
    </div>
  )
}

export default UpdateForm