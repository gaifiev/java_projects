package DZ_5;
// 1.Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.

import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;

public class dz_1 {

    public static void main(String args[]) {

        directory book = new directory();
        book.add("Vitaly", "1111111111");
        book.add("Olga", "2222222222");
        book.add("Vitaly", "33333333333");
        book.add("Olga", "44444444444");
        book.add("Рома", "5555555555");
        book.add("Игорь", "6666666666666");
        book.add("Vitaly", "7777777777777");
        book.add("Макар", "88888888888");
        book.add("Андрей", "9999999999999");
        book.add("Андрей", "00000000000");

        System.out.println("Виталий: " + (book.get("Vitaly")));
        System.out.println("Ольга: " + (book.get("Olga")));
        System.out.println("Рома: " + (book.get("Рома")));
        System.out.println("Игорь: " + (book.get("Игорь")));
        System.out.println("Макар: " + (book.get("Макар")));
        System.out.println("Андрей: " + (book.get("Андрей")));
    }
}

class directory {
    private static Map<String, List<String>> directoryA = new HashMap<>();
    private static List<String> phone_numberA;

    public void add(String surname, String phone_number) {
        if (directoryA.containsKey(surname)) {
            phone_numberA = directoryA.get(surname);
            phone_numberA.add(phone_number);
            directoryA.put(surname, phone_numberA);
        } else {
            phone_numberA = new ArrayList<>();
            phone_numberA.add(phone_number);
            directoryA.put(surname, phone_numberA);
        }

    }

    public List<String> get(String surname) {
        return directoryA.get(surname);
    }

}
