
### 8 basic type
Character type: char  
Bool type: boolean
Number type: byte,short,int,long,float,double
another: void

 basic type variables are created in stack, not heap, more effective.

### wrapper class
|||
|--|--|
|char|Character|
|boolean|Boolean|
|byte|Byte|
|short|Short|
|int|Integer|
|long|Long|
|float|Float|
|double|Double|

 why? to make basic type become a object
 how? auto boxing and unboxing after Java SE5, i.e. `Integer a = 0; int b = a;`
 inside? valueOf() and xxxValue(), i.e. `Integer a = Integer.valueOf(0); int b = a.intValue();`
 where? 

### prefix
transient