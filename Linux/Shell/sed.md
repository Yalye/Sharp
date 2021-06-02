
#### print lines that match
sed -n -e '/[\\()]/p' test.txt


#### delete from string to the end of the line 
sed -e 's/\\n.*//g' test.txt











