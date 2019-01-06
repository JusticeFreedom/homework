create database bookdb;
show databases;
use bookdb;

CREATE TABLE book (
  `bookid` int(10) NOT NULL  AUTO_INCREMENT,
  `bookname` varchar(20) NOT NULL ,
  `bookauthor` varchar(20) NOT NULL ,
  `bookdate` varchar(20) NOT NULL ,
  PRIMARY KEY (`bookid`)
)ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;

insert into book values('1','java','javaauthor','2019-1-1');

insert into book values('2','c','cauthor','2019-1-2');

insert into book values('3','python','pythonauthor','2019-1-3');

select * from book;