 
create database BBS_DB default charset utf8;

use BBS_DB;

drop table Topic;
drop table replay;

create table  Topic(
	topic_id int AUTO_INCREMENT primary key,
	topic varchar(300),
	topic_entrydate datetime,
	topic_replaycount int,
	topic_lastrepaytime date
)ENGINE=InnoDB AUTO_INCREMENT=25 DEFAULT charset=utf8;

create table replay(
	replay_id int AUTO_INCREMENT primary key,
	topic_id int,
	replay_content varchar(2000),
	replay_name varchar(50),
	replay_time date
)ENGINE=InnoDB AUTO_INCREMENT=25 DEFAULT charset=utf8;




