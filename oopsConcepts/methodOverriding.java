class Animal{
    public void makeSound(){
        System.out.println("any  animal \"sound\"");
    }
}

class Cat extends Animal{

    // The @Override annotation is used to indicate that the makeSound 
    // method in the Cat class is intended to override the makeSound method in the Animal class.
    @Override
    public void makeSound(){
        System.out.println("meow");
    }
    public static void main(String args[]){
        Cat ct = new Cat();
        ct.makeSound();
    }
}