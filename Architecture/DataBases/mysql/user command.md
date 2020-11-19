
### user
#### view user list 
SELECT user FROM mysql.user GROUP BY user;

#### delete user
DELETE FROM mysql.user WHERE user = 'username'; 

### user add 
create user 'inno_user'@'localhost' identified by 'asdf.123';

### update user password
alter user 'inno_user'@'localhost' identified by 'sadSdil0C38uih5L';

### change user host
update mysql.user set host = '%' where user = 'inno_user';

### database
#### create database
create database inno_test;

#### grant privilege
grant all on inno_test.* to 'inno_user'@'localhost';

### table
#### create table
create table people(people_id bigint NOT NULL, name varchar(200) NULL,nick_name varchar(200) NULL);


### other
#### view mysql version
SHOW VARIABLES LIKE "%version%";

