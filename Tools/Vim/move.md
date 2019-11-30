
### insert mode
`a` after the cursor
`A` after end of the line
`i` before the cursor
`I` before the first non-empty character
`o` add a new line below
`O` add a new line above

### just move (cursor)
`h j k l 0 ^ $` actual move. each one does the work independently
`gj gk g0 g^ g$` screen move.(useful). each one does the work independently

### just move (word)
`w` move to head of next word
`b` move to head of previous word
`e` move to tail of next word
`ge` move to tail of previous word
`ea` move to tail of next word,then edit. (useful)

### just move (string)
`W B E gE` corresponding to `just move (word)`. 
like `#011` is a string, but two words.
`cW` is string version of `cw`.

### command J
`J` append the next line to the end of current line

### move to last
`` last jump location
`. last modify location
`^ last insert location
`[ and `] last modify or copy location (head and tail)
`< and `> last highlighted location (head and tail)
 
### %
move between the brackets

