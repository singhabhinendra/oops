//1. Write a Java program to create a class called Animal with a method called makeSound().
// Create a subclass called Cat that overrides the makeSound() method to bark.
import java.util.Scanner;
class animal{
    public void makeSound() {
        System.out.println("makesound");
    }
}
    class Cat extends animal {
        @Override
        public void makeSound() {
            super.makeSound();
            System.out.println("bark");
        }
}
public class inheritance_problems {
    public static void main(String[] args) {
        animal b=new animal();
        Cat c=new Cat();
        b.makeSound();
        c.makeSound();
    }
}
