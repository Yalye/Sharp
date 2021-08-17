
#### print lines that match
sed -n -e '/[\\()]/p' test.txt


#### delete from string to the end of the line 
sed -e 's/\\n.*//g' test.txt


#### replace whitespace with carriage return
sed 's/\s/\n/g' test.txt

#### remove empty line
sed '/^$/d' test.txt










