class finalVariable{
    public static void main(String []args){

       final int notuseme1;
       int notuseme2; // if we not using them the they are okay but if we use them without initialization they throws error


        System.out.println("Done!");
        // it is must to initialize the final variable
        // for normal varible jvm provide default initialization
        cal(20,78);

    }
    final int z;
    finalVariable()
    {
        z = 0; // 3rd way 
    }
    final int  x = 10; // first way
    final int  y;
    {
        y= 90; // 2nd way
    }

    //final with static
    final static int a = 10; // 1st way
    final static int b; 
    static {
        b = 89; // 2nd way 
    }

    static void cal(final int pt1, int pt2){
        // pt1 = 89; not allowed
        // pt = 234; not allowed
        System.out.println("pt: "+pt1+" pt2: "+ pt2);
    }
}