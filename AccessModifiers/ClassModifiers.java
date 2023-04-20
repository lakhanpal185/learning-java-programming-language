// for top level class modifiers -->
// 1. public 
// 2. <default>
// 3. final
// 4. strictfp
// 5. abstract

// but  forr the inneer class there is more 
// 1. public 
// 2. <default>
// 3. final
// 4. strictfp
// 5. abstract
// 6. static
// 7. private
// 8. protected

//1. public class:  can access that class from any where
// package pack1;
// public class ClassModifiers{
//     public void m1(){
//         System.out.println("hello dear");
//     }
// }

// write this code in another file
// packagepack1.ClassModifiers 
// import pack2;

// class ClassModifiersb{
//     public static void main(String []args){
//             ClassModifiersA a = new ClassModifiersA();
//             a.m1();
//     }
// }
// run by java pack2.ClassModifiers

