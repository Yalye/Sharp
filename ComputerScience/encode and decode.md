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



### unicode
17 planes

http://xahlee.info/comp/unicode_index.html
😷 FACE WITH MEDICAL MASK
128567
U+1f637




### ansi is not encoding type
ansi is the system encoding type, it's depends on the system setting(Windows code pages), use chcp command can get the type; 936 means GBK, while 65001 means utf-8. 

### encoding example?


### 字体？

### Big-endian and little-endian
Big-endian: MSB in lower address, LSB in higher address; ---> Mac; TCP/IP; JVM;
little-endian: opposite to the Big-endian;   ---> Intel X86



### Ref
[https://lemire.me/blog/2020/10/20/ridiculously-fast-unicode-utf-8-validation/](https://lemire.me/blog/2020/10/20/ridiculously-fast-unicode-utf-8-validation/)
[https://www.jianshu.com/p/f4b13f1cb23c](https://www.jianshu.com/p/f4b13f1cb23c)