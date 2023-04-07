import java.lang.Math;
class IncDrcArithematic{
    public static void main(String... p){
        int x = 10;
        System.out.println(x++); // o/p = 10
        System.out.println(x); // o/p = 11

        x = 10;
        System.out.println(++x); //o/p = 11;


        int y = 10;
        System.out.println(y--); // o/p = 10
        System.out.println(y); // o/p = 9

        y = 10;
        System.out.println(--y); //o/p = 9;
        // ++(++x) not allow
        //const x =8 then x++ is not allow{ same for final}
        // we can apply on every primitive data type
        byte b = 102;
        System.out.println(b);
       // b = b+1  error becoz b+1 produce int (produced type = max(type of 1st operand , type of 1st operand, int))   
       b++; // works fine becoz it has inbuilt auto cast
        System.out.println(b);
        
       byte b1 = 10, b2 = 20;
       // byte b3 = b1 + b2; error possible loss of precisen
        
        //arthematic operations 
        //int, short, long , byte  if the infinity is the result 
        // then it produces ArithematicException (AE 1 by zero)
        //but for floating point numbers there is always a way to represent infinity
        //for this float and double class contains 
         //     positive_Infinity = Infinity
         //     negative_Infinity = -Infinity
        
        //NaN : NotaNumber
        // integral arithemative  when the result is undefine  then it produce AE
        // but duoble and float classes contains
        //NaN
        System.out.println(Math.sqrt(4));
        System.out.print(Math.sqrt(-4)); //NaN
        //x != NaN is only true

        
    }
}