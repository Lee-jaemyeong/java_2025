use mbasic;
create table member(
	no int not null auto_increment primary key,
    name varchar(100) not null,
    pass varchar(50) not null
    );
desc member;

insert into member (name,pass) values ('first',11);
insert into member (name,pass) values ('second',22);
insert into member (name,pass) values ('third',33);
insert into member (name,pass) values ('fourth',44);
select *from member;