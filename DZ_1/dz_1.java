// Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
package DZ_1;

import java.util.Scanner;

public class dz_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); // считывает с консоли
        System.out.print("Введите число n для нахождения n-го треугольного числа: "); // вывод в терминал
        int n = in.nextInt(); // считывает и возвращает введенное число
        in.close(); // завершает потоки
        int t = 0;
        // t = (n + 1) * n / 2;
        for (int i = 0; i <= n; i++) { // цикл вычисления
            t += i;
        }
        System.out.println(String.format("треугольное число %d=%d", n, t)); // вывод в терминал и форматирование строки
    }
}
