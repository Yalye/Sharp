
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

### nginx command
nginx -V  --> show the configuration
nginx -c /usr/local/nginx/conf 


### Ref
[http://nginx.org/](http://nginx.org/)  
