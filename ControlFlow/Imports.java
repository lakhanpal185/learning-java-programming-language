import java.util.ArrayList; //explicit class import
import java.util.*;         //implicit class import we can use fullyQualified name as well

//java.util.*; import all  the class and interfaces present in this packege ,but not subpackegeclass
//System class  is in default packege(current working directory)

import static java.lang.Math.*; //static import we can directly use static mathods and variables
import static java.lang.Math.sqrt;

class Imports{  
    public static void main(String[] args){
            Date d = new Date();
            System.out.println(d);
            System.out.println(sqrt(16));
            
            System.out.println(random());
            System.out.println(max(23,43));

            //some point about the System.out.println
            //here System is a class name
            //out is the static variable of printStream class which is persent in System class
            //println() is the function of printStream class
            
    }
}