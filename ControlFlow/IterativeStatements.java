class IterativeStatements{
    public static void main(String[] args){
        for(int i = 0; i < 10; ++i){
            System.out.println(i);
        }

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
    }
}