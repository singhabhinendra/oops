class nho{
    int marks;
    String name;
    nho(int marks,String name){
        this.marks=marks;
        this.name=name;
    }
}
class mjl extends nho{
    int rollno;
    mjl(int rollno,int marks,String name) {
        super(marks, name);
        this.rollno = rollno;}
            void display(){
                System.out.println(rollno+name+marks);

            }
        }
        public class use_super_constructor {
    public static void main(String[] args) {
        mjl n=new mjl(24,78,"abhinendra");
        n.display();

    }
}
