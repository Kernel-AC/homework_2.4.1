public class Main {
    public static void main(String[] args) {
        // Создание товаров для сравнения
        Product p1 = new Product(1, "Коврик для мыши", 1500, "Аксессуары");
        Product p2 = new Product(2, "Мышь", 7000, "Аксессуары");
        Product p3 = new Product(1, "Другая мышь", 6000, "Аксессуары");
        Product p4 = new Product(3, "Ноутбук", 90000, "Электроника");
        // Вывод товаров
        System.out.println("Товары:");
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);
        System.out.println();
        // Сравнение товаров
        System.out.println("Сравнение товаров:");
        System.out.println("p1.equals(p2): " + p1.equals(p2));
        System.out.println("p1.equals(p3): " + p1.equals(p3));
        System.out.println("p2.equals(p4): " + p2.equals(p4));
        System.out.println();
        // Создание заказов
        Product[] basket1 = {p1, p2};
        Product[] basket2 = {p1, p2};
        Product[] basket3 = {p2, p1};
        Product[] basket4 = {p1, p4};
        Order o1 = new Order("Михаил", basket1);
        Order o2 = new Order("Михаил", basket2);
        Order o3 = new Order("Андрей", basket3);
        Order o4 = new Order("Сергей", basket4);
        // Вывод заказов
        System.out.println("Заказы:");
        System.out.println(o1);
        System.out.println(o2);
        System.out.println(o3);
        System.out.println(o4);
        System.out.println();
        // Сравнение заказов
        System.out.println("Сравнение заказов:");
        System.out.println("o1.equals(o2): " + o1.equals(o2));
        System.out.println("o1.equals(o3): " + o1.equals(o3));
        System.out.println("o1.equals(o4): " + o1.equals(o4));
        System.out.println("o2.equals(o4): " + o2.equals(o3));
    }
}