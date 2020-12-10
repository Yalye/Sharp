
### laod balancing
```
http {
    upstream myapp1 {
        server srv1.example.com weight=3;
        server srv2.example.com;
        server srv3.example.com;
    }

    server {
        listen 80;

        location / {
            proxy_pass http://myapp1;
        }
    }
}
```


### Ref
[http://nginx.org/](http://nginx.org/)  
