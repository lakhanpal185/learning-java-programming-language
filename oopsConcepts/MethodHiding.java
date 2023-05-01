class Animal{
    public static void makeSound(){
        System.out.println("make any random sound");
    }
}
class Cat extends Animal{
    public static void makeSound(){
        System.out.println("meow");
    }
}

public class MethodHiding{
    public static void main(String [] args){
        Animal an = new Animal();
        Cat ct = new Cat();

        an.makeSound();// make any random sound
        ct.makeSound();// meow
        
        
        Animal an2 = new Cat();
        an2.makeSound();// make any random sound

    }
}