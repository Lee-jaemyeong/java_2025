create database dbdbig;
use dbdbig;

create table mvcboard1(
bno int not null auto_increment primary key,
bname varchar(200) not null,
bpass varchar(50) not null,
btitle varchar(1000) not null,
bcontent text not null,
bdata timestamp not null default current_timestamp,
bhit int not null default 0,
bip varchar(50) not null
);
desc mvcboard1;
