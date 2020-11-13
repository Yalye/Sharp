
### user
#### view user list 
SELECT user FROM mysql.user GROUP BY user;

#### delete user
DELETE FROM mysql.user WHERE user = 'username'; 

### user add and delete
create user 'inno_user'@'localhost' identified by 'inno_pwd';

### database
#### create database
create database inno_test;

#### grant privilege
grant all on inno_test.* to 'inno_user'@'localhost';

### table
#### create table
create table people([people_id] [bigint] NOT NULL, [name] [varchar](200) NULL,[nick_name] [varchar](200) NULL);


### other
#### view mysql version
SHOW VARIABLES LIKE "%version%";

