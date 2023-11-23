//here ,we made a student class and try to make constuctor(parameterised)  in the class student
class Student{
    String name;
    int age;
    public void printinfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
    Student (){
        System.out.println("constructed class");
    }
}
public class non_parameterised_constructor {
    public static void main(String[] args) {
        Student  s1=new Student();
        s1.name="abhinendra singh";
        s1.age=22;
        s1.printinfo();

    }
}
