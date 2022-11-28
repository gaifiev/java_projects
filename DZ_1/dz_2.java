// Вывести все простые числа от 1 до 1000
package DZ_1;

public class dz_2 {
    public static void main(String[] args) {
        System.out.println("Простые числа от 1 до 1000: "); // вывод в терминал
        for (int i = 2; i <= 1000; i++) { // перебирает массив или числа
            for (int j = 2; j <= i; j++) {
                if (i % j == 0) { // делит числа сами на себя
                    if (i == j) {
                        System.out.printf("[" + i + "]"); // выводит простые чила
                    } else {
                        break; // выход из цикла
                    }
                }
            }
        }
    }
}
