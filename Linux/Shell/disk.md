
### mount
mkdir /mnt/data
mount /dev/sdb1  /mnt/data

### release buff cache
free -m
echo 1 > /proc/sys/vm/drop_caches
free -m

### get files deleted, but still opened by some process
lsof | grep deleted


