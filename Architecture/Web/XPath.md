

target:  https://blog.jetbrains.com/


### a full, explicit path
selector.xpath('//head/title')  ==> get title node
selector.xpath('/html/head/title/text()')  === > get text
selector.xpath('//body/div[2]')  ===> get the second div node from the div list

### without a full, explicit path
selector.xpath('//body//text()')  ===> get all texts
selector.xpath('//a/@href')  ===> get all href attributes in <a> element
