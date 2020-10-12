
### behind
the basic idea behind enum is: each enum type is one constant instance of enum class.   
each enum type has a ordinal number accounting from 0.

### General usage
```
public enum Language {
    CPP("", ""),
    JAVA("", ""),
    PYTHON("", "");
    private final String author;
    private final String showingDate;
    Language(String author, String showingDate){
        this.author = author;
        this.showingDate = showingDate;
    }
}
```      

### Special usage: each enum has its own abstract method
```
public enum Language {
    CPP("", "") {
        @Override
        public String alreadyUsed(){return "";}
    },
    JAVA("", ""),
    PYTHON("", "");
    /*constractor*/

    public abstract String alreadyUsed();
}
```



### References
[https://dzone.com/articles/18-points-every-java-developer-should-know-about-e](https://dzone.com/articles/18-points-every-java-developer-should-know-about-e)