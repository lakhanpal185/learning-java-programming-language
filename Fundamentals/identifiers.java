class identifiers{ //class name ,variable name , method name are indentifiers
    public static void main(String [] args){
        int intvar = 10;   //32bit
        byte bytevar = 39; //8bit 
        short shortvar = 78; //16bit
        long longvar = 97L; // 8bytes

        System.out.println("intvar : "+ intvar );
        System.out.println("bytevar : "+ bytevar );
        System.out.println("shortvar : "+ shortvar );
        System.out.println("longvar : "+ longvar );

        float floatvar = 89.90f;// 4 bytes
        double doublevar = 76.8; //8 bytes

        System.out.println("the double var value : "+ doublevar);
        System.out.println("the float var value : "+ floatvar);
        
        //this code explains the integer((int,byte,short -- auto type casting ),long) variables literals are by default int value
        //floating value literals are by default double type
    }
}