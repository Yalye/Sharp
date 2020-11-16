

### install mysql 5.7

```
mysql_dir_name=mysql57
docker_data_dir=/data/docker

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

sudo grep 'temporary password' /var/log/mysqld.log
alter user 'root'@'localhost' identified by 'asdf.123';

```

### my.cnf
```

```


### Q&A
 * where does mysql find the my.cnf
    * using `mysqld --help --verbose`, on my machine, it is `Default options are read from the following files in the given order: /etc/my.cnf /etc/mysql/my.cnf /usr/local/mysql/etc/my.cnf ~/.my.cnf `

 * systemctl restart mysql