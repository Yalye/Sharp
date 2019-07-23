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



