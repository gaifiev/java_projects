package DZ_3;

// Пусть дан произвольный список целых чисел, удалить из него четные числа
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class dz_2 {
    public static void main(String[] args) {
        List<Integer> array = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i) % 2 != 0) {
                array.remove(i);
            }
        }
        System.out.println(array);
    }
}
