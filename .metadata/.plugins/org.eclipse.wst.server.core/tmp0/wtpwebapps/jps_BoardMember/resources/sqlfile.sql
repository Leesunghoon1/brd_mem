CREATE TABLE `board` (
  `bno` int NOT NULL AUTO_INCREMENT,
  `title` varchar(200) NOT NULL,
  `writer` varchar(100) NOT NULL,
  `content` text,
  `regdate` datetime DEFAULT CURRENT_TIMESTAMP,
  `moddate` datetime DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`bno`)
)

-- 2023-09-08
create table member(
id varchar(100),
pwd varchar(100) not null,
email varchar(100) not null,
age int defalt 0,
regdate datetime default now(),
lastlogin datetime default now(),
primary key(id));
