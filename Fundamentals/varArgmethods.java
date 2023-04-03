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
}