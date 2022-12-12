package DZ_5;
// 2. Пусть дан список сотрудников:

// Иван Иванов
// Светлана Петрова
// Кристина Белова
// Анна Мусина
// Анна Крутова
// Иван Юрин
// Петр Лыков
// Павел Чернов
// Петр Чернышов
// Мария Федорова
// Марина Светлова
// Мария Савина
// Мария Рыкова
// Марина Лугова
// Анна Владимирова
// Иван Мечников
// Петр Петин
// Иван Ежов

// Написать программу, которая найдет и выведет повторяющиеся имена с количеством повторений. Отсортировать по убыванию популярности.

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Map;

public class dz_2 {
    public static void main(String[] args) {

        ArrayList<String> array = new ArrayList<>();
        array.add("Светлана Петрова");
        array.add("Кристина Белова");
        array.add("Анна Мусина");
        array.add("Анна Крутова");
        array.add("Иван Юрин");
        array.add("Петр Лыков");
        array.add("Павел Чернов");
        array.add("Петр Чернышов");
        array.add("Мария Федорова");
        array.add("Марина Светлова");
        array.add("Мария Савина");
        array.add("Мария Рыкова");
        array.add("Марина Лугова");
        array.add("Анна Владимирова");
        array.add("Иван Мечников");
        array.add("Петр Петин");
        array.add("Иван Ежов");

        Map<String, Integer> map = new HashMap<>();
        for (String item : array) {
            String[] nameArray = item.split(" ");
            var name = nameArray[0];
            if (map.containsKey(name)) {
                map.put(name, map.get(name) + 1);
            } else {
                map.put(name, 1);
            }
        }

        System.out.println("Вывод повторяющих имен с количеством повторений: " + map);

        Map<String, Integer> db = map;
        LinkedHashMap<String, Integer> sortMap = new LinkedHashMap<>();
        db.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .forEachOrdered(x -> sortMap.put(x.getKey(), x.getValue()));

        System.out.println("Отсортировать по убыванию популярности: " + sortMap);

    }
}
