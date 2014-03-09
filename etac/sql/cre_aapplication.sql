drop table if exists aapplication;
create table aapplication (
	id serial primary key,
	short_name varchar,
	business_owner varchar,
	mod_time timestamp DEFAULT current_timestamp,
	cre_time timestamp DEFAULT current_timestamp
);

insert into aapplication (short_name, business_owner) values ('test app 1','user2');
insert into aapplication (short_name, business_owner) values ('test app 2','user3');
insert into aapplication (short_name, business_owner) values ('test app 3','user2');
insert into aapplication (short_name, business_owner) values ('test app 4','user1');
insert into aapplication (short_name, business_owner) values ('test app 5','user4');
