drop table if exists ETACHost;
create table ETACHost (
	id serial primary key,
	hostCName varchar,
	modtime timestamp DEFAULT current_timestamp,
	createtime timestamp DEFAULT current_timestamp
);
insert into ETACHost (hostCName) values ('sm3vlwhatevs1');
--select * from ETACHost;
