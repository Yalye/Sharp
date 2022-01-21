

### get via sock proxy
```
import requests

resp = requests.get('http://go.to', 
                    proxies=dict(http='socks5://user:pass@host:port',
                                 https='socks5://user:pass@host:port'))
```


### set global proxy
```
import os

proxy = 'http://<user>:<pass>@<proxy>:<port>'

os.environ['http_proxy'] = proxy 
os.environ['HTTP_PROXY'] = proxy
os.environ['https_proxy'] = proxy
os.environ['HTTPS_PROXY'] = proxy

#your code goes here.............
```