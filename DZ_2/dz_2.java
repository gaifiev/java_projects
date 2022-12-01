// ДЗ 2. 
// Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл.
package DZ_2;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class dz_2 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Введите числа через пробел: ");
        String[] str = input.nextLine().split(" ");
        int array[] = new int[str.length];
        input.close();
        for (int i = 0; i < str.length; i++) {
            array[i] = Integer.parseInt(str[i]);
        }
        sort(array);
        System.out.printf("Пузырёк сортирован: ");
        printarray(array);
    }

    static void sort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
            transcription(i, array);
        }
    }

    static void printarray(int array[]) {
        for (int i = 0; i < array.length; ++i)
            System.out.print(array[i] + " ");
    }

    static void transcription(int i, int[] j) {
        try (FileWriter notation = new FileWriter("dz_2/log.txt", true)) {
            if (i == j.length - 2) {
                notation.append(i + 1 + ". итерация - " + Arrays.toString(j) + "\n\n");
            } else {
                notation.append(i + 1 + ". итерация - " + Arrays.toString(j) + "\n");
            }
            notation.close();
        } catch (IOException e) {
            System.out.println(e.toString());
        }
    }
}
