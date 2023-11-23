class cvb{
    int rollno;
    String name;
    cvb(){
        int rollno=10;
        String name="abhinendra";
    }
    cvb(float marks){
        this();
        System.out.println(rollno +" " +" "+name+" " +marks);
    }
}
public class use_this_constructor {
    public static void main(String[] args) {
        cvb a=new cvb(76.3f);

    }
}
