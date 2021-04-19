
### generate signature
```
keytool -genkey -v -keystore myKey.jks -keyalg RSA -keysize 2048 -validity 10000 -alias myAlias

keytool -v -list -keystore myKey.jks -alias myAlias -keypass test123 -storepass test123


```



