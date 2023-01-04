class sizeOfVar
{ 
    public static void main(String []args){
        System.out.println("datatype\tsize\trange");
        System.out.println("int\t\t"+ (Integer.SIZE/8) + "\t-"+Math.pow(2,31)+" to "+(Math.pow(2,31)-1));
        System.out.println("bytes\t\t"+ (Byte.SIZE/8) + "\t-"+Math.pow(2,7)+" to "+(Math.pow(2,7)-1));
        System.out.println("long\t\t"+ (Long.SIZE/8) + "\t-"+Math.pow(2,63)+" to "+(Math.pow(2,63)-1));
        System.out.println("short\t\t"+ (Short.SIZE/8) + "\t-"+Math.pow(2,15)+" to "+(Math.pow(2,15)-1));
    }
}