### remove first char of each line in a file
sed "s/^.//g" -i file
cut -c 2- file > new_file

### remove last char of each line in a file
sed "s/.$//g" -i file

### remove first char of a file
sed "1s/^.//" -i file

### remove last char of a file
sed "$ s/.$//" -i file

### split file into specified number of line files
split -l 20 andrew_solomon_love_no_matter_what.txt 

split -b 10KB andrew_solomon_love_no_matter_what.txt 

### split a line 
awk -F "}, {" '{print $1}' trends_available.txt              --- split each line of file with }, {, and only print first column
awk -F "}, {" 'NR==1 {print $1}' trends_available.txt        --- print first line of result

### split file into list
awk  '{gsub(/}, {/, "\n" ); print ;}' trends_available.txt > list.txt

### count specified word 
tr ' ' '\n' < FILE | grep WORD | wc -l



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


