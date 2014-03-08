drop table if exists ETACServiceAccount;
create table ETACServiceAccount (
	id serial primary key,
	sAADName varchar,
	modtime timestamp DEFAULT current_timestamp,
	createtime timestamp DEFAULT current_timestamp
);
insert into ETACServiceAccount (sAADName) values ('RISA_IDW_NP');
--select * from ETACServiceAccount;