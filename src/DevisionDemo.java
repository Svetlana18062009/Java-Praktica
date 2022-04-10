public class DevisionDemo {
    public static void main(String[] args) {
        int iresult, iremain; // для деления целых чисел
        double dresult, dremain;// для деления чисел с точкой
        //деление целых чисел
        iresult=10/3;
        iremain=10%3;
        System.out.print("Частное от деления 10/3 равно ");
        System.out.println(iresult + ", остаток равен " + iremain);
        //Деление чисел с точкой (double)
        dresult=10.0/3.0;
        dremain=10.0%3.0;
        System.out.print("Частное от деления 10.0/3.0 равно ");
        System.out.println(dresult + ", остаток равен " + dremain);
    }
}
