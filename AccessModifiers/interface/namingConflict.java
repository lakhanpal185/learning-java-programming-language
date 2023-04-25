interface interf_left{
    public void method1();
}
interface interf_right{
    public void method1();
}
class test implementation interf_left,interf_right;
{
    public void method1(){

    }
}
//when same signature and same return type --> only one method implementation is provided


interface interf_left{
    public void method1(int a);
}
interface interf_right{
    public void method1();
}
class test implementation interf_left,interf_right;
{
    public void method1(){

    }
    public void method1(int x){

    }
    // method overloading
}
// if method contains diff args then if can overload the these methods and provide seperate implemetation
//if methods conatain same signature and diff retrurn type then we can not implement them simultaneously
interface interf_left{
    int x = 93;
}
interface interf_right{
    int x = 78;
}
class test implementation interf_left,interf_right;
{
    public static void main(String []args){
        System.out.println("the value of x is ambiguoues " + interf_left.x + " "+ interf_right.x);
        // we can access it like that interf_left.x
        // interf_right.x; becoz they are static