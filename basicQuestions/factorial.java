import java.util.Scanner;
class fact{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("\n1 for factorial\n2 for pattern\nEnter choice: ");
        int choice = sc.nextInt();
        
        switch(choice){
            case 1:
                System.out.print("Enter number: ");
                int y = sc.nextInt();
                System.out.println(calfact(y));  
                break;
            case 2:
                System.out.print("Enter number of lines: ");
                int x = sc.nextInt();
                printPattern(x);
                break;
            default:
                System.out.print("wrong input");
            
        }
        
    }

    public static long calfact(int x){
        if(x == 1) return 1;
        return x*calfact(x-1); 
    }

    public static void printPattern(int r){
            for(int i  = 0; i < r; ++i){
                for(int j = 0; j <= i; ++j)
                    System.out.print("# ");
                    
                    System.out.println();
            }
    }
}