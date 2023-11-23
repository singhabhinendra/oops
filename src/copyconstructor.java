//copy constructor
class faculty {
    String name;
    int age;

    public void printinfo() {
        System.out.println(this.name);
        System.out.println(this.age);
    }

    faculty(faculty s2) {
        this.name = s2.name;
        this.age = s2.age;
    }
    faculty (){

    }
}


public class copyconstructor {
    public static void main(String[] args) {
        faculty s1 = new faculty ();
        s1.name = "abhinendra";
        s1.age = 24;
        faculty  s2 = new faculty (s1);
        s2.printinfo();

    }
}

