
### git install and configure
```
# server (eg. 192.168.4.134)
yum install git -y
useradd git
passwd  git
su - git
git init --bare ~/test.git


# client
git config --global user.name "git"
git config --global user.email "git@git-test.com"
git clone git@192.168.4.134:~/test.git



```

### update current repository commit name and email
git config  user.name "git"
git config  user.email "git@git-test.com"