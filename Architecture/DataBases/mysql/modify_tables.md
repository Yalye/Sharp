
### connect
```
mysql -uroot -p -h127.0.0.1 -P3306
```

### update password
```
UPDATE mysql.user SET authentication_string = PASSWORD('aaaaa') WHERE User = 'root';
FLUSH PRIVILEGES;


set global validate_password_policy=LOW;

alter user 'root'@'localhost' identified by 'asdf.123';

```

### drop column
```
alter table aaa drop column columnA;
```

### alter table
```
alter table tb_website_info add column aaa boolean default false

alter table tb_website_info add column add_time DATETIME DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP

alter table tb_website_info modify column url varchar(150)

alter table tb_website_info add primary key(url)
```

### create table
create table tb_website_info(
url varchar(200) not null,
des varchar(200) not null
)
