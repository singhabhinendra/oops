//here it is a parameterised constructor used for student class.

class student{
    String name;
    int age;

    public student() {

    }

    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
    student(String name,int age){
        this.name=name;
        this.age=age;

    }
}

public class parameterised_constructor {
    public static void main(String[] args) {
        student s1=new student("abhinendra",24);
        s1.printInfo();
    }
}
