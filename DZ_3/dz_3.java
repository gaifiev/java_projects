package DZ_3;
// Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.

import java.util.Collections;
import java.io.IOException;
import java.util.ArrayList;

public class dz_3 {
    public static void main(String[] args) throws IOException {
        int input = 0;
        int input1 = 0;
        int i = 0;
        ArrayList<Integer> array = new ArrayList<Integer>();
        array.add(8);
        array.add(5);
        array.add(3);
        array.add(9);
        array.add(15);
        array.add(11);
        array.add(10);
        array.add(16);

        for (int j : array) {
            input += j;
            input1++;
        }
        i = input / input1;
        System.out.printf("Среднее арифмитическое: %d\n", i);
        System.out.printf("Максимальное: %d\n", Collections.max(array));
        System.out.printf("Минимальное: %d\n", Collections.min(array));
    }
}
