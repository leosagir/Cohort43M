public class Main {
    public static void main(String[] args) {
        /*
Задача 1
Пусть есть две переменные целого типа a и b. Используя логические операторы написать
выражение, результат которого будет true если значение хотя бы одной из этих переменных
 равно 10 или их сумма равна 10.
         */

        int a = 10;
        int b = 0;

       boolean result = (a == 10 || b == 0 || a + b == 10);
            System.out.println(result);
    }
}
