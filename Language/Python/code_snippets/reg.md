
#### 
import re
p = re.compile('[a-z]+')
p.match(str)

p = re.compile(r'[a-z]+(.\d+)')
p.match(str).group(1)
