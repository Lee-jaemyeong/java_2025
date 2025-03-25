/*
1. 서브쿼리
- select 구문안에 select 구문
- 서브쿼리 결과가 하나 이상이 반환시 in, any, all 사용

2. 형식
select 컬럼 from 테이블명 where 컬럼 in (select 문);
 
*/
use mbasic;
create table sub_userinfo select *from userinfo;
desc sub_userinfo;
alter table sub_userinfo modify no int not null auto_increment primary key;
alter table sub_userinfo add (
	sex char(2),
    kor int,
    eng int,
    math int,
    ban char(2),
    sns char(2) default 'y'
    );
select *from sub_userinfo;
update sub_userinfo set kor=100,eng=100,math=99,ban='A',sns='n' where no=1;
update sub_userinfo set sex='m',kor=89,eng=92,math=78,ban='B',sns='y' where no=2;
update sub_userinfo set sex='m',kor=90,eng=92,math=97,ban='A',sns='y' where no=3;
update sub_userinfo set sex='f',kor=40,eng=42,math=67,ban='C',sns='n' where no=4;
update sub_userinfo set name='fifth',sex='f',kor=89,eng=86,math=99,ban='B',sns='y' where no=5;
update sub_userinfo set name='sixth',sex='m',kor=10,eng=20,math=44,ban='C',sns='n' where no=6;

#1-1. 평균나이 이상인 레코드를 추출하시오.
select *from sub_userinfo where age >= 평균나이;
#1-2. 평균나이
-- select avg(age) from sub_userinfo;
#1-3.  1+2
select *from sub_userinfo where age >= (select avg(age) from sub_userinfo);

#2-1
select *from sub_userinfo where ban = first반;
#2-2
select ban from sub_userinfo where name='first';
#2-3
select ban,name,kor,eng,math from sub_userinfo where ban = (select ban from sub_userinfo where name='first');

#3
select ban,avg(kor),avg(eng),avg(math) from sub_userinfo where ban = (select ban from sub_userinfo where name='first') group by ban;


## 연습문제 1~8

#Q1.
select sal from emp where ename ='JONES';

#Q2.
select *from emp where sal>2975;

#Q3.
select *from emp where sal > (select sal from emp where ename='JONES');

#Q4.
select *from emp where hiredate < (select hiredate from emp where ename='SCOTT');

#Q5.
select empno,ename,job,sal,e.deptno,dname,loc from emp e join dept d using(deptno) where e.deptno=20 and e.sal > (select avg(sal) from emp) order by empno desc;

#Q6.
select *from emp where deptno=20 or deptno=30;
select *from emp where deptno in (20,30);  --  ##

#Q7.
select deptno,max(sal) from emp group by deptno order by max(sal) desc;

#Q8.
-- 8-1.
-- select *from emp where sal in (각부서별 최고급여);
-- 8-2.
select max(sal) from emp group by deptno;
-- 8-3.
select *from emp where sal in (select max(sal) from emp group by deptno);

/*
1. 다중행 연산자
-  in, any(some), all
2. in : 서브쿼리의 결과가 하나라도 일치하면 true
3. any : 서브쿼리의 결과가 하나 이상이면 true
4. all : 서브쿼리의 결과가 모두 만족하면 true

2. any : 하나라도 일치하면 참 (선 한개)
컬럼명 < any(1,2,3) : 최대값보다 작다         ←←←|1   ←←|2   ←|3
컬럼명 < any(1,2,3) : 최소값보다 크다           1|→   2|→→  3|→→→

3. all : 모두가 일치하면 참 (선 3개)
컬럼명 < any(1,2,3) : 최소값보다 작다         ←←←|1   ←←|2   ←|3
컬럼명 < any(1,2,3) : 최대값보다 크다           1|→   2|→→  3|→→→
*/

create table atest as        select 1 num from dual
                   union all select 2     from dual
                   union all select 3     from dual
                   union all select 4     from dual
                   union all select 5     from dual
                   union all select 6     from dual;
                   
select *from atest;

select num from atest where num < any(select num from atest where num in(3,4,5)) order by num;
-- 최대값보다 작다 5보다 작다 → 1,2,3,4

select num from atest where num > any(select num from atest where num in(3,4,5)) order by num;
-- 최소값보다 크다 3보다 크다 → 4,5,6

select num from atest where num < all(select num from atest where num in(3,4,5)) order by num;
-- 최소값보다 작다(all #) 3보다 작다 → 1,2

select num from atest where num > all(select num from atest where num in(3,4,5)) order by num;  
-- 최대값보다 크다(all #) 5보다 크다 → 6    

#연습문제 9~13

#Q9.
select *from emp where sal = any(select max(sal) from emp group by deptno);

#Q10.
select *from emp where sal = some(select max(sal) from emp group by deptno);

#Q11.
select sal from emp where deptno=30; 

#Q12.
select *from emp where sal < any(select max(sal) from emp where deptno=30) order by sal asc;

#Q13.
select *from emp where sal > any(select min(sal) from emp where deptno=30) order by sal desc;
