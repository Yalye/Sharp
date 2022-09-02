
#### 
import re
p = re.compile('[a-z]+')
p.search(str)

p = re.compile(r'[a-z]+(.\d+)')
p.search(str).group(1)

counts = re.findall('\\d*', str)
