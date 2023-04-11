class IfAndCase{
    public static void main(String[] args){
        int x = 9;
        if(x == 9) // if(param)// param must be boolean
            System.out.println("got result");
        
        // if(true)
        //     int c = 9; error single initialization not allow
        
        
        //case
        x = 9; // this x can be int ,char, byte, short and wrapperclass for it 
        final int y = 8;
        switch(x){
            case 1: //case expression: // this expression must be constant or constant expression // swith can be empty
                System.out.print(78);
                break;
            case y:
                System.out.print(2);
                break;
            case 9-2*3+6:
                System.out.println(9);
            case 10:
            case 11:
                System.out.println("9 < x");
                break;
            default:
                System.out.print("are!, bas kar bhai");
        }

    }
}