drop table if exists ETACDataStore;
create table ETACDataStore (
	id serial primary key,
	dataStoreShortName varchar,
	modtime timestamp DEFAULT current_timestamp,
	createtime timestamp DEFAULT current_timestamp
);
insert into ETACDataStore (dataStoreShortName) values ('idwtest1');
--select * from ETACDataStore;