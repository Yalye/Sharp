

### Rules
 * Can't assign weaker privilege in subclass
    * The point is that polymorphism in Java (and other programming languages) relies on you being able to treat an instance of a subclass as if it was an instance of the superclass. But if the method is restricted in the subclass, you find that the compiler cannot figure out whether the access rules allow a method to be called .

### Pulibc, empty, protect, private

||anywhere|subclass not in package|in package|in class|
| ---- | ---- | ---- | ---- | ---- |
|public|OK|OK|OK|OK|
|protect|NO|OK|OK|OK|
|empty|NO|NO|OK|OK|
|private|NO|NO|NO|OK|



### References
[https://stackoverflow.com/questions/17510152/why-cant-we-assign-weaker-privilege-in-subclass](https://stackoverflow.com/questions/17510152/why-cant-we-assign-weaker-privilege-in-subclass)