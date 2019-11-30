
### install YouCompleteMe
1. need vim 8
    ```
    remove old version: yum -y remove vim-minimal vim-common vim-enhanced
    wget http://mirror.ghettoforge.org/distributions/gf/el/7/plus/x86_64/vim-enhanced-8.0.003-1.gf.el7.x86_64.rpm
    wget http://mirror.ghettoforge.org/distributions/gf/el/7/plus/x86_64/vim-common-8.0.003-1.gf.el7.x86_64.rpm
    wget http://mirror.ghettoforge.org/distributions/gf/el/7/plus/x86_64/vim-minimal-8.0.003-1.gf.el7.x86_64.rpm
    sudo rpm -Uvh vim-minimal-8.0.003-1.gf.el7.x86_64.rpm
    sudo rpm -Uvh vim-common-8.0.003-1.gf.el7.x86_64.rpm
    sudo rpm -Uvh vim-enhanced-8.0.003-1.gf.el7.x86_64.rpm
    ```
2. install YCM, need cmake


### vim and python
```
:python import sys; print(sys.version)
```

### vimrc
```
set nocompatible              " required
filetype off                  " required
set encoding=utf-8

" set the runtime path to include Vundle and initialize
set rtp+=~/.vim/bundle/Vundle.vim
call vundle#begin()

" alternatively, pass a path where Vundle should install plugins
"call vundle#begin('~/some/path/here')

" let Vundle manage Vundle, required
Plugin 'gmarik/Vundle.vim'
Plugin 'vim-scripts/indentpython.vim'
Plugin 'Valloric/YouCompleteMe'
Plugin 'vim-syntastic/syntastic'
Plugin 'nvie/vim-flake8'
Plugin 'jnurmine/Zenburn'
Plugin 'altercation/vim-colors-solarized'
Plugin 'scrooloose/nerdtree'
Plugin 'jistr/vim-nerdtree-tabs'


" add all your plugins here (note older versions of Vundle
" used Bundle instead of Plugin)

" ...

" All of your Plugins must be added before the following line
call vundle#end()            " required
filetype plugin indent on    " required

" Enable folding
set foldmethod=indent
set foldlevel=99

" Enable folding with the spacebar
nnoremap <space> za

"split navigations
nnoremap <C-J> <C-W><C-J>
nnoremap <C-K> <C-W><C-K>
nnoremap <C-L> <C-W><C-L>
nnoremap <C-H> <C-W><C-H>

au BufNewFile,BufRead *.py
\ set tabstop=4 |
\ set softtabstop=4 |
\ set shiftwidth=4 |
\ set textwidth=79 |
\ set expandtab |
\ set autoindent |
\ set fileformat=unix |

hi BadWhitespace guifg=gray guibg=red ctermfg=gray ctermbg=red
au BufRead,BufNewFile *.py,*.pyw,*.c,*.h match BadWhitespace /\s\+$/

let python_highlight_all=1
syntax on

let NERDTreeIgnore=['\.pyc$', '\~$'] "ignore files in NERDTree

if has('gui_running')
  set background=dark
  colorscheme solarized
else
  colorscheme zenburn
endif

map <C-n> :NERDTreeToggle<CR>

autocmd StdinReadPre * let s:std_in=1
autocmd VimEnter * if argc() == 0 && !exists("s:std_in") | NERDTree | endif

filetype plugin indent on
" show existing tab with 4 spaces width
set tabstop=4
" when indenting with '>', use 4 spaces width
set shiftwidth=4
" On pressing tab, insert 4 spaces
set expandtab
```


### references
https://realpython.com/vim-and-python-a-match-made-in-heaven/   

