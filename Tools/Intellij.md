
### shortcuts(mac)
`option + enter`: suggest import
`alt + enter`: add throws declaration

### shortcuts(win)  
code assistance   
`F2` go to the next highlighted error in this file
`Alt Enter` fix the error
`Ctrl F1` show description of error or warning
`Ctrl Shift F7` highlight all the symbols  
`Ctrl Alt F7` view all symbols
`Ctrl Alt T` quickly wrap a code block


search
`shift shift` search everywhere
`ctrl n` search classes
`ctrl alt shift n` search method or global variable
`ctrl shift n` search file



### configure for java development (windows)
1. download jdk.    https://www.oracle.com/java/technologies/javase-downloads.html 
2. configure jdk system path.  JAVA_HOME - jdk1.8.0_281   PATH - %JAVA_HOME%\bin;%JAVA_HOME%/jre\bin;  CLASSPATH - .;%JAVA_HOME%/lib;%JAVA_HOME%/lib/tools.jar;%JAVA_HOME%/lib/dt.jar
3. check jdk status.  `java -version`
4. configure jdk for intellij.  File→Project Structure
5. download maven. http://maven.apache.org/download.cgi
6. configure maven system path. MAVEN_HOME - apache-maven-3.6.3    PATH - %MAVEN_HOME%\bin
7. check maven status. `mvn -v`
8. update maven setting config file.  localRepository  and mirror
9. configure theme 