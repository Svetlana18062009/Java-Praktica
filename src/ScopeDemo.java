public class ScopeDemo {
    public static void main(String[] args) {
        int x;// переменная х видна во всем методе мэйн
        x=1;
        System.out.println("До вложенного блока : х равно " + x);
        {
            // новый блок создает новую область видимости
            /* переменная у доступна только внутри текущего блока.Но это не мешает ее использовать вместе с
             переменной х из внешнего блока
             */
             int y = 3;
             //здесь действуют обе переменные . х и у
            System.out.println("Внутренний блок : х равно " + x + ",y равно " + y);
            x = y * 3;
        }//конец вложенного блока
        /*если вы раскоментируете строку " у = 100", то получите ошибку компиляции: Переменная у
        в текущем блоке не объявлена
         */
        // y =100;
        //Как видите ,переменная х видна  во всей программе
        System.out.println("После вложенного блока: х равно " + x );
    }
}
