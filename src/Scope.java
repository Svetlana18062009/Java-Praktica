public class Scope {
    public static void main(String[] args) {
        int x;
        x=10;
        if (x==10){
            int y=20;
            System.out.println("x + y:" + x + " " + y);
            x=y*2;
        }
       // y=100;// переменная недоступна
        System.out.println("x равно " + x);
    }
}
