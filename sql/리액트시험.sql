-- 자동차 정보 테이블 생성
CREATE TABLE CAR_INFO (
	MODEL_NUM INT AUTO_INCREMENT PRIMARY KEY
	, MODEL_NAME VARCHAR(30) NOT NULL
	, PRICE INT NOT NULL
	, MANU_COM VARCHAR(30) NOT NULL
);

-- 자동차판매 정보 테이블 생성
CREATE TABLE SALES_INFO (
	SALE_NUM INT AUTO_INCREMENT PRIMARY KEY
	, BUYER_NAME VARCHAR(20) NOT NULL
	, BUYER_TEL VARCHAR(30) NOT NULL
	, COLOR VARCHAR(10) NOT NULL
	, SALE_DATE DATETIME DEFAULT CURRENT_TIMESTAMP
	, MODEL_NUM INT NOT NULL REFERENCES CAR_INFO (MODEL_NUM) ON DELETE CASCADE
);

-- 테이블 생성 확인
SELECT * FROM CAR_INFO;
SELECT * FROM SALES_INFO;



