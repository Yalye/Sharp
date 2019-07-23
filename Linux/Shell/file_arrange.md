### zip file (.zip)
zip z.zip zafile zbfile zcfile
zip -r zfolder.zip zfolder/
unzip zfolder.zip

### sort du output by size
du -ah -d1 | sort -h

### sort du output by filename
du -ah -d1 | sort -k 2

### disable ping
echo "1" > /proc/sys/net/ipv4/icmp_echo_ignore_all
or
/etc/sysctl.conf  net.ipv4.icmp_echo_ignore_all=1
or
iptables -I INPUT -p icmp --icmp-type echo-request -j DROP

ping use ICMP protocal which is used by network devices to send error messages and operational information indicating.

### copy all files exclude a specific directory
rsync -av --progress ./ ../local_dir/ --exclude log
rsync -az -e "ssh -p 13787" --progress ../local_dir --exclude ../local_dir/log root@10.10.31.50:/root/remote_dir/     --ignore-existing

### split file and combine file
split -b 10M a.zip b.
cat b.?? > a.zip

### delete all sub-directory
rm -R -- */
find -mindepth 1 -maxdepth 1 -type d -print0 | xargs -0 rm -R
