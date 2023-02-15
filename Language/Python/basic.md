pip install package --upgrade

### install python
* download source code
./configure
make && make install

* install pyenv
CFLAGS="-I$(xcrun --show-sdk-path)/usr/include" pyenv install -v 3.6.9

### show installed modules
`pip freeze`  or `help('modules')` in python.


/usr/bin/ruby -e "$(curl -fsSL https://raw.githubusercontent.com/Homebrew/install/master/install)"
/usr/bin/ruby -e "$(curl -fsSL https://raw.githubusercontent.com/Homebrew/install/master/uninstall)"

### python venv
python.exe -m venv ./venv/