

### crontab
using command `man crontab`, you can get the crontab file location `/var/spool/` and they are not intended to be edited directly. 

```
a b c d e script
a - Minute (0-59)
b - Hour (0-23)
c - Day (0-31)
d - Month(0=none - 12=Dec.)
e - Day of the Week (0=Sunday - 7=Sunday)

Operators:
* - all values
, - specify separate individual values
- - a range of values
/ - divide a value into steps

0 0 1 * * cd /home/test/; /bin/bash /home/test/crontab_restart.sh   --> run the script once a month
```

### start a process if it's down
```
#!/bin/bash

process=YourProcessName
makerun="/usr/bin/program"

if ps ax | grep -v grep | grep $process > /dev/null
then
    exit
else
    $makerun &
fi

exit
```

then add the script into crontab.


### commands
 * sleep
 * watch
 * at
 * crontab

 ### References
 [https://phoenixnap.com/kb/set-up-cron-job-linux](https://phoenixnap.com/kb/set-up-cron-job-linux)  
 [https://help.ubuntu.com/community/CronHowto](https://help.ubuntu.com/community/CronHowto)