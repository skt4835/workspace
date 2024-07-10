-- 테이블 삭제 (데이터 삭제와 구분)
-- ROLLBACK, COMMIT 
DROP TABLE basic_board; -- 테이블 삭제 (실수로 날리면 복구 불가능함)
DELETE FROM basic_board; -- 데이터 삭제 (실수로 삭제시 ROLLBACK 으로 복원가능함)


-- 게시판 프로그램 테이블 생성
CREATE TABLE BASIC_BOARD(
	-- 컬럼명 데이터타입(=자료형) [제약조건들]
	-- PRIMARY KEY = 기본설정 (중복불가능하게 함)
	BOARD_NUM INT AUTO_INCREMENT PRIMARY KEY
	-- VARCHAR(글자 제한수 영/한 동일함)
	,	TITLE VARCHAR(50) NOT NULL
	,	WRITER VARCHAR(50) NOT NULL
	,	CONTENT VARCHAR(100)
	-- DATETIME 날짜와 시 분 초 까지나옴
	,	CREATE_DATE DATETIME DEFAULT CURRENT_TIMESTAMP
	,	READ_CNT INT DEFAULT 0
);

-- UNIQUE 는 NULL은 중복되어도 됨

INSERT INTO basic_board (TITLE, WRITER, CONTENT) 
VALUES ('1', '1', '1');

INSERT INTO basic_board (BOARD_NUM, TITLE, WRITER) 
VALUES (2, '제목', '작성자2');

SELECT * FROM basic_board;

INSERT INTO basic_board (BOARD_NUM, TITLE, WRITER, CONTENT, CREATE_DATE, READ_CNT)
VALUES (1, '', '작성자1', '내용1', '2024-07-01', 5);

INSERT INTO basic_board (BOARD_NUM, TITLE, WRITER, CONTENT, CREATE_DATE)
VALUES (4, '', '작성자3', '내용4', '2024-07-01');

INSERT INTO basic_board (BOARD_NUM, TITLE, WRITER, CONTENT, CREATE_DATE, READ_CNT)
VALUES (2, '제목', '작성자2', '내용2', '2024-07-01', 3);


SELECT BOARD_NUM
	, TITLE
	, WRITER
	, CREATE_DATE
	, READ_CNT
FROM basic_board
WHERE #{searchKeyword} LIKE '%안녕%';
WHERE WRITER LIKE '%JAVA%';