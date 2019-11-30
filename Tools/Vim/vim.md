
### repeat command
`.`

### undo and redo
`u` undo
`ctrl+r` redo
`:undo 2` undo to the second operation
`:undolist` show undo list
`:earlier 1m` undo to status 1 minute ago

### custom repeat 
select lines --> `:'<,'> normal command` --- repeat command on selected lines
`:%normal command` --- repeat command on all lines
`:'<,'> normal .`  --- repeat last command on selected lines

### command history
`q:` show all history command

### syntax 
`:syntax enable` turn on syntax color
`:syntax clear` remove syntax color
`:syntax off` turn off syntax

### create an encrypted file 
vim -x file_name 

### command c
`c` like `d`, except for entering the insert mode after deletion

### command s and S
`s` like `x`, except for entering the insert mode after deletion
`S` like `dd`, except for entering the insert mode after deletion

### buffers
`:ls`   show all file buffers
`:bnext` `:bprev`  change current focus buffer 

### mark
`mm` mark
``m` jump to mark

### run shell
`:! ls`             
`:! ls -ltr % `    show current file
`:shell`           new shell in vim.           run exit to exit

`:read  !ls`        copy ls result to buffer, insert the result into the file, below the cursor
`:write !sh`        copy buffer then run the command in shell 

`:2,5!sort`         sort line 2 to line 5
`:2,$!sort`         sort line 2 to end of the file
