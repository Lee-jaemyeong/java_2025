## ■ 1. order by + limit
/*
select      필드1.필드2
from        테이블명
where       조건식
order by    기준필드 [asc(1,2,3 오름차순) | desc (3,2,1 내림차순)]
limit       몇개
*/
-- 1-1 테이블준비
use mbasic;
show tables;
select *from select_userinfo;
delete from select_userinfo where no=7;

-- 1-2 정렬
select *from select_userinfo;

select *from select_userinfo order by age desc; -- 내림
select *from select_userinfo order by age asc;  -- 오름

-- 나이많은 3명
select *from select_userinfo order by age desc limit 3;
select *from select_userinfo order by age desc limit 2;

-- no가 높은순으로 4명
select *from select_userinfo order by no desc limit 4;

-- no가 두번째로 높은순으로 2명 limit 어디서부터, 몇개
select *from select_userinfo order by no desc limit 0,2; -- 6,5
select *from select_userinfo order by no desc limit 1,2; -- 5,4

-- 1-3 연습문제
#Q1.
select *from select_emp;
#Q2.
select *from select_emp where job='SALESMAN';
#Q3.
select ename,mgr,sal from select_emp;
#Q4.
select ename,mgr,sal from select_emp where job='SALESMAN';
#Q5.
select *from select_emp order by sal desc;
#Q6.
select *from select_emp order by job asc,sal desc;
#Q7.
select ename,sal,empno `select_empno` from select_emp where sal>=2000 order by select_empno desc;
#Q8.
select distinct job from select_emp;
#Q9.
select empno `사원번호`,ename `이름`,job `담당업무` from select_emp;
#Q10.
select *from select_emp order by sal asc;
#Q11.
select *from select_emp order by sal desc;
#Q12.
select *from select_emp order by depton asc,sal desc;
#Q13.
select empno`select_empLOYEE_NO`, ename `select_empLOYEE_NAME`,job,mgr `MANAGER` ,hiredate,sal `SALARY`,comm `COMMISSION`,depton `DEPARTMENT_NO`
from select_emp order by depton desc,ename asc;