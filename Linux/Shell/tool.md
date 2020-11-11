### uniq -c 

### lsof (LiSt Open Files)
`lsof `
`lsof -u ^root`  List all files which are opened by everyone except root

### yum change repo
```
mv /etc/yum.repos.d/CentOS-Base.repo /etc/yum.repos.d/CentOS-Base.repo.backup
wget -0 /etc/yum.repos.d/CentOS-Base.repo http://newurl/repo/Centos-7.repo
yum clean all
yum makecache
```

