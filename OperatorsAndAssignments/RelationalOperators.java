class RelationalOperators{
        public static void main(String []args){
            if(10 > 20)
               System.out.print("true");
            if('a' < 'b')
               System.out.print("true");
            if(10 <= 20.0)
               System.out.print("true");
            if('a' < 125)
               System.out.print("true");

            //not appled on objects
            //nesting is not valid
            String s1 = new String("lakhan");
            String s2 = new String("lakhan");

            System.out.print(s1 == s2); 
            System.out.print(s1.equals(s2)); 
            //equality operators
            if(10 == 10.0) 
            System.out.println("true"); 
             
            if(true == true) 
            System.out.println("true");

            
            if(10.4 == 10.0) 
            System.out.println("true");
            else 
            System.out.println("false");
            // == is also appled on object reference also 
            // r1 == r1 if then points same object


            //instanceof operators
            Short s = 19;
            String str1 = new String("hey");
            boolean b;
            b = (str1 instanceof String);
            System.out.println(b);

        }
}