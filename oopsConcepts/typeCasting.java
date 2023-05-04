// type casting in between the class
// the general syntax:
// A  b = (c) d;


// There are several rules that you need to keep in mind when performing type casting.
// These rules are as follows:

// You can only cast between compatible data types.
// int num = 10;
// double doubleNum = (double) num; // valid casting
// String str = "10";
// int invalidNum = (int) str; // invalid casting - ClassCastException will be thrown

// Narrowing conversions may result in data loss: When casting from a larger data type to a smaller data type, such as 
// from a double to an int, you may lose precision or encounter overflow errors.
// double doubleNum = 10.5;
// int intNum = (int) doubleNum; // valid casting, but may result in data loss

// Casting an object to an incompatible type will result in a ClassCastException: If you attempt to cast an object to a type 
// that is not compatible with the object's actual type, a ClassCastException will be thrown at runtime.
// Object obj = "Hello";
// String str = (String) obj; // valid casting
// Object obj2 = 10;
// String invalidStr = (String) obj2; // invalid casting - ClassCastException will be thrown

// You cannot cast a primitive data type to an object data type, and vice versa: You cannot directly cast a 
// primitive data type to an object data type or an object data type to a primitive data type.
// int num = 10;
// Integer objNum = (Integer) num; // invalid casting - cannot cast primitive data type to object data type
// Integer objNum2 = 10;
// int num2 = (int) objNum2; // invalid casting - cannot cast object data type to primitive data type

// Upcasting is automatic and does not require an explicit cast: Upcasting is the process of casting a subclass object 
// to a superclass object. This is automatically done by Java and does not require an explicit cast.
// class Animal {
//   void makeSound() {
//     System.out.println("Animal is making a sound");
//   }
// }
// class Cat extends Animal {
//   void makeSound() {
//     System.out.println("Meow");
//   }
// }
// Animal catObj = new Cat(); // upcasting is automatic and does not require an explicit cast