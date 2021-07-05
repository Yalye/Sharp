
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

### delete docker 
```
docker rm -f a/b/3
```

### docker ps
```
docker ps --no-trunc (-a)
```

### docker enter container
docker exec -it f2b952b8edcd /bin/bash

### References
https://yeasy.gitbook.io/docker_practice/introduction/why
