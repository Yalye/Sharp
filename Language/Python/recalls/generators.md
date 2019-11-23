
### introduction
generators are iterators, and they don't store all the values in memory, but generate the values on the fly.
`generator = (x for x in range(5))` is a generator, we can use `for i in generator:` or `next(generator)` syntax to iterate it.

keyword `yield` can be used to generate a generator.
```  
    def yield_test():
        for i in range(5):
            yield i
    generator = yield_test()
    print(generator)  #<generator object yield_test at 0x0000000002716E08>
    for i in generator:
        print(i)      # 0, 1, 2, 3, 4
```

### how generators work?
the superpower of a generator is that it can be paused and then resumed at any time from any function. How is that possible? 
A generator has multiple entry points and exit points, when the execution encouters a yield statement, the local state of the function is preserved, and the flow of control goes back to the caller. Once the generator is resumed (using next, send or for loop), the execution continues from the preserved state.











### References
https://hackernoon.com/the-magic-behind-python-generator-functions-bc8eeea54220
