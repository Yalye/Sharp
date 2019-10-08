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
can be used to combine *.gz.aa *.gz.ab 

### sort all files/folders by size
du -ah -d1 | sort -h

### delete all sub-directory
rm -R -- */
find -mindepth 1 -maxdepth 1 -type d -print0 | xargs -0 rm -R

### folder transfer to another machine
scp -P 40028 -r ./* root@1.1.1.1:/root/

### gzip file
tar -zcvf a.tar.gz folder/  == tar -cv folder/ | gzip > a.tar.gz
tar -zxvf a.tar.gz -- gunzip < a.tar.gz | tar -xv
tar -zxvf --exclude=./folder/a --exclude=./folder/b.txt a.tar.gz folder/
 * gzip can't compress a file
 * .tar -- uncompressed archive file
 * .zip -- compressed archive file
 * .gz -- file compressed using gzip

### combine file
cat file1 file2 | sort | uniq -d > file3 (only duplicate)
cat file1 file2 | sort | uniq -u > file3 (remove duplicate)
cat file1 file2 | sort | uniq  > file3 (duplicate as one row)
cat file1 file2 > file3
paste file1 file2 > file3


## 去重
 重复的多行记为一行
sort file |uniq 

重复的行全部去掉
sort file |uniq -u

## 显示文件中的指定行
*注意两种方法的顺序
从第3000行开始，显示1000行。即显示3000~3999行
cat filename | tail -n +3000 | head -n 1000
显示1000行到3000行
cat filename| head -n 3000 | tail -n +1000

分解：
    tail -n 1000：显示最后1000行
    tail -n +1000：从1000行开始显示，显示1000行以后的
    head -n 1000：显示前面1000行
或者用sed命令
sed -n '5,10p' filename 只查看文件的第5行到第10行。


查看系统io
iostat -x 1

删除行
sed -i '3d' 1.txt


### References
[itsfoss tar-vs-zip-vs-gz](https://itsfoss.com/tar-vs-zip-vs-gz/)