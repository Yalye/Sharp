### 


### what is encode? and why we need encoding? when does encoding happpen?

assigns a number to each character for digital representation.  common example is Morse code.

used in computing, data storage, data transmission of textual data

earlier days encodings only support letters, numerals and some punctuation.

Words and sentences are created from characters, and characters that are needed for a specific purpose are grouped into a **character set**.  In each character set, each character is associated with a number, called a **code point** different code point represents different character in different character set. 

### type

Only ASCII characters are encoded with a single byte in UTF-8

### encoding and decoding
it's like language translation


If the text isn't English and you don't told people what 'character encoding' you use is, they can't read the text correctly.

### encoding type and charset ? 
unicode is a charset? utf-8 is a unicode encoding type?

### different encoding type
when ascii, when unicode, when utf8

1963, American Standard Code for Information Interchange, ascii
1963,  IBM's Extended Binary Coded Decimal Interchange Code, EBCDIC
===> more characters need to be encoded, so unicode process starts
===> but face the dilemma that if using the fix-width method, it's a waste that the small character set of Latin alphabet but widely used 
===> so variable-width encoding comes

 * fix-width and variable-width
 * different data size

ansi is not 

get character set number: https://graphemica.com/%F0%9F%98%B7

### how utf-8 encode character? 
 * 1, 2 ,4 when ? why

utf-8 encoding tables


### 乱码是怎么回事？ 乱码是怎么展示的？ 

### 写程序中要如何统一成utf8?
 * 程序文件要用utf8文件格式写入
 * 交付的数据要用utf8存储
 * 网络传输的数据要基于utf8 进行编码


目前的Unicode字符分为17组编排，每组称为平面（Plane），而每平面拥有65536（即216）个代码点。然而目前只用了少数平面

GBK向下兼容2312

### 16 and ‘16’ memory difference 

### mysql ---- !!!!start!!!!

utf8mb4 encoding
mysql支持的 utf8 编码最大字符长度为 3 字节，如果遇到 4 字节的宽字符就会插入异常了

insert village_people VALUES(4444, "chi", "4444")
insert village_people VALUES(3333, "😷", "3333")

http://xahlee.info/comp/unicode_index.html
😷 FACE WITH MEDICAL MASK
128567
U+1f637



mysql utf-8 support 3-bytes character.

### ansi is not encoding type
ansi is the system encoding type, it's depends on the system setting(Windows code pages), use chcp command can get the type; 936 means GBK, while 65001 means utf-8. 



### encoding example?
乱码？
文本文件？
http请求？
解析字符串？


### 字体？

### Big-endian and little-endian
Big-endian: MSB in lower address, LSB in higher address; ---> Mac; TCP/IP; JVM;
little-endian: opposite to the Big-endian;   ---> Intel X86



### Ref
[https://lemire.me/blog/2020/10/20/ridiculously-fast-unicode-utf-8-validation/](https://lemire.me/blog/2020/10/20/ridiculously-fast-unicode-utf-8-validation/)
[https://www.jianshu.com/p/f4b13f1cb23c](https://www.jianshu.com/p/f4b13f1cb23c)