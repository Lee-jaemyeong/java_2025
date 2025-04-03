use mbasic;

create table umember (
 uno int not null auto_increment primary key,
 uid varchar(100) not null,
 upass varchar(50) not null,
 uphone int not null,
 udate timestamp not null default current_timestamp,
 uip varchar(50) not null
);
desc umember;