class Vehicle{
    int passengers;
    int wheels;
    int maxspeed;
    int burnup;
}
public class VehicleDemo {
    public static void main(String[] args) {
      Vehicle car1=new Vehicle();
      car1.passengers=2;
      car1.wheels=6;
      car1.maxspeed=130;
      car1.burnup=30;
      double distance= car1.maxspeed*0.5;
      System.out.print("За полчаса car1 может проехать ");
      System.out.println(distance + "km.");
      car1=null;
    }
}
