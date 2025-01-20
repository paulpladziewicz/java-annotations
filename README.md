# Demystifying Java Annotations

A lot of the "magic" of Java is rooted within annotations, especially when working with libraries and frameworks. If we understand how annotations work in Java, we'll have an easier time developing applications.

Here is a simple example in code.

First know, it is not always obvious what an annotation does or what values you need to pass. You have to read the documentation for each one.

Second, reflection is utilized to discover what members of a class have annotations. For example, if we want to find out what methods have annotations, we can call `getMethods` on a class, loop through the methods while calling `getAnnotation(AnnotationType.class)`, and see if the annotation we're looking for is applied. Then, we can read the values passed and do something with them.

It's not that bad!

## Compile & Run

```sh
java *.java
java Main
```




