abstract class caar{
    caar(){
        System.out.println("welcome to car manufacturing private limited");
    }
  abstract void features();
    void mandatory_features(){
        System.out.println("car should have four wheels");
        System.out.println("car should have two airbags and a stepni");
        System.out.println("car should have good engine and fuel tank");
        System.out.println("car should have  a stearing ,brake system and AC");
        System.out.println("car should have side mirrors and a gear box and good body");
    }
     abstract void fuel_average();


}
class tata extends caar{
    void fuel_average(){
        System.out.println(" average fuel of tata car is consumed by engine runs 20km/litre");
    }
    void features(){
        System.out.println("tata have more good engine and high reliability ");
        System.out.println("it have good and strong body");
        System.out.println("it have good manintenance service and good mechanic availability while any " +
                "fault is happened in the car");
    }
}

class mahindra extends caar{
    void fuel_average(){
        System.out.println(" average fuel of tata car is consumed by engine runs (15-18)km/litre");
    }
    void features(){
        System.out.println("mahindra have giant models in its car collection ");
        System.out.println("it have good body");
        System.out.println("it have good manintenance service and good mechanic availability while any " +
                "fault is happened in the car");
    }
}
class toyata  extends caar{
        void fuel_average(){
        System.out.println(" average fuel of tata car is consumed by engine runs (12-20)km/litre");
        }
        void features(){
            System.out.println("mahindra have classic and luxurious looking  models in its car collection ");
            System.out.println("it have good body and offroading cars");
            System.out.println("it have good manintenance service and good mechanic availability while any " +
                    "fault is happened in the car");

        }
}
public class abstraction_car {
    public static void main(String[] args) {
    tata c=new tata();
    c.features();
    c.fuel_average();
    mahindra m=new mahindra();
    m.features();
    m.fuel_average();
    toyata t=new toyata();
    t.features();
    t.fuel_average();
    }
}
