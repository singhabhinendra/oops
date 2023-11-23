 class abc{
     final int a=90;
     final int b=89;
    void get(){
        int  a=90;
        int b=45;
        System.out.println(a+b);

    }
 }


public class use_final_variable_sample {
    public static void main(String[] args) {
        abc c=new abc();
        c.get();
    }
}
