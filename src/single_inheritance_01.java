class G{
    void get(){
        System.out.println("hello");
    }
}
class H extends D{
    void display(){
        System.out.println("abhinendra");
    }
}

public class single_inheritance_01{
    public static void main(String[] args) {
        G g=new G();
        g.get();
        H h=new H();
        h.get();
        h.display();
    }

}