public enum Language {
    CPP("Bjarne Stroustrup", "1985"),
    C("Dennis Ritchie","1972"),
    JAVA("James Gosling", "1995"),
    PYTHON("Guido van Rossum", "1990");
    private final String author;
    private final String showingDate;
    Language(String author, String showingDate){
        this.author = author;
        this.showingDate = showingDate;
    }
}


/*
Compiled from "Language.java"
public final class Language extends java.lang.Enum<Language> {
  public static final Language CPP;
  public static final Language C;
  public static final Language JAVA;
  public static final Language PYTHON;
  public static Language[] values();
  public static Language valueOf(java.lang.String);
  static {};
}
*/