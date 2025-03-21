use mbasic;

# ■ function
#1. Number
#2. String
#3. Date
#4. if / case

/*
-------------------------------------------------------------
#1. Number ( ceil 올림, floor 내림, round 반올림, mod 나머지 )
-------------------------------------------------------------
*/

--           2                  1                2
select ceil(1.1) `올림` , floor(1.9) `내림`, round(1.5) `반올림`, mod(10,3) `나머지`;

-- 연습문제
#Q1.
select 123.4578, round(123.4578) `ROUND1` , round(123.4578 , -1) `ROUND2` , round(123.4578 , 1) `ROUND3` , round(123.4578 , 2) `ROUND4`;

#Q2.
select 123.4578, ceil(123.4578) `CEIL` , floor(123.4578) `FLOOR`;


-------------------------------------------------------------
#2. String 
-------------------------------------------------------------


-- 2-1. basic
-- 1) length(문자열) 갯수
select length('abc');

-- 2) upper 대문자 / lower 소문자
select 'abc' , upper('abc') , lower('abc');

-- 3) instr 위치
select instr('abc' , 'b') `b의 위치` , instr('abc' , 'ab') `ab의 위치` , instr('abc' , 'ac') `ac의 위치`; 

-- 4) left(문자열, 몇개), right, substr(문자열, 시작, 몇개)  문자열 일부분
select left('abc',1) , left('abc',2) , right('abc',1) , right('abc',2); -- a, ab, c, bc
select substr('abcde',2,2) `bc` , substr('abcde',2,3) `bcd` , substr('abcde',1,3) `abc`;

-- 5) 문자열연결 concat(문자열1, 문자열2)
select concat('hello  ','mysql') `hello  mysql`;

-- 6) trim
select trim(' a b c ') `a b c`;

select concat( '#' , trim(' a b c ') , '#')  `#a b c#`
	  ,concat( '#' , ltrim(' a b c ') , '#')  `#a b c #`
      ,concat( '#' , rtrim(' a b c ') , '#')  `# a b c#` ; 
      
-- 7) replace(문자열에서, 찾아서, 바꾸기)
select replace("hello sally" , "sally" , "alpha") `hello alpha`;

-- 8) repeat(뭐를, 몇개반복)
select repeat('*',5) `*****`;

-- 9) 빈칸채우기 lpad , rpad
select lpad('abc' , 10 , '#')
	  ,rpad('abc' , 10 , '#') ;


-- 1) length(문자열) 갯수
-- 2) upper 대문자 / lower 소문자
-- 3) instr(문자열, 찾을문자열)  위치 , 못찾으면 0
-- 4) left(문자열, 몇개), right, substr(문자열, 시작, 몇개)  문자열 일부분
-- 5) 문자열연결 concat(문자열1, 문자열2)
-- 6) trim 좌우공백빼기
-- 7) replace(문자열에서, 찾아서, 바꾸기)
-- 8) repeat(뭐를, 몇개반복)
-- 9) 빈칸채우기  lpad , rpad

-- 2-2 연습문제
#Q1.
create table fn_select_userinfo2 select *from userinfo;
alter table fn_select_userinfo2 add email varchar(20) not null;
alter table fn_select_userinfo2 modify name varchar(20) not null;
desc fn_select_userinfo2;

#Q2.
select *from fn_select_userinfo2;
set sql_safe_updates=0;
update fn_select_userinfo2 set name='aaa',email='aaa@gmail.com' where no=1;
update fn_select_userinfo2 set name='bbb',email='bbb@gmail.com' where no=2;
update fn_select_userinfo2 set name='ccc',email='ccc@gmail.com' where no=3;
update fn_select_userinfo2 set name='ddd',email='ddd@gmail.com' where no=4;
update fn_select_userinfo2 set name='abc',email='abc@gmail.com' where no=5;
update fn_select_userinfo2 set name='bca',email='bca@gmail.com' where no=6;

#Q3.
select name`이름`,length(name)`갯수` from fn_select_userinfo2;

#Q4.
select name,left(name,1) `첫번째 글자`,right(name,1) `마지막 글자` from fn_select_userinfo2;

#Q5.
select name,replace(name,'aaa','aaa 1등') from fn_select_userinfo2;

#Q6.
select concat(name,'는 개발자입니다.') `직업` from fn_select_userinfo2;

#Q7.
select upper(name) from fn_select_userinfo2;
select lower(name) from fn_select_userinfo2;

#Q8.
select name,instr(name,'b') from fn_select_userinfo2 where age >= 40;

#Q9.
select name,instr(name,'b') from fn_select_userinfo2 where age >= 40 order by age desc limit 2;

#Q10.
select name,concat(left(name,1),'*',right(name,1)) `test` from fn_select_userinfo2;

#Q11.
create table select_userinfo2 select *from fn_select_userinfo2;
update select_userinfo2 set name='aaaa' where no=1;
update select_userinfo2 set name='bbaab' where no=2;
update select_userinfo2 set name='ccaac' where no=3;
update select_userinfo2 set name='daadd' where no=4;
update select_userinfo2 set name='abc' where no=5;
update select_userinfo2 set name='baaca' where no=6;
select *from select_userinfo2;

select name,concat(left(name,1),repeat('*' , length(name)-2),right(name,1)) `test` from select_userinfo2;



-------------------------------------------------------------
#3. Date
-------------------------------------------------------------

-- 1) 시스템의 현재 시각조회
select now(); -- '2025-03-21 11:58:30'
select current_time(); -- '11:59:19'

-- 2) 요일  (0 = Mon , 1 = Tue ,,, 6 = Sun)
select weekday(now());  -- 4  금
select weekday("2025-03-21");  -- 4  금

-- 3) 날짜형식 date_format( 날짜지정, '%Y-%m-%d' )
select date_format("2025-03-21" , '%Y-%m-%d');
select date_format(now() , '%Y-%m-%d %H:%i:%s'); -- '2025-03-21 12:03:51'

-- 4) 100일전 / 후 date_add
select date_add( now() , interval -10 day); -- '2025-03-11 12:05:21'
select date_add( now() , interval 10 day); -- '2025-03-31 12:05:54'
select date_add( now() , interval -3 hour); -- '2025-03-21 09:06:00'

-- 5) datediff(날짜1, 날짜2) 날짜차이
select datediff( '2025-03-22' , '2025-03-21' );  -- 1
select timestampdiff(  hour,'2025-03-22' , '2025-03-21' ); -- -24

-- 1) 시스템의 현재 시각조회 now / current_time
-- 2) 요일  (0 = Mon , 1 = Tue ,,, 6 = Sun)
-- 3) 날짜형식 date_format( 날짜지정, '%Y-%m-%d' )
-- 4) 100일전 / 후 date_add
-- 5) datediff(날짜1, 날짜2) 날짜차이

# 3-2 연습문제
create table date_userinfo select *from userinfo;
alter table date_userinfo add date datetime;
alter table date_userinfo modify date datetime default current_timestamp;
desc date_userinfo;
delete from date_userinfo where no=5;
delete from date_userinfo where no=6;
update date_userinfo set name='aaa',date='2022-12-30 00:00:00' where no=1;
update date_userinfo set name='bbb',date='2022-11-30 00:00:00' where no=2;
update date_userinfo set name='ccc',date='2022-10-30 00:00:00' where no=3;
update date_userinfo set name='ddd',date='2022-09-30 00:00:00' where no=4;
select *from date_userinfo;

#Q1.
select name,date from date_userinfo where date < '2022-11-01';

#Q2.
select name,date,date_add(date,interval 30 day) `event` from date_userinfo where month(date) = 12;

#Q3.
select name,date_format(date,'%Y년 %m월 %d일') from date_userinfo;

-------------------------------------------------------------
#4. if / case
-------------------------------------------------------------

-- if(조건, 참, 거짓)
-- 다형식
/*   case
     when    조건1    then   상태1
     when    조건1    then   상태2
     else    모든조건에 해당하지 않을 때, 생략가능
     end
*/

create table control (no int);
insert into control values (1) , (2) , (3);
select *from control;

-- 1-1.
select no , if(no=1 , '1이다' , '1이 아니다') `상태` from control;

-- 1-2.
select no , if(no > 1 , '1보다 크다' , '1보다 작다') `상태` from control;

-- 1-3.   case    when/then        end
select no,case
             when  no=1  then '1이다'
			 when  no=2  then '2이다'
             when  no=3  then '3이다'
             else '1,2,3이 아니다'
          end `state`
from control;

-- 1-4.   2이다, 크다, 작다
select no, case 
            when  no>2 then '크다'
            when  no=2 then '2이다'
            when  no<2 then '작다'
		    end `state`
from control;

-- 4-2 연습문제
create table if_userinfo select *from userinfo;
desc if_userinfo;
alter table if_userinfo add (
	sex char(1),
	sns char(1)
);
alter table if_userinfo modify no int not null auto_increment primary key;
alter table if_userinfo modify age int default 0;
select *from if_userinfo;
update if_userinfo set sex=null, sns='n' where no=1;
update if_userinfo set sex='m', sns='y' where no=2;
update if_userinfo set sex='m', sns='y' where no=3;
update if_userinfo set sex='f', sns='n' where no=4;
update if_userinfo set name='fifth', sex='f', sns='y' where no=5;
update if_userinfo set name='sixth', sex='m', sns='n' where no=6;

#Q1.
select *, if (sns='y', '수신유지', '수신거부') `수신여부상태` from if_userinfo;

#Q2.
select *, if(age<19, '미성년자','성인') `성인여부` from if_userinfo;

#Q3.
select sum(if(sns='n',1,0)) `sns수신거부수` from if_userinfo;
select count(if(sns='n',1,null)) `sns수신거부수` from if_userinfo;

#Q4.
select ename,depton, case
					 when depton=10 then 'ACCOUNTING'
					 when depton=20 then 'RESEARCH'
					 when depton=30 then 'SALES'
					 end `부서이름`
from emp;

select ename,depton, case depton
					 when 10 then 'ACCOUNTING'
					 when 20 then 'RESEARCH'
					 when 30 then 'SALES'
					 end `부서이름`
from emp;
                 
#Q5.
select ename,job,case
				 when job='CLERK' then '판매원'
                 when job='SALESMAN' then '영업사원'
                 else '사원'
                 end `job2`
from emp;

select ename,job,case job
				 when 'CLERK' then '판매원'
                 when 'SALESMAN' then '영업사원'
                 else '사원'
                 end `job2`
from emp;