abstract class RBI{
    RBI(){
        System.out.println("welcome to RBI");}
        abstract void rateofInterest();
        void ppf(){
            System.out.println("ppf rate of interest is 7.5%");
        }
    }
    class sbi extends RBI{
    void rateofInterest(){
        System.out.println("rate of interest of sbi is 3.5%");
    }
}
class hdfc extends RBI{
    void rateofInterest(){
        System.out.println("rate of interest is 4.9%");
    }
}




public class abstraction_bank {
    public static void main(String args[]){
        sbi s=new sbi();
        s.rateofInterest();
        s.ppf();
        hdfc h=new hdfc();
        h.rateofInterest();
        h.ppf();
    }

}
