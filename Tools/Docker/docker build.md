
#### 
`docker build -t aa:1.0 .`


#### 
1. create Dockerfile
2. `docker built -t aa:1.0 .`
3. `docker images`
4. `docker save aa:1.0 -o a.tar`
4.1 `docker load -i a.tar`
4.2. `docker run aa:1.0`