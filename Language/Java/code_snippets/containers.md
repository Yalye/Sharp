
### list
```
//initialize list
Arrays.asList  // have fixed size
List.of("a","b") // Java9
new ArrayList(){{add("a"); add("b");}}

//sublist
sublist = list.sublist(1,4);

//reverse list
Collections.reverse(list);`

//check if list contains
list.contains(element);
list.stream()
  .filter(item -> item.equals(element))
  .findAny()
  .orElse(null)

//index
list.indexOf(element);  // -1 => not in list
```

### map
```

```

### sublist

java程序运行class文件,对于有包名的类,java把包名当成文件夹处理."包名+类名"相当于"文件夹目录+类名"来寻找类。