class SingletonClass{
    private static SingletonClass obj;
    private SingletonClass(){
        System.out.println("i am constructor");
    }   

    public static SingletonClass getSingletonClass(){
        if(obj == null){
            obj = new SingletonClass();
        }
        else{
            System.out.println("factor method");
        }
        return obj;
    }

    
    public SingletonClass clone(){
         return this;
    }
}

class test{
    public static void main(String[] args){
        SingletonClass obj0 = SingletonClass.getSingletonClass();
        SingletonClass obj1 = SingletonClass.getSingletonClass();
        SingletonClass obj2 = SingletonClass.getSingletonClass();
        SingletonClass obj3 = SingletonClass.getSingletonClass();
    }
}
//similarly we can create double ton as well