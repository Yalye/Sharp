

target:  https://blog.jetbrains.com/


### a full, explicit path
selector.xpath('//head/title')  ==> get title node
selector.xpath('/html/head/title/text()')  === > get text
selector.xpath('//body/div[2]')  ===> get the second div node from the div list


### without a full, explicit path
selector.xpath('//body//text()')  ===> get all texts
selector.xpath('//a/@href')  ===> get all href attributes in <a> element
selector.xpath(//div[@class="title"]) ==> get all div with the class name `title`

### move
selector.xpath('//body//span[@class="title title-desktop"]').xpath('./a/text()' 
selector.xpath('//body//span[@class="title title-desktop"]').xpath('./a/parent::*/a/text()'


### Ref
https://docs.scrapy.org/en/xpath-tutorial/topics/xpath-tutorial.html