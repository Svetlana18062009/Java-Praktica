public class Light {
    public static void main(String[] args) {
        int lightSpeed=186000;
        long days =1000;
        long seconds;
        long distance;
        seconds=days*24*60*60;//
        distance= lightSpeed*seconds;
        System.out.print("За " + days);
        System.out.print(" Дней свет пройдет около ");
        System.out.println(distance + " миль. ");

    }
}
