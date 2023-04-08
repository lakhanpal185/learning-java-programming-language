import java.lang.Math;
class BitWise{
    public static void main(String []args){
        System.out.println(true & true);
        System.out.println(true & false);
        System.out.println(false & false);
        System.out.println(false & true);
        System.out.println(1 & 0);
        
        // System.out.println(1.0 & 0.0); not valid
        // System.out.println(true & 89); not valid
        System.out.println(89 & 10);

        //or operation
        System.out.println(true | true);
        System.out.println(true | false);
        System.out.println(false | false);
        System.out.println(false | true);
        System.out.println(1 | 0);
        
        System.out.println(89 | 10);

       //xor operation
        System.out.println(true ^ true);
        System.out.println(true ^ false);
        System.out.println(false ^ false);
        System.out.println(false ^ true);
        System.out.println(1 ^ 0);
        
        System.out.println(89 ^ 10);

        
        //complement operation
        // System.out.println(~true); not valid  this works on interger only
        
        System.out.println( ~4);
        System.out.println(!true); //only for boolean

        //short-circuit operators( && , ||) only for boolean both side will be evaluate
        int x = 10;
        int y = 17;
        boolean bln = false;
        if(x + y >= Math.sqrt(x-y) && Math.sqrt(x) > Math.sqrt(y) )
        bln = true;        
        System.out.println("its "+false);

        if(x + y >= Math.sqrt(x-y) || Math.sqrt(x) > Math.sqrt(y) )
        System.out.println("its is true "+ true);
        else
        System.out.println("its is "+ false);
    }
}