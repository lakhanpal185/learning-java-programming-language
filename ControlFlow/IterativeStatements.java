class IterativeStatements{
    public static void main(String[] args){
        for(int i = 0; i < 10; ++i){
            System.out.println(i);
        }

        //for( init_section; condi_expression; increment/decrements) // all are optional
        //initilization -only once, multiple variables, like int i = 0,j = 0(same type int),
        //we can write any java valid statement including s.o.p() also
        int j= 0;
        for(System.out.print("hi"); j < 3; ++j){
            System.out.print("bye");
        }
        //condion result must be boolean by default it is true 

        int i = 10;
        while(i < 20){
            System.out.print(i+" ");
            ++i;
        }

        // while(true){  
        //     System.out.print("hello");
        // }
        // System.out.println("hi");  //unreachable error

        //do while
        do{  
            System.out.println("hello world "+i);
            i--;
        }while(i > 0);

        // do
        //     System.out.println("hello world "+i);
        // while(true);//infinite loop //carefull            

        // do while(true); valid
        // while(false); valid

        //foreach loop
        int []a= {13,43,54,86,23,545,90};
        for(int x : a){
            System.out.print(x+" ");
        }
    }
}