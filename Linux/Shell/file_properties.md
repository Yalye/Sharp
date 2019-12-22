
### file information
stat file_name

### line count, word count and byte count of a file
wc file_name

### all file size sum
dir | { ls -FaGl "${@}" | awk '{ total += $4; print }; END { print total }'; }



### 







### command 
 * stat
 * wc
 * du
 * file  
 * touch
 * chown
 * chgrp
 * chmod
 * umask
 * setfacl
 * getfacl 
 * chattr
 * lsattr
