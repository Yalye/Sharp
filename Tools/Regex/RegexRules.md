

### Rules
#### Anchors 
```
(^ $)
^abc  => matches any string that starts with abc
abc$  =>  matches any string that ends with abc

```

#### Quantifiers 
```
(*+? {})
* >= 0;  + >= 1;  ? = 0 or = 1; {} range
abc* => matches a string that has ab followed by zero or more c
abc+ => matches a string that has ab followed by one or more c
abc? => matches a string that has ab followed by zero or one c
abc{2} => matches a string that has ab followed by 2 c
abc{2,} => 2 or more c
abc{2, 10} => 2 up to 10 c
a(bc){2} => 2 bc 

```

#### OR operator 
```
| []
a(b|c) => matches a string that has a followed by b or c
a[bc]  => matches a string that has a followed by b or c
**differences**
```

#### Character
```
\d \w \s .  \D \W \S
\d => matches a single character that is a digit .  \D non-digit
\w => matches a word character (alphanumeric character plus underscore).  \W non-word
\s => matches a whitespace character (includes tabs and line breaks). \S not whitespace
. => matches any character

```

### example
```
When You Are Old 
BY WILLIAM BUTLER YEATS

When you are old and grey and full of sleep,
And nodding by the fire, take down this book,
And slowly read, and dream of the soft look
Your eyes had once, and of their shadows deep;

How many loved your moments of glad grace,
And loved your beauty with love false or true,
But one man loved the pilgrim soul in you,
And loved the sorrows of your changing face;

And bending down beside the glowing bars,
Murmur, a little sadly, how Love fled
And paced upon the mountains overhead
And hid his face amid a crowd of stars.
```



### Ref
[https://regex101.com/](https://regex101.com/)




