# 데이터베이스언어 ★
# DDL - create, alter, drop 
# DML - insert, select #, update, delete
# DCL - grant, revoke

# e(entity:테이블)r(relation:관계) 속성(d) : pk, fk
# join  ★
-- 두개이상의 테이블들을 연결해서 데이터를 조회하는 방법
-- 테이블간의 연결고리 (pk, fk)

# 종류 : inner join, outer join
use mbasic;

create table join_userinfo select *from userinfo;
set sql_safe_updates=0;
delete from join_userinfo where no>=5;
desc join_userinfo;
select *from join_userinfo;
desc join_userban;
select *from join_userban;

#Q1.
# >>> (1) = join
# Error Code: 1052. Column 'no' in field list is ambiguous
select a.no, a.name, a.age, b.ban from join_userinfo a ,join_userban b where a.no = b.no;

# >>> (2) join on
select a.no, a.name, a.age, b.ban from join_userinfo a join join_userban b on (a.no = b.no);

# >>> (3) join using : 연결하는 변수의 이름이 같을 때
select a.no, a.name, a.age, b.ban from join_userinfo a join join_userban b using(no);

# >>> (4) natural join - 알아서 join 연결할 부위 찾아서 연결해줌
select no, name, age, ban from join_userinfo natural join join_userban;

#Q2.
# >>> (1) = join
select a.no, a.name, a.age, b.ban from join_userinfo a ,join_userban b where a.no = b.no and age between 20 and 40;

# >>> (2) join on
select a.no, a.name, a.age, b.ban from join_userinfo a join join_userban b on (a.no = b.no) where age between 20 and 40;

# >>> (3) join using
select a.no, a.name, a.age, b.ban from join_userinfo a join join_userban b using(no) where age between 20 and 40;

# >>> (4) natural join
select no,name,age,ban from join_userinfo natural join join_userban where age between 20 and 40;

#Q3. outer join
## right join은 오른쪽 값 보장
## left join 은 왼쪽 값 보장
select a.no, a.name, a.age, b.ban from join_userban b left join join_userinfo a on(a.no=b.no);

#Q4.
## right join
select b.no, b.name, b.ban, a.age from join_userinfo a right join join_userban b on(a.no=b.no);

## left join
select b.no, b.name, b.ban, a.age from join_userban b left join join_userinfo a on(a.no=b.no);

## 연습문제 1~10

#Q1.
select 	*from emp,dept order by empno;

#Q2.
select 	*from emp e,dept d where e.deptno=d.deptno;

#Q3.
select *from emp e join dept d on (e.depton=d.deptno); 

#Q4. Error Code: 1052. Column 'deptno' in field list is ambiguous
select empno,ename,deptno,dname,loc from emp e,dept d where e.deptno = d.deptno;

#Q5.
select e.empno,e.ename,d.deptno,d.dname,d.loc from emp e,dept d where e.deptno = d.deptno;

#Q6.
select e.empno,e.ename,e.sal,d.deptno,d.dname,d.loc from emp e join dept d using(deptno) where sal>=3000;

#Q7.
select *from emp e natural join salgrade s where e.sal between s.losal and s.hisal order by s.grade asc,e.sal asc;

#Q8. 
-- emp1 사원정보, emp2 매니저정보, salgrade 급여정보
-- 사원정보의 mgr = 매니저정보 empno, 사원정보의 최대, 최소값
-- 정렬 매니저정보의 사원번호기준으로 오름차순
select e.empno,e.ename,e.mgr,m.empno `mgr_empno`,m.ename `mgr_ename` from emp e,emp m,salgrade s where e.mgr = m.empno and e.sal between s.losal and s.hisal order by mgr asc;

#Q9.
select e.empno,e.ename,e.mgr,m.empno `mgr_empno`,m.ename `mgr_ename` from emp e left join emp m on(e.mgr = m.empno),salgrade s  where e.sal between s.losal and s.hisal order by empno asc;

#Q10.
select e.empno,e.ename,e.mgr,m.empno `mgr_empno`,m.ename `mgr_ename` from emp e right join emp m on(e.mgr = m.empno) order by e.empno asc;

# 11 ~ 20

#Q11.
select empno,ename,job,mgr,hiredate,sal,comm,deptno,dname,loc from emp natural join dept order by deptno;

#Q12.
select empno,ename,job,mgr,hiredate,sal,comm,deptno,dname,loc from emp join dept using(deptno) where sal >=3000 order by deptno;

#Q13.
select empno,ename,job,mgr,hiredate,sal,comm,e.deptno,dname,loc from emp e join dept d on(e.deptno=d.deptno) where sal<=3000 order by deptno;

#Q14.
select e.deptno,dname,empno,ename,sal from emp e,dept d where e.deptno=d.deptno and sal>2000;

#Q15.
select e.deptno,dname,empno,ename,sal from emp e natural join dept d where sal>2000;

#Q16.
select e.deptno,dname,avg(sal)`avg_sal`,max(sal)`max_sal`,min(sal)`min_sal`,count(dname) from emp e,dept d where e.deptno=d.deptno group by e.deptno,dname order by deptno asc; 

#Q17.
select e.deptno,dname,avg(sal)`avg_sal`,max(sal)`max_sal`,min(sal)`min_sal`,count(dname) from emp e join dept d using(deptno) group by e.deptno,dname order by deptno asc;

#Q18.
select deptno,dname,empno,ename,job,sal from dept left join emp using(deptno) order by deptno;

#Q19.
select deptno,dname,empno,ename,job,sal from emp right join dept using(deptno) order by deptno;

#Q20.
select d.deptno,d.dname,e.empno,e.ename,e.mgr,e.sal,e.deptno,s.losal,s.hisal,s.grade,m.empno`MGR_EMPNO`,m.ename`MGR_ENAME`
from emp e right join dept d on(e.deptno=d.deptno) left join salgrade s on(e.sal between s.losal and s.hisal) left join emp m on(e.mgr=m.empno)
order by d.deptno asc,e.empno;