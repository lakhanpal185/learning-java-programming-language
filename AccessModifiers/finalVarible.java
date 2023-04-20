class finalVariable{
    public static void main(String []args){
        
        System.out.println("Done!");
        // it is must to initialize the final variable
        // for normal varible jvm provide default initialization

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
}