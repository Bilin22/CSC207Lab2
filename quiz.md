## In Java, We must define a class, and we must define a method
```
class Hello { 
  public static void main(String[] args) {
 // The method body will go here.
  System.out.println(7 + 5);
 }
}
```

## Declaration & Assignment
`int i = 42;`

we will have error if we:
1. did not declare a variable
2. declare variable to the wrong type
3. declare a variable to a type that already exists


## Reference Type and Primitive Type

Type String is a reference type. This is like what you are used to from Python. A Java variable cannot hold a String value directly inside itself; it can only hold a reference to an object of type String. But type int is a primitive type. 
A Java variable can hold an int value directly inside itself.

reference types (Capitalized Initial) in Java includes:
1. String
2. Integer
3. Object
4. Character
5. Double

## String

The following 2 ways are the same
`String s1 = new String("Hello");`
`String s2 = "bye";`

Notice, `String` object is immutable, while `String`s are mutable: we change perform changes on strings and yield a new one.

### String Operations and Methods

1. concatenation
`// We can't change s1 or s2, but we can make a new String out of them.
   String s3 = s1 + s2;`
2. other methods
```
// Indexing
   char c = s1.charAt(2);  // In Python: s1[2]
   // Slicing
   s1 = s1.substring(2, 4); // In Python: s1[2:4]

// Stripping
s1 = "   Here is my string  .   ";
s1 = s.trim();  // In Python: s1.strip()
```
There are many more useful methods, including length, startsWith, and indexOf. 