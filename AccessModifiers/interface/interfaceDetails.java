// interface : any service requirement spacification or any contruct between clinet and servies
//             provider or 100 % pure abstract class is called interface
// advantage: security, easy enhancement(no change in outside view), differnet system can communicate
interface interf{
    void ma1(); // by default public abstract void ma1()
    void ma2();
}
abstract class interfaceDetails implements interf{
        // if abstract is not then we have to provide implementation for all methods

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