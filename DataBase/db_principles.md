
### Clustered Index vs Nonclustered Index
A clustered index defines the physical storage order of table data, and only one clustered index can exist in a table, because the table data can only be stored in one order. The primary premise of clustered index is that the table data stored in continuous disk blocks.

A clustered index don't have to be the same with the table's primary key. A clustered index will help us minimize access to the disk. A clustered index should be set according to some usage like query. 

Nonclustered index is similar to clustered index, except the data of the index points to is not stored on adjacent blocks.









### references
https://hackernoon.com/clustered-vs-nonclustered-what-index-is-right-for-my-data-717b329d042c