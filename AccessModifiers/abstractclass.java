abstract class vehical{
    public abstract int wheels(); // this must not have implementation here

}

class bus extends vehical{
    public int wheels(){
        return 6;
    }
}

class car extends vehical{
    public int wheels(){
        return 4;
    }
}

// this is an abstract class the object creation for this, is not possible 
// abstract class example{
//     public static void main(){
//         System.out.println("hi");
//     }
// }

class bike extends vehical{
    public int wheels(){
        return 2;
    }
}

