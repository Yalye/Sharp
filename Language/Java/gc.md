
#### too many full-gcs
use `jstat -gcutil 9 1000 10` to check if too many full-gcs exist.
use `jmap -dump:format=b,file=dump.hprof PID` to get dump file.
use Eclipse's Mat tool to analyse the dump file
if there is too many explicit full-gc calls, use ` -XX:+DisableExplicitGC` to disable them.





