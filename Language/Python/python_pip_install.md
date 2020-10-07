

### install python and pip
download python: https://www.python.org/ftp/python/  
```
tar xf Python-3.5.0.tgz
cd Python-3.5.0
./configure --with-ssl
make
make install
```
the pip3 needs the `ssl` module which should be installed ahead. 
check the module using `rpm -aq|grep openssl`, install it with `yum install openssl-devel -y ` on CentOS

### install mssql
pip3 install mssql==**
Error: ` _mssql.c:266:22: fatal error: sqlfront.h: No such file or directory`  
Solution: `export PYMSSQL_BUILD_WITH_BUNDLED_FREETDS=1`