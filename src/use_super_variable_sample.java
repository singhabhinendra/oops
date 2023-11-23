class jhk{
    int marks=10;
    void get(){
        System.out.println("hello");
    }
}
class njh extends jhk{
    int marks=90;
    void get(){
        System.out.println(marks);//marks i.e. local variable is printed because of first priority.
        System.out.println(super.marks);//super class is printed.
    }
}

public class use_super_variable_sample {
    public static void main(String[] args) {
        njh p=new njh();
        p.get();
    }
}
