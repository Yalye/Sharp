
### list all users
less /etc/passwd

### create user
useradd test_user
useradd -d /data/ftp_path/ -s /sbin/nologin test_user  --- create ftp user

### set user password
passwd test_user

### change own
chown -R user:user ./dir

### change user directory
usermod -d /data/ftp_path/test_ftp test_user

### user can use sudo command
usermod -aG wheel test_user

### tip
be careful of using `su` in shell script.

### commands
 * useradd
 * userdel
 * usermod
 * passwd
 * chfn
 * chsh
 * su
 * sudo
 * groups
 * groupadd
 * groupdel
 * groupmod