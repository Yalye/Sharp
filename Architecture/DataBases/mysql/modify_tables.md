
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
