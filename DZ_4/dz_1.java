package DZ_4;
// 1.Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.

import java.util.*;

public class dz_1 {
    public static void main(String[] args) {
        StringBuilder input = new StringBuilder();
        List<Integer> array = new LinkedList<Integer>();
        array.add(1);
        array.add(2);
        array.add(3);
        array.add(4);
        array.add(5);
        array.add(6);
        array.add(7);
        array.add(8);
        array.add(9);
        for (int i = 0; i < array.size(); i++) {
            input.append("[" + array.get(i) + "] ");
        }
        System.out.println("Неперевернутый массив - " + input);
        pereverniList(array);
    }

    public static void pereverniList(List<Integer> ara) {
        StringBuilder input = new StringBuilder();
        for (int i = (ara.size() - 1); i >= 0; i--) {
            input.append("[" + ara.get(i) + "] ");
        }
        System.out.println("Перевернутый массив - " + input);
    }
}
