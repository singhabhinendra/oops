
//final keyword is used in class.
final class name{
    void get(){
        int a=89;
        int b=79;
        System.out.println(a+b);
    }
}
class cd{
    void attain(){
        int n=45;
        int b=87;
        System.out.println(n*b);
    }
}
public class use_final_class_sample {
    public static void main(String[] args) {
        name a=new name ();
        a.get();
        cd b=new cd();
        b.attain();

    }
}
