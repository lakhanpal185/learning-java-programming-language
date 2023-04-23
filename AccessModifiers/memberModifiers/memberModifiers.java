// ///public,private,default,protected
// //public --accesible from any where if class is also public
// //private accessible only within class
// //default -- only within same packege
// //protected --every where within the package + outside package only in child class
// package pack1;
// class A{
//     public  void m(){
//         System.out.println("hello__");
//     }
// }


// package pack2;
// import pack1.A;
// class B{
//     public static void main(String []args){
//         A a = new A();
//         a.m();
//         System.out.println("hello__mq");
//     }
// }

// one line answare of  memeber modifiers
// public:      public memeber are accessible from any where but that class must be public
// private:     these are accessible within the class only
// protected:   they can be access with the same packege by dirctly or by child and they can be access outside
//              the package by child only
// default:     can be accessed with the same package only
// final varibls: it is some thing which is not changes so it must be initialize --with in line, constructor, 
//                with a declaration following block local varibles also must be initialize before used 
// static (both) : they can be accessible from static and non functions and for multiple objects there is single copy of 
//                 these are shared we can for call non static function form a static function
// native(functions) :    This modifier is only for the function which define that the function is from the out side 
//              (in differnet language like c/c++)
// synchronized(variables) : this is only for functions it define that the at the time only one thread is allowed to be operate on the given object
// transient(variables) : (at serialization)IF we dont want to save the value of  a varible then we can use this modifer
//                        at the time of serialization jvm ignore original value of variable and default value will be serialized
// volatile(variables) : if the value of variable is keep changing then we shold use volatile.
//                        for each thread a seperate copy will be created
