class A{
    void get(){
        System.out.println("hello");
    }
}
class B extends A{
    void display(){
        System.out.println("abhinendra");
    }
}
class C extends B{
    void calling(){
        System.out.println("singh");
    }
}
public class inheritance_code_01 {
    public static void main(String[] args) {
        A a=new A();
        a.get();
//        a.display()://it gives error
        B b=new B();
        b.get();
        b.display();
        C c=new C();
        c.get();
        c.display();
        c.calling();
    }

}
