package END;

import java.util.*;

public class sort {
    public static void main(String[] args) {

        notebook n1 = new notebook(1, 4, 128, "Windows 10", "gold", "Acer");
        notebook n2 = new notebook(2, 4, 256, "Windows 11", "white", "Asus");
        notebook n3 = new notebook(3, 8, 512, "Windows 10", "gold", "Acer");
        notebook n4 = new notebook(4, 16, 256, "Windows 11", "black", "HP");
        notebook n5 = new notebook(5, 32, 256, "Windows 11", "black", "HP");
        notebook n6 = new notebook(6, 32, 512, "Windows 11", "black", "HP");
        notebook n7 = new notebook(7, 32, 1024, "Windows 11", "black", "HP");
        System.out.println(n1.toString());

        System.out.println("Выберите функцию:");
        System.out.println("1 -> Фильтрация по RAM");
        System.out.println("2 -> Фильтрация по SSD");
        System.out.println("3 -> Фильтрация по операционным системам");
        System.out.println("4 -> Фильтрация по цвету");
        System.out.println("5 -> Фильтрация по брэнду");
        System.out.println("6 -> Весь ассортимент");
        Scanner db = new Scanner(System.in, "866");
        Integer select = db.nextInt();
        if (select == 1) {

            System.out.print("Введите значение RAM: ");
            Integer ram = db.nextInt();
            if (ram <= 4) {
                System.out.printf(n1.toString() + "\n" + n2.toString());
            } else if (ram <= 8) {
                System.out.printf(n3.toString());
            } else if (ram <= 16) {
                System.out.println(n4.toString());
            } else if (ram <= 32) {
                System.out.printf(n5.toString() + "\n" + n6.toString() + "\n" + n7.toString());
            } else
                System.out.println("Не найдено");

        } else if (select == 2) {

            System.out.print("Введите значение ssd: ");
            Integer ssd = db.nextInt();
            if (ssd <= 128) {
                System.out.printf(n1.toString());
            } else if (ssd <= 256) {
                System.out.printf(n2.toString() + "\n" + n4.toString() + "\n" + n5.toString());
            } else if (ssd <= 512) {
                System.out.printf(n3.toString() + "\n" + n6.toString());
            } else if (ssd <= 1024) {
                System.out.printf(n7.toString());
            } else
                System.out.println("Не найдено");

        } else if (select == 3) {

            System.out.print("Введите название ОС: ");
            Scanner db2 = new Scanner(System.in);
            String os = db2.nextLine();
            if (os.equals("windows")) {
                System.out.printf(
                        n1.toString() + "\n" + n2.toString() + "\n" + n3.toString() + "\n" + n4.toString() +
                                "\n" + n5.toString() + "\n" + n6.toString() + "\n" + n7.toString());
            } else if (os.equals("windows 10")) {
                System.out.printf(n1.toString() + "\n" + n3.toString());
            } else if (os.equals("windows 11")) {
                System.out.printf(n2.toString() + "\n" + n4.toString() + "\n" + n5.toString() +
                        "\n" + n6.toString() + "\n" + n7.toString());
            } else
                System.out.println("Не найдено");
            db2.close();
        } else if (select == 4) {

            System.out.print("Введите цвет: ");
            Scanner db3 = new Scanner(System.in);
            String col = db3.nextLine();
            if (col.equals("black")) {
                System.out.printf(n4.toString() + "\n" +
                        n5.toString() + "\n" + n6.toString() + "\n" + n7.toString());
            } else if (col.equals("gold")) {
                System.out.printf(n1.toString() + "\n" + n3.toString());
            } else if (col.equals("white")) {
                System.out.printf(n2.toString());
            } else
                System.out.println("Не найдено");
            db3.close();

        } else if (select == 5) {

            System.out.print("Введите название брэнда: ");
            Scanner db4 = new Scanner(System.in);
            String br = db4.nextLine();
            if (br.equals("Acer")) {
                System.out.printf(n1.toString() + "\n" + n3.toString());
            } else if (br.equals("Asus")) {
                System.out.printf(n2.toString());
            } else if (br.equals("HP")) {
                System.out.printf(n4.toString() + "\n" + n5.toString() + "\n" + n6.toString()
                        + "\n" + n7.toString());
            } else
                System.out.println("Глянь код ещё раз");
            db4.close();
        } else if (select == 6) {
            System.out.println("Показать весь ассортимент: ");
            System.out.printf(n1.toString() + "\n" + n2.toString() + "\n" + n3.toString() + "\n" + n4.toString() +
                    "\n" + n5.toString() + "\n" + n6.toString() + "\n" + n7.toString());
        }
        db.close();
    }
}