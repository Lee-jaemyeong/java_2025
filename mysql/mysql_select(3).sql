## ■ 2. 집계함수
/*
select      필드1.필드2
from        테이블명
where       조건식
group by    그룹핑
having      조건식
order by    기준필드 [asc(1,2,3 오름차순) | desc (3,2,1 내림차순)]
limit       몇개

avg(컬럼명) 평균, max 최대값, min 최소값, sum 합계, count 갯수

*/

use mbasic;
create table group_userinfo select *from userinfo;
alter table group_userinfo modify no int not null auto_increment primary key;
desc group_userinfo;
select *from group_userinfo;

-- 2-1 테이블준비
alter table group_userinfo add sex char(2);
alter table group_userinfo add kor int;
alter table group_userinfo add eng int;
alter table group_userinfo add math int;
alter table group_userinfo add ban char(2);
alter table group_userinfo add sns char(2) default 'y';

update group_userinfo set sex=null,kor=100,eng=100,math=99,ban='A',sns='n' where no=1;
update group_userinfo set sex='m',kor=89,eng=92,math=78,ban='B',sns='y' where no=2;
update group_userinfo set sex='m',kor=90,eng=92,math=97,ban='A',sns='y' where no=3;
update group_userinfo set sex='f',kor=40,eng=42,math=67,ban='C',sns='n' where no=4;
update group_userinfo set name='fifth',sex='f',kor=89,eng=86,math=99,ban='B',sns='y' where no=5;
update group_userinfo set name='sixth',sex='m',kor=10,eng=20,math=44,ban='C',sns='n' where no=6;

-- 2-2 기본
select *from group_userinfo group by ban; -- 1
select @@sql_mode; -- 2
set SESSION sql_mode='STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION'; -- 3
select *from group_userinfo;
select *from group_userinfo group by ban; -- 4

-- 나이평균
select avg(age) from group_userinfo;

-- 반별 몇명있는지
select ban, count(*) from group_userinfo group by ban;

-- 반별 국, 영, 수의 총점 확인
select ban, sum(kor) `국어총합`, sum(eng) `영어총합` , sum(math) `수학총합` from group_userinfo group by ban;

-- 반별 국,영,수의 평균 확인
select ban, avg(kor)`국어평균` ,avg(eng)`영어평균` ,avg(math) `수학평균` from group_userinfo group by ban;

-- 반별 나이의 총합과 나이 평균 확인
select ban, sum(age)`나이총합`,avg(age)`나이평균` ,max(age)`최고나이`,min(age)`최저나이` from group_userinfo group by ban;

-- 반별 국영수의 평균 확인후 '국어'평균점수가 89이상인 데이터만 고르기
select ban, avg(kor) `국어평균` from group_userinfo group by ban having avg(kor) >= 89;

-- 반별 나이의 총합과 나이 평균 확인후 그중에서 나이의 평균이 35세 이상인 데이터 추출
select ban, sum(age) `나이총합`, avg(age) from group_userinfo group by ban having avg(age) >= 35;

-- 반별 나이의 초합과 나이 평균 확인후 그중에서 나이의 평균이 35세 이상인 데이터 추출 후 평균나이의 내림차순으로 정렬하시오
select ban, sum(age) `나이총합`, avg(age) from group_userinfo group by ban having avg(age) >= 35 order by avg(age) desc;

-- 2-3 연습문제
-- #1~10
desc emp;
select *from emp;

#1.
select sum(sal) `급여합계` from emp;

#2.
select sum(comm) `추가수당` from emp;

#3.
select sum(distinct sal), sum(all sal), sum(sal) from emp;

#4.
select count(*) `데이터갯수` from emp;
select count(empno) `데이터갯수` from emp; -- 모든필드가 값 다 있는 필드 14
select count(comm) `데이터갯수` from emp; -- null 값이 있는 필드는 제외 4

#5.
select count(depton) `부서30 직원수` from emp where depton=30;

#6.
select count(distinct sal),count(all sal),count(sal) from emp;

#7.
select count(comm) `추가수당을 받는 사원수` from emp;

#8.
select count(comm) `추가수당을 받는 사원수` from emp where comm is not null;

#9.
select max(sal) `부서10 최대급여` from emp where depton=10;

#10.
select min(sal) `부서10 최소급여` from emp where depton=10;

-- 11~20

#11.
select max(hiredate) `부서20 최근입사일` from emp where depton=20;

#12.
select min(hiredate) `부서20 제일 오래된 입사일` from emp where depton=20;

#13.
select avg(sal) `부서30 평균급여` from emp where depton=30;

#14.
select avg(distinct sal) `부서30 중복제거 평균급여` from emp where depton=30;

#15.
select depton, avg(sal) `평균급여` from emp group by depton order by depton asc;

#16.
select depton, job, avg(sal) `평균급여` from emp group by depton,job order by depton asc;

#17.
select depton,job,avg(sal) `평균급여` from emp group by depton,job having avg(sal) >=2000 order by depton asc;

#18. 오류나는 이유? 그룹핑에 부등식을 사용할 때에는 where이 아닌 having을 사용해야 하고 having의 위치는 group by 뒤에 와야한다.
select depton,job,avg(sal) from emp where avg(sal) >= 2000 group by depton,job order by depton,job;

#19.
select depton,job,avg(sal) `평균급여` from emp where sal<=3000 group by depton,job having avg(sal)>= 2000 order by depton asc;

#20.
select depton,job,count(job),max(sal) `최고급여`,sum(sal) `급여합`,avg(sal) `평균급여` from emp group by depton,job order by depton,job asc;
