class StaticFlowExample{
    static int i = 80;
    static {
        System.out.println("1st static block executed");
    }
    static {
        System.out.println("2nd static block executed");
        i = 10;
    }

    public static void seeStatic(){
        System.out.println("Static function | i : "+ i);
    }

    public static void main(String []args){
        seeStatic();
    }
}