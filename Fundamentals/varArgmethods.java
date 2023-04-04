class varArgmethods{
    public static void main(String []args){
        fun(12,234,45,656);
        fun(12,234);
        fun(12,89,66);
        fun(12);
        fun1();
    }
    public static void fun1(int... x){
        System.out.println("var - arg method, hello");
    }
    public static void fun(int... x){
        int total = 0;
        for(int y : x){
            total += y;
        }
        System.out.println("var - arg method, sum: "+total);
     }
     // they get least priority than means if there exist a function 
    //  m1(int... x);
    //  m1(int ...x);
    //  m1(int y ,int ...x)
    //  m1(int ...y ,int x) // not valid
    //  m1(int ...y ,int ...x) // not valid only one var-arg parameter is allowed or we can say it does make sence
    
    
    // m1(int [] a)
    // m1(int ...x) we can not do this  in same class
}