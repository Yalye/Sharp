
### get cpu count
run command `lscpu`
```
[root@localhost ~]# lscpu 
Architecture:          x86_64
CPU op-mode(s):        32-bit, 64-bit
Byte Order:            Little Endian
CPU(s):                40
On-line CPU(s) list:   0-39
Thread(s) per core:    2              -- hardware multithreading tech
Core(s) per socket:    10             -- number of cores (independent processing unit) on a socket
Socket(s):             2              -- number of cpu sockets or cpu slots
```
the total cpu count is 40, which is `Thread(s) per core X Core(s) per socket X Socket(s)`

### clock cycle
The clock speed is measured in Hz, typically either megahertz (MHz) or gigahertz (GHz). For example, a 4GHz processor performs 4,000,000,000 clock cycles per second.

### get l1 l2 l3 cache
run command `lscpu`
```
L1d cache:             32K
L1i cache:             32K
L2 cache:              256K
L3 cache:              25600K
```

### l1 l2 l3 speed
l1: a few cycles.   maybe 0.5ns
l2: 2x to 10x higher latency than l1, faster than main memory. maybe 7ns
l3: higher latency than l2.

### grep from top
top -p `pgrep "python"`


