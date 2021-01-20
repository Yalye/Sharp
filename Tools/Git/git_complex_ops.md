
### undo the commit & redo
```
$ git commit -m "Something terribly misguided" # (0: Your Accident)
$ git reset HEAD~                              # (1)
[ edit files as necessary ]                    # (2)
$ git add .                                    # (3)
$ git commit -c ORIG_HEAD                      # (4)
```


### 



### Ref
[https://stackoverflow.com/questions/927358/how-do-i-undo-the-most-recent-local-commits-in-git](https://stackoverflow.com/questions/927358/how-do-i-undo-the-most-recent-local-commits-in-git)
