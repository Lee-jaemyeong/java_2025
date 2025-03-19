use mbasic;

## part002) - select basic
create table select_userinfo select *from userinfo;
desc select_userinfo;
alter table select_userinfo modify no int not null auto_increment primary key;

insert into select_userinfo (name,age) values ('fifth',55);
insert into select_userinfo (name,age) values ('third',66);

##2-2 
-- 1. 전체 데이터 검색
select *from select_userinfo;

-- 2. 부분검색
select name,age from select_userinfo;

-- 3. 중복제거 (distinct)
select distinct name from select_userinfo;

-- 4. 별명
select name as `이름`, age `나이` from select_userinfo;

-- 5. where 조건 (= 같다, != <> 다르다, < <= > >=)
select *from select_userinfo where name = 'second';
select *from select_userinfo where name != 'second';
select *from select_userinfo where name <> 'second';

select *from select_userinfo where age < 33;
select *from select_userinfo where age <= 33;
select *from select_userinfo where age > 33;
select *from select_userinfo where age >= 33;

-- 6. 모든조건 - and , between and / 조건중에 - or , in
select *from select_userinfo where age>=22 and age<=33;
select *from select_userinfo where age between 22 and 33;

select *from select_userinfo where age=22 or age=33;
select *from select_userinfo where age in (22,33);

-- 7. null 검색 (is null , is not null , not in , not between)
desc select_userinfo;
alter table select_userinfo modify age int;

select *from select_userinfo;
insert into select_userinfo (name) values ('seven');

## null 값이 비워져있다라는 상태
select *from select_userinfo where age=null;  -- (X)
select *from select_userinfo where age!=null; -- (X)

select *from select_userinfo where age is null;
select *from select_userinfo where age is not null;

select *from select_userinfo where age not between 22 and 33;
select *from select_userinfo where age not in (22,33);

-- 8. like 문자열검색 ( like 'a%' , '%a' , '%a%' , '_a%' )
select *from select_userinfo where name = 'first';
select *from select_userinfo where name like 'f%'; -- f로 시작
select *from select_userinfo where name like '%t'; -- t로 끝남
select *from select_userinfo where name like '%i%'; -- i 포함
select *from select_userinfo where name like '_e%'; -- 두번째글자 e

#연습문제 1)
create table select_emp select *from emp;  -- 구조 + 데이터복사
alter table select_emp modify empno int not null auto_increment primary key;
desc select_emp;

#Q1.
select *from select_emp;

#Q2.
select *from select_emp where depton=30;

#Q3.
select *from select_emp where depton=30 and job='SALESMAN';

#Q4.
select *from select_emp where depton=30 or job='CLERK';

#Q5.
select *from select_emp where sal*12=36000;

#Q6.
select *from select_emp where sal>=3000;

#Q7.
select *from select_emp where ename >= 'F%'; 

#Q8.
select *from select_emp where ename <= 'FORD';

#Q9.
select *from select_emp where sal != 3000;

#Q10.
select *from select_emp where sal <> 3000;

## 11~20

#Q11.
select *from select_emp where not sal = 3000;

#Q12.
select *from select_emp where job='MANAGER' or job='SALESMAN' or job='CLERK';

#Q13.
select *from select_emp where job in ('MANAGER','SALESMAN','CLERK');

#Q14.
select *from select_emp where job != 'MANAGER' and job <> 'SALESMAN' and job != 'CLERK';

#Q15.
select *from select_emp where job not in ('MANAGER','SALESMAN','CLERK');

#Q16.
select *from select_emp where sal>=2000 and sal<=3000;

#Q17.
select *from select_emp where sal between 2000 and 3000;

#Q18.
select *from select_emp where sal not between 2000 and 3000;

#Q19.
select *from select_emp where not (sal >= 2000 and sal <= 3000);

#Q20.
select *from select_emp where empno=7499 and depton=30;

##21~30

#Q21.
select *from select_emp where depton=20 or job='SALESMAN';

#Q22.
select *from select_emp where sal>=2500 and job='ANALYST';

#Q23.
select *from select_emp where depton in (10,20);

#Q24.
select *from select_emp where depton not in (10,20);

#Q25.
select *from select_emp where ename like 'S%';

#Q26.
select *from select_emp where ename like '_L%';

#Q27.
select *from select_emp where ename like '%AM%';

#Q28.
select *from select_emp where ename not like '%AM%';

#Q29. 숫자 + null 계산안됨.
select ename `사원이름` , sal `급여` , sal*12+comm `연봉` , comm `커미션` from select_emp where ename like '%AM%'; 

#Q30.
select *from select_emp where comm = null; # X

## 31~40

#Q31.
select *from select_emp where comm is null;

#Q32.
select *from select_emp where mgr is not null;

#Q33. null 값없어요 상태
-- 1. 의미하는 바는? sal > null => null
-- 어떤 값인지 모르는 값에 =,> 등가비교연산자를 사용할 수 없음!
-- 선택된 행 없음
select *from select_emp where sal > null;

#Q34.
-- 1. 의미하는 바는? null  or true => true
select *from select_emp where sal > null -- null
or comm is null; -- 값 나옴 true

#Q35.
select *from select_emp where ename like '%S';

#Q36.
select empno,ename,job,sal,depton from select_emp where depton=30 and job = 'SALESMAN';

#Q37.
select empno,ename,job,sal,depton from select_emp where depton in (20,30) and sal > 2000;

#Q38.
select *from select_emp where sal<2000 or sal>3000;

#Q39.
select ename,empno,sal,depton from select_emp where depton=30 and ename like '%E%' and not (sal>=1000 and sal<=2000);

#Q40.
select *from select_emp where comm is null and mgr is not null and (job='MANAGER' or job='CLERK') and ename not like '_L%';
