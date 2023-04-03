// primetive type int x = 10;
// reference type student s = new student()

//baseed on purpose and position of declaration
class varType{
    String s;
    int x;
    boolean b;
    static String programmer_name = "lakhan pal";  // this is also works static String programmer_name;
    public static void main(String []args){
        //instance variables(object level variables)
        //System.out.println(x) err bcoz of static function
         varType t = new varType();
         System.out.println(t.s);
         System.out.println(t.x);
         System.out.println(t.b);


         //static variables - when value of variable is not varied from object-object
         // that means only one copy for all instance of variable        
         varType[] t2 = new varType[10];
         System.out.println(t2[1].programmer_name);
         System.out.println(t2[3].programmer_name);
         System.out.println(programmer_name);
         varType.programmer_name = "hitesh kumar";
         System.out.println(varType.programmer_name);//recommanded


        //local variable/stack variable/automatic varible - local to the scope
        int y = 34;
        System.out.println(y); 

        // static int p = 34;
        // System.out.println(p); 

    }
    
}