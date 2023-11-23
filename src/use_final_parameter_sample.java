class xyx{
    int b=5;
    void get (final int b){
        System.out.println(b);
    }

}

public class use_final_parameter_sample {
    public static void main(String[] args) {
        xyx A=new xyx();
        A.get(15);
    }
}
