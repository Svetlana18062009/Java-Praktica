public class ExtendedBreakDemo {
    public static void main(String[] args) {
        for (int i = 1; i < 4; i++) {
            Блок1:
            {
                Блок2:
                {
                    Блок3:
                    {
                        System.out.println("\ni равно " + i);
                        if (i == 1) break Блок1;
                        if (i == 2) break Блок2;
                        if (i == 3) break Блок3;
// Эта команда не будет выполнена
                        System.out.println("Эта строка не напечатается");
                    } //   Конец блока Блок3
                    System.out.println("завершен Блок3");
                } // конец блока Блок2
                System.out.println("Завершен Блок2");
            } // Конец блока Блок1
            System.out.println("Завершен Блок1");
        } // for
        System.out.println("Конец цикла for");
    }
}
