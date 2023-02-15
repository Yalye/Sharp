
### git rm -r cached .


### create a new repository on the command line
```
echo "# " >> README.md
git init
git add README.md
git commit -m "first commit"
git branch -M main
git remote add origin git@github.com:****.git
git push -u origin main
```

### push an existing repository from the command line
```
git remote add origin git@github.com:****.git
git branch -M main
git push -u origin main
```

### git add remote origin 
git remote add origin git@github.com:****.git 

### set alias
edit `~/.gitconfig` like:

```
[alias]
    st = status
    ci = commit -v
```

### delete branch
```
$ git push -d <remote_name> <branch_name>   --- delete remote branch
$ git branch -d <branch_name>    --- delete local branch
```

### clone specific brach
```
git clone -b branch_name repo_url

git clone -branch branch_name [--single-branch] repo_url

git clone repo_url
git branch -a
git checkout branch_name
```

### merge
git checkout main
git merge test

### stage diff
git diff --staged

### diff between local and remote
git diff test origin/test

### remove last commit
git reset HEAD~

### remove last staged 
git reset HEAD -- .

### create new branch
```
git checkout -b develop
git push origin develop 
```