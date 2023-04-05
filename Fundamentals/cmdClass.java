class cmdClass{
    public static void main(String[] args){
        for(int i = 0; i < args.length; ++i){
            System.out.println(args[i]);
            //they are persent in string form
            //i/p = java cmdClass 78 89
            //o/p = 78 89
        }        
         if(args.length >= 2)
            System.out.println(args[0]+args[1]); //o/p = 7889 
    }
}