class classStatic{
    int x; // jvm provide 0 bydefault
    static int u = 999;
    public static void main(String[] args){
        // int x;  we have to provide initlization for this variable
        System.out.println("hello from the static main "+u);
        // hello(); can not call from static function to non static func 

        classStatic a = new classStatic();
        classStatic b = new classStatic();
        b.u = 111; // modifing from b's object 

        int c = a.u;//a.u and b.u referencing the same object
        System.out.println("(object a )here is the value of c : " + c);
        c = b.u;
        System.out.println("(object a )here is the value of c : " + c);
    }
    public void hello(){
        System.out.println("i am non static member (for non static member) x :"+ x);
    }
}

//some points about the static variables and functions  
// static members can be access from static area (functions) and from instance area
//non static can be accessed from non static only
//there is only one copy for all instance of static varibles
//inheritance is applicable on static methods inclueing main also
//