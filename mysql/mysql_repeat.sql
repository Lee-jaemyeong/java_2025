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