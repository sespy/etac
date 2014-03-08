drop table if exists ETACApplication;
create table ETACApplication (
	id serial primary key,
	appShortName varchar,
	modtime timestamp DEFAULT current_timestamp,
	createtime timestamp DEFAULT current_timestamp
);
insert into ETACApplication (appShortName) values ('IDW');
--select * from ETACApplication;