
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
