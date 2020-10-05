

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
```



### commands
 * sleep
 * watch
 * at
 * crontab

 ### References
 [https://phoenixnap.com/kb/set-up-cron-job-linux](https://phoenixnap.com/kb/set-up-cron-job-linux)  
 [https://help.ubuntu.com/community/CronHowto](https://help.ubuntu.com/community/CronHowto)