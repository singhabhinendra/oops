public class use_this_parameter {
    int rollno;
    String name;
    float marks;
    use_this_parameter(int rollno,String name){
        this.rollno=rollno;
        this.name=name;
    }
    use_this_parameter(int rollno,String name,float marks) {
        this(rollno, name);
        this.marks=marks;
    }
        void display(){
            System.out.println(rollno+" "+name+" "+marks);
        }

    public static void main(String[] args) {
        use_this_parameter a=new use_this_parameter(24,"abhinendra");
        use_this_parameter b=new use_this_parameter(45,"abhi",76.89f);
        a.display();
        b.display();
    }
}
