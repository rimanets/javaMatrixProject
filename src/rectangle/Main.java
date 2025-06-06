package rectangle;

public class Main {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(0, 0, 4, 3);
        r1.print();

        r1.move(2, 1);
        System.out.println("После перемещения:");
        r1.print();

        r1.resize(6, 4);
        System.out.println("После изменения размеров:");
        r1.print();
    }
}
