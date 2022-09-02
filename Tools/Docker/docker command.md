
### docker install
```
function Check () {
  if [[ $? != 0 ]]; then
    echo "install failed"
    exit 1
  fi
}
yum update
yum -y install yum-utils
Check
yum-config-manager --add-repo https://download.docker.com/linux/centos/docker-ce.repo
Check
yum install -y docker-ce
Check
mkdir -p /etc/docker
Check
cat > /etc/docker/daemon.json <<eof
{ 
    "data-root": "/home/data/docker",
    "storage-driver": "devicemapper"
}
eof
Check
systemctl daemon-reload
systemctl enable docker
Check
systemctl restart docker
Check
which docker
Check
echo "install complete!"

```

### delete docker container
```
docker rm -f a/b/3
docker container rm
```

### docker inspect image
```
docker run -it --entrypoint sh image
```

### docker load 
```
docker load -i aa.tar
```

### docker ps
```
docker ps --no-trunc (-a)
```

### docker enter container
docker exec -it f2b952b8edcd /bin/bash

### docker copy
docker cp <src-path> <container>:<dest-path>  
docker cp <container>:<src-path> <local-dest-path>   

copy folder files
docker cp <src-path>/. <container>:<dest-path>/  

### restore docker network
```
pkill docker
iptables -t nat -F
ifconfig docker0 down
yum install bridge-utils -y
brctl delbr docker0
service docker restart
```

### kill and removeall container
docker stop $(docker ps -a -q)
docker rm $(docker ps -a -q)

### References
https://yeasy.gitbook.io/docker_practice/introduction/why
