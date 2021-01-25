

### query specified fields
```
GET platform/_search
{
  "size": 10000, 
  "_source": ["content"],
  "query":{}
}
```