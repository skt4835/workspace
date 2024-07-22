
-- 여러 테이블의 내용을 동시에 조회하기(JOIN 문법)
SELECT * FROM emp; -- 14
SELECT * FROM dept; -- 4

-- 사원번호, 사원명, 부서명을 조회
SELECT EMPNO, ENAME, DNAME
-- FROM 절에 여러 TABLE 명을 넣어서 조회 가능함
-- 이렇게 DATA 조회를하면 (EMP X DEPT) 두 테이블의 데이터 값만큼 곱해져서 출력됨.
-- 올바른 조회 방식이 아님.
FROM emp, dept;

-- EMP TABLE 에서 DEPTNO 확인 -> 20
-- DEPT TABLE 에서 DEPTNO가 20인 데이터 확인 -> 인사부
-- JOIN 문법 사용시 TABLE.COLUM

-- JOIN 조건 : 두 테이블이 공통으로 지니는 컬럼의 값이 같은 데이터만 조회
SELECT emp.EMPNO, emp.ENAME, dept.DNAME, emp.DEPTNO
FROM emp, dept
WHERE emp.DEPTNO = dept.DEPTNO;

-- 조인(JOIN) + 별칭(AS)
-- AS 가없어도 별칭이 적용됨
-- 별칭은 TABLE 에도 적용가능함.
-- TABLE에 별칭 적용할 때는 AS 키워드를 생략하고 써야함.
-- maria DB에서는 사용해도 됨, Oracle 에서는 오류 발생.
SELECT EMPNO 사원번호
	, ENAME AS 사원명
	, 사원.SAL
FROM emp 사원;

-- 사원번호, 사원명, 직급,  부서번호, 부서명, 부서의 지역 조회
SELECT EMPNO, ENAME, JOB, E.DEPTNO, DNAME, LOC
FROM emp E, dept D
WHERE E.DEPTNO = D.DEPTNO
AND JOB = '대리';

-- 조회 시 데이터를 정렬하여 조회하기
SELECT * FROM emp;

-- 사번, 사원명, 급여를 조회, 급여 기준 오름차순 정렬
SELECT EMPNO, ENAME, SAL
FROM emp
-- 정렬 기준은 ORDER BY 컬럼명 ASC or DESC
-- ASC - 오름차순 (생략가능)
-- DESC - 내림차순
-- 정렬은 가장 마지막에 작성!
ORDER BY SAL;

-- 부서번호가 30번이 아닌 사원들의
-- 사원명, 부서번호를 조회하되, 사원명 기준 내림차순으로 정렬
SELECT ENAME, DEPTNO
FROM emp
WHERE DEPTNO != 30
ORDER BY ENAME DESC;

-- 부서명이 인사부가 아니면서 급여가  300 이상인 사원들의
-- 사번, 사원명, 부서번호, 부서명, 급여를 조회하되
-- 부서번호 기준 오름차순으로 정렬
SELECT EMPNO, ENAME, E.DEPTNO, DNAME, SAL
FROM emp E, dept D
WHERE E.DEPTNO = D.DEPTNO
AND DNAME != '인사부'
AND SAL >= 300
ORDER BY DEPTNO ASC;

SELECT EMPNO, ENAME, JOB, SAL
FROM emp
ORDER BY JOB ASC, SAL ASC;