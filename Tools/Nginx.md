
### load balancing
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

### configure params
`expires -1;`  ---> remove cache

### nginx command
nginx -V  --> show the configuration
nginx -c /usr/local/nginx/conf 
nginx -s stop or kill -9 two-process-id

test change prefix location --> ./sbin/nginx -p /home/online_nginx -t 


### Ref
[http://nginx.org/](http://nginx.org/)  
