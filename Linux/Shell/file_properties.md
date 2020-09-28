
### file information
stat file_name

### line count, word count and byte count of a file
wc file_name

### all file size sum
dir | { ls -FaGl "${@}" | awk '{ total += $4; print }; END { print total }'; }

### setfacl and getfacl
getfacl dir
setfacl -m g::r-x dir   --- set group acl to r-x
setfacl -b dir     ---- delete all acl 

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
