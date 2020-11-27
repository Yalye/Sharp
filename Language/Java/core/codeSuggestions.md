





### Q&A

#### How to avoid null checking `if (myReturn != null) {myReturn.doSth();}`?
 * if null isn't a valid value, use `assert`
 * if null is a valid value:
    * if return value is containers, return empty container.
    * to do