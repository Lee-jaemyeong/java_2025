## part001)
use mbasic;
show tables;
desc milk;

insert into milk values(1, 'white',1000);
insert into milk values(2, 'choco',1200);
insert into milk values(3, 'banana',1800);
## 한줄 실행 ctrl + enter
## 여러줄 실행 ctrl + shift + enter

#Q1.
insert into milk values(4, 'melon',5000);

#Q2.
update milk set mprice=1500 where mno=4;

#Q3.
delete from milk where mno=4 and mname='melon';

#Q4.
select *from milk;

##
create table userinfo_ex select *from userinfo;
desc userinfo_ex;
alter table userinfo_ex modify no int not null auto_increment primary key;
select *from userinfo_ex;

#Q1.
insert into userinfo_ex values(5,'fifth',55);
insert into userinfo_ex (name,age) values ('fifth',55);

#Q2.
set sql_safe_updates=0;
update userinfo_ex set age=10;

#Q3.
update userinfo_ex set name='thrid', age=33 where no=3 and age=10;

#Q4.
delete from userinfo_ex where no=3 and age=10;

#Q5.
delete from userinfo_ex;

#2025-03-20

#Q1. select 기본함수
select *from emp where depton=30 and ename like '%E%' and sal not between 1000 and 2000;

#Q2.
select *from emp where comm is null and mgr is not null and job in ('MANAGER','CLERK') and ename not like '_L%'; 

#2025-03-21 select 집계함수

#Q1.
select depton,job,avg(sal) `평균급여` from emp where sal <= 3000 group by depton,job having avg(sal) >= 2000 order by depton;

#Q2.
select depton,job,count(job) `사원수`,max(sal) `최고급여`,sum(sal) `급여합`,avg(sal) `평균급여` from emp group by depton,job order by depton;

## 만약 오류가 난다면 아래 코드 사용 후 ONLY_FULL_GROUP_BY 제거
select @@sql_mode;
set session sql_mode = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

