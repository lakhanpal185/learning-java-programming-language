// adapter class is a class which provide empty implemetation for interface so that we dont hava
// to provide implementation to every function 
// ex.
interface inter{
    void m1();
    void m2();
    void m3();
}

abstract class Adapter implements inter{
    public void m1(){}
    public void m2(){}
    public void m3(){}
    public static void main(String[] args){
        System.out.println(" hello, just do it");
    }
}