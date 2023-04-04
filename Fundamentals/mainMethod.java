class mainMethod{
    
    //jvm is responsible for the class contains main() or not 
    //and checking for weather main() is declare properly or not at runtime, not compiler

    // public static void main(String[] x){ // jvm search for this signature(otherwise NosuchMethodError:main)
        
    //     //static allow jvm to call it without any object of class
    //     // public make main() accessible form anywhere
    //     //main is name which is configure inside the jvm(java virtual machine)
    //     //static public is also valid 

    // }

    //final Synchronized and strictfp is valid modifiers for main()
    final static strictfp synchronized public void main(String... x){
        //public static int void main(String... x) // not valid becoz of int 
        //static public void Main(String... x)     // not valid becoz of M
        //public synchronized strictfp final void main(String... x) // not valid static missing
        //public final static void main(String x) // not valid (var-arg)

        //public strictfp synchronized static void main(String... m) //valid
        System.out.println("hello world");
    }

}
class test extends mainMethod{
    //perants main method will be executed while child class executing (if not exist)
}