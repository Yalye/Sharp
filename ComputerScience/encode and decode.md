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

### different encoding type
when ascii, when unicode, when utf8

1963, American Standard Code for Information Interchange, ascii
1963,  IBM's Extended Binary Coded Decimal Interchange Code, EBCDIC
===> more characters need to be encoded, so unicode process starts
===> but face the dilemma that if using the fix-width method, it's a waste that the small character set of Latin alphabet but widely used 
===> so variable-width encoding comes

 * fix-width and variable-width
 * different data size


### how utf-8 encode character? 
 * 1, 2 ,4 when ? why

utf-8 encoding tables


### 乱码是怎么回事？ 乱码是怎么展示的？ 

### 写程序中要如何统一成utf8
 * 程序文件要用utf8文件格式写入
 * 交付的数据要用utf8存储
 * 网络传输的数据要基于utf8 进行编码

### 16 and ‘16’ memory difference 

11/8 写完 编码与解码 长文，  **从头到尾说清楚**

### encoding example?
乱码？
文本文件？
http请求？
解析字符串？


### 字体？

### 



### Ref
[https://lemire.me/blog/2020/10/20/ridiculously-fast-unicode-utf-8-validation/](https://lemire.me/blog/2020/10/20/ridiculously-fast-unicode-utf-8-validation/)