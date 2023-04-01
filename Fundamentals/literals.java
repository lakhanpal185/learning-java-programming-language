class literals
{
    public static void main(String []args){
        int a = 2147483645;
        for(int i = 0; i < 5; i++)
        System.out.println(++a);

        long b = 21483648875l;
        System.out.println("\n" + ++b);
        // long b = 21483648875; // not valid
        //System.out.println("\n" + ++b);

        int octalVar = 010;
        System.out.println("octal var value : "+ octalVar + "\n\n");  
        
        // int hexaVar = 0Xfffffffff; // 0X1a =  16 + 10 
        // int i= 10;
        // while( i-- != 0)
        // System.out.println("hexa var value : "+ hexaVar);  

       //long hex = 0XfffffffffL; //not valid 
       //System.out.println(hex);
        
    //floating point literals

    //float  fl = 123.343; // not valid
        float  fl = 123.343f;
        System.out.println(fl);
        double bl = 2323.34;// 2323.34d is valid 
        System.out.println(bl);

      //  float  fle = 123.343d; not valid
      // System.out.println(fle);
        double ble = 2323.34f;// 2323.34f is valid(autotype casting) 
        System.out.println(ble);

        boolean boolt = true;
        boolean boolf = false;
        System.out.println("1 : "+boolt + " " + boolf);

        char ch = 'a';
        System.out.println((int)ch);
        char chA = 65; //decimal form 
        System.out.println(chA);
        System.out.println((int)chA);

        ch = 0x41; //octal form
        System.out.println(ch);
        
        String str = "hello alexa";
        System.out.println(str);

        ch = '\u0061'; //unicode "\u####"  
        System.out.println(ch);
       
    }
}