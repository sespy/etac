drop table if exists aaccount;
create table aaccount (
	id serial primary key,
	ad_user varchar,
	mod_time timestamp DEFAULT current_timestamp,
	cre_etime timestamp DEFAULT current_timestamp
);
insert into aaccount (ad_user) values ('testuser1');
insert into aaccount (ad_user) values ('testuser2');
insert into aaccount (ad_user) values ('testuser3');
insert into aaccount (ad_user) values ('testuser4');