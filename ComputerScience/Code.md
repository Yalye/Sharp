
Little Endian and Big Endian

##### Explanation
They are two ways of storing multibyte data, such as float,int, etc.  The diffrence between them is where the MSB-'the Most Significant Byte' and LSB-'the Least Significant Byte' locates. <br>
Big Endian:  MSB locates on lower address, while LSB locates on higher address. It's how humans naturally process numbers. For example, the hex value 0x1234, the big endian representation of it is 0x12 0x34, not 0x43 0x21, it's arranged in byte, not bit or nibbles. The big endian is the main way of most network protocols and file formats.<br>
Little Endian: On the contrary. and it's more efficient for logic circuits, so a lot of internal processing was little-endian。<br>


```
>>> import sys
>>> sys.byteorder
'little'
>>>
```

### 
if you parse a big-endian integer x:
```
x = buf[offset] * 256 + buf[offset+1]; or x = buf[offset]<<8 | buf[offset+1];
```

##### small-endian:

```
x = buf[offset+1] * 256 + buf[offset];
```

##### C/C++

```
 x = *(short*)(buf + offset);
 #ifdef LITTLE_ENDIAN
 x = (x >> 8) | ((x & 0xFF) << 8);
 #endif
 
 or x = ntohs(*(short*)(buf + offset));
 ```
 
 ##### reference
 https://blog.erratasec.com/2016/11/how-to-teach-endian.html#.W7x_oVUzaHs