



### what is serialVersionUID and why? 
`serialVersionUID` is a version number for a seriable class, ued during deserialization to verify that the sender and receiver of a serialized object are compatible with respect to serialization. If serialized object and deserialized class have different `serialVersionUID`, the deserialization will result in an `InvalidClassException`.

`serialVersionUID` should be explicitly declared. If not, this version number will be computed depending on the compiler implementations, and the deserialization may result in unexpected `InvalidClassException`

