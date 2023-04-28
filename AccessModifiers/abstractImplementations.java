abstract class abs{
    public abstract int xboy();
}

class xclass extends abs{
    public int xboy(){
        return 9;
    }
}

class main extends xclass{
    public static void main(String []args){
        System.out.println("hello lakhan how is your coding going on...");
        main mn = new main();
        System.out.println("The rating is: " + mn.xboy());
    }
}