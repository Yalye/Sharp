
### ArrayList
ArrayList is the most commonly used List, it's implemented using array and it allows random access. Its shortcomings are:
 * if added a new element to an arraylist, 
组的缺点是每个元素之间不能有间隔，当数组大小不满足时需要增加存储能力，就要将已经有数
组的数据复制到新的存储空间中。当从ArrayList 的中间位置插入或者删除元素时，需要对数组进
行复制、移动、代价比较高。因此，它适合随机查找和遍历，不适合插入和删除。