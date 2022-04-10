public class Vehicle {
    int passengers;
    int wheels;
    int maxSpeed;
    int burnUp;
    //объявляем метод.вычисляющий пройденный путь.
    // метод принимает параметр interval, задающий время.
    // и не возвращает никакого значения (void)
    void distance(double interval){
        double value = maxSpeed*interval;
        System.out.println("Пройдет путь,равный " +  value + "km.");
    }
}
 class VehicleMethodDemo{
     public static void main(String[] args) {
         Vehicle car= new Vehicle();
         car.passengers=2;
         car.wheels=4;
         car.maxSpeed=130;
         car.burnUp=30;
         // другой экземпляр класса vehicle
         Vehicle bus=new Vehicle();
         bus.passengers=45;
         bus.wheels=4;
         bus.maxSpeed=100;
         bus.burnUp=25;
         //рассчет пути.пройденного за 0.5 часа
          double time=0.5;
          System.out.print("Автомобиль с " + car.passengers + " пассажирами ");
         car.distance(time);
          System.out.print("Автобус с " + bus.passengers + " пасаажирами ");
          bus.distance(time);
     }
 }
