
-- 데이터베이스의 키(KEY) 종류
-- KEY : 데이터베이스에서 각 행을 구분하는 식별자를 의미
-- SUPER KEY : 하나의 행을 식별할 수 있는 하나 이상의 컬럼
-- CANDIDATE KEY (후보키) : 기본 키가 될 수 있는 후보
-- PRIMARY KEY = PK : 후보키 중에 각 행을 구분짓기 위해 결정한 키
-- ALTERNATE KEY (대체키) : 후보키 중에서 기본키를 제외한 키
-- FOREIGN KEY = FK (외래키) : 다른 테이블의 기본키로 사용되는 키

-- 로그인, 게시글, 댓글 관련 기능 포함 게시판 프로젝트
-- 테이블 : 회원정보, 게시글 번호, 댓글 정보

-- 회원정보
-- USER : 일반회원
-- ADMIN : 관리자
CREATE TABLE BOARD_MEMBER (
	MEM_ID VARCHAR(50) PRIMARY KEY
	,	MEM_PW VARCHAR(50) NOT NULL
	, 	MEM_NAME VARCHAR(50) NOT NULL
	,	GENDER VARCHAR(10) -- 'male', 'female'
	,	MEM_ROLE VARCHAR(20) DEFAULT 'USER'
);

-- 임시 회원 데이터
INSERT INTO board_member (MEM_ID, MEM_PW, MEM_NAME, GENDER, MEM_ROLE)
VALUES ('java', '1111', '김자바', 'male', 'USER');
INSERT INTO board_member (MEM_ID, MEM_PW, MEM_NAME, GENDER, MEM_ROLE)
VALUES ('admin', '1111', '관리자', 'female', 'ADIN');

SELECT * FROM board_member;


-- 게시판 (회원만 게시글 작성 가능)
CREATE TABLE BOARD(
	BOARD_NUM INT AUTO_INCREMENT PRIMARY KEY
	,	TITLE VARCHAR(50) NOT NULL
	,	CONTENT VARCHAR(100)
	,	MEM_ID VARCHAR(50) REFERENCES BOARD_MEMBER (MEM_ID) -- 외래키 성질(중요)
	, 	CREATE_DATE DATETIME DEFAULT CURRENT_TIMESTAMP
);

-- 게시글 임시데이터
INSERT INTO board (BOARD_NUM, TITLE, CONTENT, MEM_ID)
VALUES (1, '1번글','1번 내용', 'java');
INSERT INTO board (BOARD_NUM, TITLE, CONTENT, MEM_ID)
VALUES (2, '2번글','2번 내용', 'java');
INSERT INTO board (BOARD_NUM, TITLE, CONTENT, MEM_ID)
VALUES (3, '3번글','3번 내용', 'admin');

SELECT * FROM board;
DELETE FROM board;

-- 댓글 (회원만 가능)
CREATE TABLE BOARD_REPLY(
	REPLY_NUM INT AUTO_INCREMENT PRIMARY KEY
	,	REPLY_CONTENT VARCHAR(50) NOT NULL
	,	REPLY_DATE DATETIME DEFAULT CURRENT_TIMESTAMP
	, 	MEM_ID VARCHAR(50) REFERENCES BOARD_MEMBER (MEM_ID)
	, 	BOARD_NUM INT REFERENCES BOARD (BOARD_NUM)
);

SELECT * FROM board_reply;

-- 댓글 임시데이터
INSERT INTO board_reply (REPLY_CONTENT, MEM_ID, BOARD_NUM)
VALUES ('댓글1', 'java', 1);
INSERT INTO board_reply (REPLY_CONTENT, MEM_ID, BOARD_NUM)
VALUES ('댓글2', 'java', 2);
INSERT INTO board_reply (REPLY_CONTENT, MEM_ID, BOARD_NUM)
VALUES ('댓글3', 'java', 1);
INSERT INTO board_reply (REPLY_CONTENT, MEM_ID, BOARD_NUM)
VALUES ('댓글4', 'admin', 1);
INSERT INTO board_reply (REPLY_CONTENT, MEM_ID, BOARD_NUM)
VALUES ('댓글5', 'admin', 2);

-- 데이터 조회 연습
-- 회원의 이름이 '김자바'인 회원이 작성한 게시글의
-- 글번호, 제목, 작성자를 조회, 작성일 기준 최신글부터 조회(내림차순)

SELECT BOARD_NUM, TITLE, M.MEM_ID, MEM_NAME
FROM board_member M, board B
WHERE M.MEM_ID = B.MEM_ID
AND MEM_NAME = '김자바'
ORDER BY CREATE_DATE DESC;

-- 모든 게시글의 글번호, 글제목, 작성자 및 해당글에 작성된
-- 댓글의 댓글 내용, 댓글 작성자, 댓글 작성일을 조회
-- 게시글 번호 기준 최신순으로 정렬 후 
-- 같은 게시글에 대한 댓글은 가장 최근에 달린 댓글 순으로 조회

SELECT B.BOARD_NUM, TITLE, B.MEM_ID
	, REPLY_CONTENT, R.MEM_ID, REPLY_DATE
FROM board B, board_reply R
WHERE B.BOARD_NUM = R.BOARD_NUM
ORDER BY BOARD_NUM DESC, REPLY_NUM DESC;


-- 아이디 중복 여부를 확인하는 쿼리
SELECT MEM_ID
FROM board_member
WHERE MEM_ID ='java';


SELECT MEM_ID
FROM board_member
WHERE MEM_ID = 'java'
AND MEM_PW = '1111';


SELECT BOARD_NUM
	, TITLE
	, CONTENT
	, MEM_ID
	, CREATE_DATE
FROM board
WHERE BOARD_NUM = 1;

SELECT * FROM board_reply;

SELECT REPLY_NUM
	, REPLY_CONTENT
	, MEM_ID
	, REPLY_DATE
FROM board_reply
WHERE BOARD_NUM = 1;


SELECT * FROM board_member;
SELECT * FROM board;
SELECT * FROM board_reply;

-- 아이디가 'JAVA'인 회원이 작성한 게시글의
-- 글제목, 내용, 작성자ID, 작성자명, 작성자의 권한을 조회
SELECT TITLE, CONTENT, B.MEM_ID, M.MEM_NAME, M.MEM_ROLE
FROM board B, board_member M
WHERE B.MEM_ID = M.MEM_ID
AND B.MEM_ID = 'java';

-- 글번호가 5번 이하인 게시글의
-- 글번호, 제목, 글 작성자명을 조회하되
-- 글 번호 기준 오름차순으로 정렬

SELECT BOARD_NUM, TITLE, MEM_NAME
FROM board B, board_member M
WHERE B.MEM_ID = M.MEM_ID
AND BOARD_NUM <= 5
ORDER BY BOARD_NUM ASC;

-- 1번 게시글의 게시글 제목, 작성자 ID 및
-- 1번 게시글에 작성된 댓글내용, 댓글 작성자ID를 조회

SELECT TITLE, B.MEM_ID, REPLY_CONTENT, P.MEM_ID
FROM board B, board_reply P
WHERE B.MEM_ID = P.MEM_ID
AND B.BOARD_NUM = P.BOARD_NUM
AND B.BOARD_NUM = 1;

-- 1번 게시글의 게시글 제목, 작성자 ID 및
-- 1번 게시글에 작성된 댓글내용, 댓글 작성자ID, 댓글 작성자 이름 조회

SELECT TITLE, B.MEM_ID, REPLY_CONTENT, P.MEM_ID, MEM_NAME
FROM board B, board_reply P, board_member M
WHERE B.MEM_ID = P.MEM_ID = M.MEM_ID
AND B.BOARD_NUM = P.BOARD_NUM
AND B.BOARD_NUM = 1;

DROP TABLE TEST_ORDER;
DROP TABLE TEST_ITEM;

CREATE TABLE TEST_ITEM (
	ITEM_CODE INT AUTO_INCREMENT PRIMARY KEY
	, ITEM_NAME VARCHAR(30) NOT NULL
);
INSERT INTO TEST_ITEM VALUES (1, '상품1');
INSERT INTO TEST_ITEM VALUES (2, '상품2');
INSERT INTO TEST_ITEM VALUES (5, '상품3');
SELECT * FROM TEST_ITEM;

CREATE TABLE TEST_ORDER (
	ORDER_NUM INT AUTO_INCREMENT PRIMARY KEY
	, ORDER_BUYER VARCHAR(50) NOT NULL
	, ITEM_CODE INT NOT NULL REFERENCES TEST_ITEM (ITEM_CODE) ON DELETE CASCADE
	-- ON DELETE CASCADE : 
	-- REFERENCES 앞에 NOT NULL 제약조건 안하면 NULL 기입가능.
);
INSERT INTO TEST_ORDER VALUES (1, '김자바', 1);
INSERT INTO TEST_ORDER VALUES (2, '이자바', 1);
INSERT INTO TEST_ORDER VALUES (3, '박자바', 2);
INSERT INTO TEST_ORDER VALUES (4, 'RR', NULL); -- 외래키에 NOT NULL 제약조건 안넣을시 NULL 입력가능함.

SELECT * FROM TEST_ITEM;
SELECT * FROM TEST_ORDER;

-- DELETE FROM TEST_ORDER WHERE ITEM_CODE = 1;
DELETE FROM TEST_ITEM WHERE ITEM_CODE = 1;




SELECT * FROM board;
SELECT * FROM board_reply;

DELETE FROM board_reply
WHERE REPLY_NUM >= 20;

INSERT INTO board (
         TITLE
         , CONTENT
         , MEM_ID
     ) VALUES (
         'test1'
         , '11'
         , 'java'
     );
     
SELECT BOARD_NUM
   , TITLE
   , MEM_ID
   , CREATE_DATE
FROM board
ORDER BY BOARD_NUM DESC
LIMIT 5 OFFSET 5;

-- 테이블에 존재하는 데이터 갯수 조회 : COUNT
-- COUNT에는 PK값을 넣어주는게 보통임.
SELECT COUNT(BOARD_NUM)
FROM board;