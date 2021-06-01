
### ftp connect
ftp
  open 1.1.1.1 100
  user
  passwd

### install ftp


firewall-cmd --permanent --zone=public --add-service=ftp
firewall-cmd --reload


### prompt off  --> good for mget