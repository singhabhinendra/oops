class shop{

    final void get(){
        String  a = "brijwasi enterprises";
        String b="britania industries";
        System.out.println(a+"and "+b+"both are good in their product manufacturing" );
    }
}
class product{    //by using final in class .
    void get(){
        System.out.println("Hello BHARTIYA");
    }

}


public class use_final_method_sample {
    public static void main(String[] args) {
        product a= new product();
        shop b=new shop();
        a.get();
        b.get();
    }
}
