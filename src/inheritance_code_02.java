
class D{
    void get(){
        System.out.println("hello");
    }
}
class E extends D{
    void display(){
        System.out.println("abhinendra");
    }
}
class F extends D{
    void calling(){
        System.out.println("singh");
    }
}
public class inheritance_code_02{
    public static void main(String[] args) {
        D d=new D();
        d.get();
//        a.display()://it gives error
        E e=new E();
        e.get();
        e.display();
        F f=new F();
        f.get();
       // f.display();
        f.calling();
    }

}
