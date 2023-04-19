//public,private,default,protected
//public --accesible from any where if class is also public
//private accessible only within class
//default -- only within same packege
//protected --every where within the package + outside package only in child class
package pack1;
class A{
    public  void m(){
        System.out.println("hello__");
    }
}


package pack2;
import pack1.A;
class B{
    public static void main(String []args){
        A a = new A();
        a.m();
        System.out.println("hello__mq");
    }
}