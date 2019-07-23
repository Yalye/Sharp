### install java8
http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html
tar -zxvf jdk-8u131-linux-x64.tar.gz   
su aa_user
cd ~
vi .bash_profile

```
export JAVA_HOME=/home/aa_user/jdk1.8.0_191
export PATH=$JAVA_HOME/bin:$PATH
export CLASSPATH=.:$JAVA_HOME/lib/dt.jar:$JAVA_HOME/lib/tools.jar
```

installed succeed.
[neo4j_user@localhost ~]$ source .bash_profile 
[neo4j_user@localhost ~]$ java -version
java version "1.8.0_131"
Java(TM) SE Runtime Environment (build 1.8.0_131-b11)
Java HotSpot(TM) 64-Bit Server VM (build 25.131-b11, mixed mode)
