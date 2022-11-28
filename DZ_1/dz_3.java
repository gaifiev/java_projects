// Реализовать простой калькулятор (операции + - / * )
package DZ_1;

import java.util.Scanner;

public class dz_3 {
    public static void main(String[] args) { // метод ввода, печати считает
        try (Scanner in = new Scanner(System.in, "866")) {
            System.out.println("Введите первое число: ");
            float number1 = in.nextFloat();
            System.out.println("Выберите операцию +, -, / или *: ");
            String operation = in.next();
            System.out.println("Введите второе число: ");
            float number2 = in.nextFloat();
            System.out.println(calc(number1, number2, operation));
        }
    }

    public static double calc(float first_number, float two_number, String operation) { // метод подсчета
        String sum_operation = "+";
        String subtraction_operation = "-";
        String division_operation = "/";
        String multiplication_operation = "*";
        if (operation.equals(sum_operation)) {
            return first_number + two_number;
        }
        if (operation.equals(subtraction_operation)) {
            return first_number - two_number;
        }
        if (operation.equals(division_operation)) {
            return first_number / two_number;
        }
        if (operation.equals(multiplication_operation)) {
            return first_number * two_number;
        } else {
            System.out.println("Ой, что-то пошло не так, повторите попытку позже =)");
            return 0;
        }
    }

}