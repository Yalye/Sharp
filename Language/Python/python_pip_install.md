

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

### install pip
```
curl https://bootstrap.pypa.io/get-pip.py -o get-pip.py
python get-pip.py
```

### install mssql
pip3 install mssql==**
Error: ` _mssql.c:266:22: fatal error: sqlfront.h: No such file or directory`  
Solution: `export PYMSSQL_BUILD_WITH_BUNDLED_FREETDS=1`


### install python3.8 on centos
```
wget https://www.python.org/ftp/python/3.8.0/Python-3.8.0.tgz -O /tmp/Python-3.8.0.tgz
cd /tmp && tar zxf Python-3.8.0.tgz
cd Python-3.8.0


yum update -y
yum groupinstall -y 'Development Tools'
yum install -y gcc openssl-devel bzip2-devel libffi-devel

./configure prefix=/usr/local/python38
make && make install
export PATH=$PATH:/usr/local/python38/bin/

curl https://bootstrap.pypa.io/get-pip.py -o get-pip.py
python3.8 get-pip.py
python3 -m pip install virtualenv
python3 -m virtualenv venv
source venv/bin/activate

```

### install jupyter
```
pip install jupyter
jupyter notebook
```

