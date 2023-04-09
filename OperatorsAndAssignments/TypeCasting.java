class TypeCasting{
    public static void main(String[] args){
        //implicite type casting(widening)
        byte b = 10;
        short s = 12;
        int i = 2034;
        float f = 134.03f;
        double d = 10;

        System.out.println(b);//auto int to double
        System.out.println(s);
        System.out.println(i);
        System.out.println(f);
        System.out.println(d);
        double x =  b;
        System.out.println(x);
        
        x = s;
        System.out.println(x);     

        x = i;
        System.out.println(x);

        i = 'a';
        System.out.println(i);

        //explicit typecasting(narrowing)
        byte be = (byte) 130;
        System.out.println("the be loss theire precission: "+be);

        //assigment operators
        int z = 19; // simple assignment
        System.out.println(x);
        //int a= b = c; //chained assignment
        //z += a;   //compound assignment

        //conditional assignment 
        boolean var;
        var = (23 > 12)? true: false;
        System.out.println(var);

        var = (23 > 12)? true: (23 < 24)? true:false;
        System.out.println(var);
    }
}