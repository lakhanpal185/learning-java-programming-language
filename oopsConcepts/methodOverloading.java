class main{
    public int add(int a,int b){
        System.out.println("int add is called");
        return a+b;
    }

    public double add(double a,double b){
        System.out.println("double add is called");
        return a+b;
    }

    public String add(String str1,String str2){
        System.out.println("string add is called");
        return str1 + str2;
    }

    public static void main(String[] args){
        main m = new main();
        System.out.println( m.add(23,90));
        System.out.println( m.add(200,90.9));
        System.out.println( m.add(20.34,90));
        System.out.println( m.add("hello","lakhan"));

       // System.out.println("the function "+ add("hello",90));
        //         we get error :
        //         methodOverloading.java:22: error: no suitable method found for add(String,int)
        //         System.out.println("the function "+ add("hello",90));
        //                                             ^
        //     method main.add(int,int) is not applicable
        //     (argument mismatch; String cannot be converted to int)
        //     method main.add(double,double) is not applicable
        //     (argument mismatch; String cannot be converted to double)
        //     method main.add(String,String) is not applicable
        //     (argument mismatch; int cannot be converted to String)
        // 1 error

        //because automatic promotion in overloading,basicly what compiler does it tries to converting arguments by 
        //upcasting find for the match function  
        // Overloading methods may have different access modifiers (e.g., public, private, protected), but they must be in the same class.
    }

}