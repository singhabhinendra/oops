
class fac{
    String name;
    int  coll;
    public void print(String  name){
        System.out.println(name);
    }
    public void print(int coll){
        System.out.println(coll);

    }
    public void print(String name , int coll ){
        System.out.println(name+" "+ coll);
    }

}
public class overloading {
    public static void main(String[] args) {
        fac s1=new fac();
        s1.name="abhinendra singh";
        s1.coll=21806;
        s1.print(s1.name,s1.coll);

    }
}
