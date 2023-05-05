class A{
    static int a = 89;
}

class B{
    static int b = A.a;
}
class C{
    static int c = B.b;
}

class tightCoupling{
    static int x = C.c;
    public static void main(String []args){
        
        System.out.println("the value of x: "+x);
    }
}

// here as we can see that if want to change the x then we can to change in all the uper class as well
// this will increase code redundancy and decrease maintainability