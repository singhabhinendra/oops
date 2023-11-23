import java.util.Scanner;
//2. Write a Java program to create a class called Vehicle with a method called drive().
// Create a subclass called Car that
//overrides the drive() method to print "Repairing a car".

class vehicle{
    public void drive(){
        System.out.println("reparing a car");

    }
}
class car extends vehicle{
    @Override
    public void drive() {
        super.drive();
    }
}
public class inheritance_problems1 {
    public static void main(String[] args) {
    vehicle v=new vehicle();
    v.drive();
    car c=new car();
    c.drive();
    }
}
