
### url parse
```
from urllib import parse
import os.path
url_path = parse.urlparse(url).path
os.path.split(url_path)
```

### extract zip file
```
import zipfile
with zipfile.ZipFile(path_to_zip_file, 'r') as zip_ref:
    zip_ref.extractall(directory_to_extract_to)
```

### file name split
os.path.splitext(whole_file_path) result a list of path and extension

## split path
os.path.split(whole_file_path)

## copy file -->shutil
```python
def move_file_to(source_dir, target_dir):
    shutil.copy(source_dir, target_dir)

### get all files of folder
```
    import_dir = './data/import/'
    export_dir = './data/export/'
    walk_dir = os.path.curdir
    absolute_walk_path = os.path.abspath(walk_dir)
    for root, subdirs, files in os.walk(import_dir):
        for image_file_name in files:
            image_file = os.path.join(absolute_walk_path, root, image_file_name)
            print(image_file)
``` 

```
def get_file_name(file_full_path):
    """

    """
    return os.path.split(whole_file_path)[-1]
```

### read excel
```
dfs = pd.read_excel('data.xlsx', 'sheet1')
```

### write excel
```
workbook = xlsxwriter.Workbook('data.xlsx')
worksheet = workbook.add_worksheet('sheet1')
row = 0
ret = worksheet.write_row(row, 0, ['a', 'b'])
workbook.close()
```

### json read
```
import json

```


### json write
