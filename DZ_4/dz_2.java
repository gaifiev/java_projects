package DZ_4;

// 2.Реализуйте очередь с помощью LinkedList со следующими методами:
// - enqueue() - помещает элемент в конец очереди,
// - dequeue() - возвращает первый элемент из очереди и удаляет его,
// - first() - возвращает первый элемент из очереди, не удаляя.

import java.util.LinkedList;
import java.util.List;

public class dz_2 {
    public static void main(String[] args) {
        StringBuilder inp = new StringBuilder();
        List<Integer> array = new LinkedList<Integer>();

        array.add(1);
        array.add(2);
        array.add(3);
        array.add(4);
        array.add(5);
        array.add(6);

        for (int i = 0; i < array.size(); i++) {
            inp.append(array.get(i));
            inp.append(" ");
        }
        System.out.println("Массив: " + inp);
        enqueue(array, 7);
        dequeue(array);
        first(array);

    }

    public static void enqueue(List<Integer> inp, int num) { // метод помещает элемент в конец очереди
        StringBuilder arr = new StringBuilder();
        for (int i = 0; i < inp.size(); i++) {
            arr.append(inp.get(i));
            arr.append(" ");
        }
        arr.append(num);
        System.out.println("помещает элемент в конец очереди: " + arr);
    }

    public static void dequeue(List<Integer> deq) { // метод возвращает первый элемент из очереди и удаляет его
        StringBuilder arr = new StringBuilder();
        for (int i = 1; i < deq.size(); i++) {
            arr.append(deq.get(i));
            arr.append(" ");
        }
        System.out.println("dequeue() - возвращает первый элемент из очереди и удаляет его: " + arr);
    }

    public static void first(List<Integer> firstelement) { // метод - first() - возвращает первый элемент из очереди, не
                                                           // удаляя.
        System.out.println("Возвращает первый элемент из очереди, не удаляя: " + firstelement.get(0));
    }
}
