package Lab8.exercise1;

public class TestVehicle {
    public static void main(String[] args) {
        Car car1 = new Car();
        System.out.println(car1);
        Car car2 = new Car(60000,5,1.7,2000,"Mazda","RX-7 Spirit R",2,"02 KY 392");
        System.out.println(car2);
        Car car3 = new Car(132000,4.85,1.46,1950,"Audi","RS6",5,"20 KY 101");
        System.out.println(car3);


        Bicycle bicycle1 = new Bicycle();
        System.out.println(bicycle1);

        Bicycle bicycle2 = new Bicycle(500,1.5,1.0,50,"Raleigh","Blazer",4,false);
        System.out.println(bicycle2);

    }

}
