
import React, { useEffect, useState } from 'react'
import * as boardApi from '../apis/boardApi'
import { useNavigate, useParams } from 'react-router-dom';
import * as replyApi from '../apis/replyApi'
import axios from 'axios';

const BoardDetail = ({loginInfo}) => {
  const navigate = useNavigate();
  //댓글 삭제 후 재렌더링을 위한 변수
  const [deleteState, setDeleteState] = useState({});

  const {boardNum} = useParams();

  //게시글 상세 정보를 저장할 변수
  const [boardDetail, setBoardDetail] = useState({});

  //댓글 목록을 저장할 변수
  const [replyList, setReplyList] = useState([]);

  //댓글 등록 시 가져가야 하는 데이터를 저장할 변수
  const [replyData, setReplyData] = useState({
    replyContent : '',
    memId : loginInfo.memId,
    boardNum : boardNum
  });
  
  //게시글 상세 정보 조회
  // useEffect(() => {
  //   boardApi.getBoardDetail(boardNum)
  //   .then((res) => {
  //     setBoardDetail(res.data);
  //   })
  //   .catch((error) => {
  //     console.log(error);
  //   });
  // }, []);

  // useEffect(() => {
  //   replyApi.getReplyList(boardNum)
  //   .then((res) => {
  //     setReplyList(res.data);
  //   })
  //   .catch((error) => {
  //     console.log(error);
  //   });
  // }, []);


  
  //db에서 데이터 조회 여러개 동시에 실행하기
  useEffect(() => {
    axios.all([
      boardApi.getBoardDetail(boardNum)
      , replyApi.getReplyList(boardNum)
    ]) 
    .then(axios.spread((res1, res2) => {
      setBoardDetail(res1.data);
      setReplyList(res2.data);
    }))
    .catch();
  }, [replyData]);


  function regReply(){
    axios.post('/reply/insert', replyData)
    .then((res) => {
      alert('댓글 등록 성공');
      //document.querySelector('input[type="text"]').value = ''; //속성 선택자

      //추가된 댓글이 화면에 바로 보이게 코드 작성 **
      setReplyData({
        ...replyData,
        replyContent : '',
        memId : loginInfo.memId
      });
    })
    .catch((error) => {
      console.log(error);
    });
  }

  function delReply(replyNum){
    axios.delete(`/reply/delete/${replyNum}`)
    .then((res) => {
      setDeleteState({});
    })
    .catch((error) => {
      console.log(error)
    });
  }

  function deleteBoard(boardNum){
    axios.delete(`/board/delete/${boardNum}`)
    .then((res) => {
      alert('게시글이 삭제 되었습니다.');
      navigate('/');
    })
    .catch((error) => {
      console.log(error)
    })
  }

  return (
    <div>
      <div>
        글번호 : {boardDetail.boardNum}<br />
        제목 : {boardDetail.title}<br />
        작성자 : {boardDetail.memId}<br />
        작성일 : {boardDetail.createDate}<br />
        내용 : {boardDetail.content}<br />
      </div>
      <div>
        <button type='button'>목록가기</button>
        {
          loginInfo.memRole == 'ADMIN' || loginInfo.memId == boardDetail.memId
          ?
          <>
            <button type='button' onClick={(e) => {navigate(`/updateForm/${boardDetail.boardNum}`)}} >수정</button>
            <button type='button' onClick={(e) => {deleteBoard(boardDetail.boardNum)}}>삭제</button>  
          </>
          :
          null
        }
      </div>

      {
        loginInfo.memId != null
        ?
        <div>
          <input value={replyData.replyContent} type='text' onChange={(e) => {
            setReplyData({
              ...replyData,
              replyContent : e.target.value
            });
          }} />
          <button type='button' onClick={(e) => {regReply()}}>댓글등록</button>  
        </div>
        :
        null
      }

      <div>
        {
          replyList.map((reply, i) => {
            return (
              <div key={i}>
                <div>{reply.replyDate}</div>
                <div>{reply.memId}</div>
                <div>{reply.replyContent}</div>
                <div><button type='button' onClick={() => {delReply(reply.replyNum)}}>삭제</button></div>
              </div>
            );
          })
        }
      </div>
    </div>
  )
}

export default BoardDetail