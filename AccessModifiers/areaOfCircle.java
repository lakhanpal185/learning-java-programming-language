import java.util.Scanner;

class Area{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the radius of circle: ");
        int radius = sc.nextInt();
        
        double area = (double)Math.PI*radius*radius;
        System.out.println("the area of "+radius + " " + area);

        System.out.println("the square root of x is "+ Math.sqrt(4));

    }
}