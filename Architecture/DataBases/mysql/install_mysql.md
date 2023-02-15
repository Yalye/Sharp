

### install mysql 5.7

```
mysql_dir_name=mysql57
docker_data_dir=/home/data/docker

yum install -y mysql
systemctl status docker
if [[ $? != 0 ]]; then
    yum -y install yum-utils
    yum-config-manager --add-repo https://download.docker.com/linux/centos/docker-ce.repo
    yum install -y docker-ce
    mkdir -p /etc/docker
    cat > /etc/docker/daemon.json <<eof
{ 
    "data-root": "$docker_data_dir",
    "storage-driver": "overlay2"
}
eof
    systemctl daemon-reload
    systemctl enable docker
    systemctl restart docker
    echo "docker install complete"
else
  echo "Is already installed docker"
fi


docker run -d --restart always -p 43306:3306 \
-v /etc/localtime:/etc/localtime:ro -v /data/$mysql_dir_name:/var/lib/mysql \
--name=$mysql_dir_name -e MYSQL_ROOT_PASSWORD="root123456"  mysql:5.7.21 --max-allowed-packet=20M --character-set-server=utf8mb4 --collation-server=utf8mb4_unicode_ci


```

### install mysql5.7 no docker
```
# wget http://repo.mysql.com/mysql-community-release-el7-5.noarch.rpm 
# rpm -ivh mysql-community-release-el7-5.noarch.rpm
# yum -y install mysql-server
# systemctl start mysqld

mysql -uroot 
login succeed

sudo grep 'temporary password' /var/log/mysqld.log
alter user 'root'@'localhost' identified by 'asdf.123';

```

https://dev.mysql.com/get/mysql80-community-release-el7-4.noarch.rpm

### reset password
[https://stackoverflow.com/questions/33510184/how-to-change-the-mysql-root-account-password-on-centos7](https://stackoverflow.com/questions/33510184/how-to-change-the-mysql-root-account-password-on-centos7)
```
1. Stop mysql:
systemctl stop mysqld

2. Set the mySQL environment option 
systemctl set-environment MYSQLD_OPTS="--skip-grant-tables"

3. Start mysql usig the options you just set
systemctl start mysqld

4. Login as root
mysql -u root

5. Update the root user password with these mysql commands
mysql> UPDATE mysql.user SET authentication_string = PASSWORD('MyNewPassword')
    -> WHERE User = 'root' AND Host = 'localhost';
mysql> FLUSH PRIVILEGES;
mysql> quit

*** Edit ***
As mentioned my shokulei in the comments, for 5.7.6 and later, you should use 
   mysql> ALTER USER 'root'@'localhost' IDENTIFIED BY 'MyNewPass';
Or you'll get a warning

6. Stop mysql
systemctl stop mysqld

7. Unset the mySQL envitroment option so it starts normally next time
systemctl unset-environment MYSQLD_OPTS

8. Start mysql normally:
systemctl start mysqld

Try to login using your new password:
7. mysql -u root -p
```

### my.cnf
```

```


### Q&A
 * where does mysql find the my.cnf
    * using `mysqld --help --verbose`, on my machine, it is `Default options are read from the following files in the given order: /etc/my.cnf /etc/mysql/my.cnf /usr/local/mysql/etc/my.cnf ~/.my.cnf `

 * systemctl restart mysql