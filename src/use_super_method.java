class jkl{
    int marks=10;
    void get(){
        System.out.println("hello");
    }
}
class mkl extends jkl {
    int marks = 90;

    void get() {
        System.out.println(marks);//marks i.e. local variable is printed because of first priority.
        System.out.println(super.marks);//super class is printed.
        }
        void display () {
            super.get();
        }
    }

    public class use_super_method {
        public static void main(String[] args) {
            mkl p=new mkl();
            p.get();
            p.display();
        }
    }





