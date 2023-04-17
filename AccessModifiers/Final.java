class p {
    public void get(){
        System.out.println("hey dear");
    }
    public final void find(){
        System.out.println("not here");
    }
}
class Final extends p{
    public static void main(String []args){
        System.out.println("did it happen");
    }
    
    public void find(){//Final.java:14: error: find() in Final cannot override find() in p
    }
}

//not allowed to make inherite of final class security increase
// final class d{ //if then all funtions are also final but not all varibles
//     public void say(){
//         System.out.println("hello ");
//     }
// }
// clas b extends d{}

//applicable on class , method and varible 

