package pack1;
public class example{
    public void get(){
        System.out.println("(from the example class)this is public method accessible from any where");
        printname();
    }
    private void printname(){
        System.out.println("the hidden one \'lakhan\'");
        findme();
    }
    protected static void findme(){
       System.out.println("(protected method)u can access me from current package dirctly but in another use my child to do so");
    }
}


class find extends example{
    public static void main(String [] agrs){
        findme();
    }
}
