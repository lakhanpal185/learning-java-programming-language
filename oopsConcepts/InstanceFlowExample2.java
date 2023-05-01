class test{
    int i = 90;
    
    {
        System.out.println("1st block");
        System.out.println("calling m1 ...");
        m1();
    }

    public void m1(){
        System.out.println("i : "+i+"\nj : "+j);
    }

    test(){
        System.out.println();
        System.out.println("constructor called");
        m1();
        System.out.println();
    }

    public static void main(String [] args){
        test t = new test();
    }

    {
        System.out.println("2nd block");
    }
     
    int j = 10;
}

//instance control flow parent to child
class child extends test{
    int x = 40;
    
    {
        System.out.println("child 1st block");
        System.out.println("calling m2 ...");
        m2();
    }

    public void m2(){
        System.out.println("x : "+x+"\ny : "+y);
    }

    child(){
        System.out.println();
        System.out.println("child constructor called");
        m2();
        System.out.println();
    }

    public static void main(String [] args){
        child  ch = new child();
    }

    {
        System.out.println("child 2nd block");
    }
     
    int y = 50;
}

// it is obvious to first provide parents functionnality so that child can use it 
//o/p :
// 1st block
// calling m1 ...
// i : 90
// j : 0
// 2nd block

// constructor called
// i : 90
// j : 10

// child 1st block
// calling m2 ...
// x : 40
// y : 0
// child 2nd block

// child constructor called
// x : 40
// y : 50