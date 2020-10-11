
### behind
the basic idea behind enum is: each enum type is one instance of enum class. 

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
