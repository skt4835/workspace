
-- this is 주석
-- 하이픈 다음 무조건 한 칸 띄우기

-- 1일차. 데이터 조회 기본 SQL

-- 데이터 조회 문법 (대, 소문자 구분 x 대부분 대문자 사용함)
-- SELECT 조회할 열 FROM 테이블명 [WHERE 조건];

-- EMP 테이블의 사번, 이름, 급여정보를 조회하는 쿼리
-- F9 실행 = 현재 선택된 TAB의 모든 쿼리 실행
-- CTRL + F9 = 드래그 선택한 쿼리 실행
-- SHIFT + CTRL + F9 = 마우스 커서가 위치한 행의 쿼리만 실행
SELECT EMPNO, ENAME, SAL FROM emp;

-- EMP TABLE 의 모든 정보를 조회하는 쿼리문
SELECT * FROM emp;

-- 별칭 사용(컬럼명을 조회할 때 임의로 변경)
-- 별칭을 사용할때만 적용됨
SELECT EMPNO AS 사번 FROM emp;

-- 별칭 사용은 각각 지정하여 사용해야함. (AS는 띄워쓰기로 생략가능함)
SELECT EMPNO AS 사번, ENAME 사원명
FROM emp;

-- 조건에 맞는 데이터만 조회
-- 급여가 400 이상인 사원의 사번, 이름, 직급, 급여를 조회
-- 같다 : '=', 다르다 : '!=', '<>'
SELECT EMPNO, ENAME, JOB, SAL
FROM emp
WHERE SAL >= 600;

-- 급여가 600이하이고 지급은 사원인 사원들의
-- 사번, 이름, 직급, 급여를 조회
-- 그리고 : AND , 이거나(또는) : OR
-- 문자는 ''로 감싸야함
SELECT EMPNO, ENAME, JOB, SAL
FROM emp
WHERE SAL <= 600 AND JOB = '사원';

SELECT * FROM emp;

-- 커미션이 NULL인 사원의 사번, 사원명, 커미션을 조회
-- 조건에서 NULL 여부를 확인할 때는 주의 필요 '=' 사용X IS , IS NOT 사용함
SELECT EMPNO, ENAME, COMM
FROM emp
WHERE COMM IS NULL;
-- WHERE COMM IS NOT NULL;

-- 직급이 과장이 아닌 사원들 중 커미션을 받는 사원들의 
-- 사번, 이름, 직급, 커미션 정보를 조회
SELECT EMPNO, ENAME, JOB, COMM
FROM emp
WHERE JOB != '과장' 
AND COMM IS NOT NULL;

-- 부서번호가 30번이 아닌 사원중에서 급여가 700이하이고
-- 직급은 '사원'인 직원의 모든 정보를 조회
SELECT *
FROM emp
WHERE JOB = '사원' 
AND DEPTNO != 30;

-- 급여가 400이하이거나 700이상인 사원 중
-- 직급이 과장이면서 커미션은 NULL인 직원들의
-- 사번, 사원명, 급여, 직급, 커미션을 조회
-- 단, 커미션은 '인센티브'라는 별칭을 사용하여 조회한다.
SELECT EMPNO, ENAME, SAL, JOB, COMM 인센티브
FROM emp
WHERE (SAL <= 400 OR SAL >= 700)
AND JOB = '과장' 
AND COMM IS NULL;