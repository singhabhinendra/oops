class xyz {
    int rollno;
    String name;

    void get(int rollno, String name) {
        this.rollno = rollno;
        this.name = name;
        this.display();
    }

    void display() {
        System.out.println(rollno + name);
    }
}

public class this_samplecode {
    public static void main(String[] args) {
        xyz a = new xyz();
        a.get(24, "riya");
    }
}

