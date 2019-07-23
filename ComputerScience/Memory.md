### Memory Hierarchy
https://en.wikipedia.org/wiki/Memory_hierarchy
CPU Register
Cache
 *L1 Cache
 *L2 Cache
 *L3 Cache
Main memory RAM
 * Pyhsical RAM
 * Virtual memory
Secondry storage type
 * ROM
 * Removable drives
 * network/internet storage
 * hard drive
Input sources
 * keyboard 

### Data Segment
Text: contains code executable instructions. known as code segment or text segment
Data: contain global or static variables pre-defined
BSS: contain global or static variables not pre-defined
Heap: shared by threads, managed by malloc, calloc, realloc, and free. grows to larger addresses towards Stack area.
Stack: contains program stack. grows to smaller addresses towards Heap, when they meet, free memory was exhausted. Different thread has different stack area.
https://stackoverflow.com/questions/79923/what-and-where-are-the-stack-and-heap