
### undo the commit & redo
```
$ git commit -m "Something terribly misguided" # (0: Your Accident)
$ git reset HEAD~                              # (1)
[ edit files as necessary ]                    # (2)
$ git add .                                    # (3)
$ git commit -c ORIG_HEAD                      # (4)
```


### count the line number
git log --since="2021-04-20" --before="2021-06-01" --pretty=tformat: --numstat | awk '{ add += $1; subs += $2; loc += $1 - $2 } END { printf "New line: %s, remove line: %s, total: %s\n", add, subs, loc }'



### Ref
[https://stackoverflow.com/questions/927358/how-do-i-undo-the-most-recent-local-commits-in-git](https://stackoverflow.com/questions/927358/how-do-i-undo-the-most-recent-local-commits-in-git)
