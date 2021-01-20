

### get via sock proxy
```
import requests

resp = requests.get('http://go.to', 
                    proxies=dict(http='socks5://user:pass@host:port',
                                 https='socks5://user:pass@host:port'))
```

