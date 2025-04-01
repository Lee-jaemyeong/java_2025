create database dbdbig;
use dbdbig;
use mbasic;

create table board(
bno int not null auto_increment primary key,
bname varchar(200) not null,
btitle varchar(1000) not null,
bcontent text not null,
bhit int not null default 0,
bdate timestamp not null default current_timestamp,
bip varchar(100) not null
);
desc board;

create table sboard select *from board;
desc sboard;
alter table sboard modify bno int not null auto_increment primary key;
alter table sboard add bpass varchar(50) not null;
