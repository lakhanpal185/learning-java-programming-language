// interface : any service requirement spacification or any contruct between clinet and servies
//             provider or 100 % pure abstract class is called interface
// advantage: security, easy enhancement(no change in outside view), differnet system can communicate
interface interf{
    void ma1(); // by default public abstract void ma1()
    void ma2();
}
abstract class interfaceDetails implements interf{
        // if abstract is not then we have to provide implementation for all methods
        public static void main(String [] args){
            System.out.println("going to use interface methods BUT NOT ");
        }
        public void ma1(){ // this must be public other wise we will get an error

        }
}

//class can extends only one class but multiple interfaces
// like class A implements interf1,interf2
// class A extends B implements interf1,interf2
// interface also can extends any no of interfaces
interface A{

}
interface B{

}
interface AB extends A,B{
    
}

// some points about the interface variables and methods
// variables : the variable are by default public static final weather we are declaring or not

interface interf{
    int x = 0; // this is public static final int x
}
//  static : the implenetation class can use it without the object
// public : make it available for all the implementing class
// final : make it unchangable by any method
// must be initialize at the time of declaraton

// methods : methods are by default public abstract void 
//          this make it available to implementation class

