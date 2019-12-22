
### copy and paste -- y and p
`yy` copy a line
`nyy` copy n lines
`yw` copy a word
`p` paste word after the curson, or paste line after the current line.

### copy and paste using registers
`"ayy` copy a line into register a. a could be [b-z] and [0-9]
`"ap` paste from register a
actually `y` use the defaule register "

### copy yanked text to command (useful)
`ctrl + r "`
``ctrl + r 0` paste register 0 

### replace word
a: `yw` copy word 1, `cw` cut the word 2, then `ctrl+r 0`, why? register 0  and " store word 1, after `cw` register " store word 2. 
b: `yw` copy word 1, `vep` done. why? register " and 0 store word 1, after `vep`, register " store word 2.

### uppercase
`U` to uppercase the selection.

### replace command r R
`r` replace a character
`R` replace characters

### command ~
~ command: Uppercase to lowercase, or lowercase to Uppercase

### copy line
`:5t10` copy line 5 to below line 10

### move line
`:5m10` move line 5 to below line 10

### copy word
`yw` copy word from cursor
`yaw` copy the word  (useful)

### replace all
`:%s/old/new/g` replace all text `old` with `new` without asking
`:%s/old/new/gc` replace all text `old` with `new` need confirming

### other copy and replace
`ciw` and `caw`   
`ciW` and `caW`
`cis` and `ciS`
`cip` and `ciP`
`c` can be `y` and `d`