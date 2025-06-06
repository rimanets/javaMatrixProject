package rectangle;

public class demo {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(1, 1, 4, 3);
        Rectangle r2 = new Rectangle(3, 2, 4, 4);

        r1.print();
        r2.print();

        Rectangle union = RectangleOperations.getUnion(r1, r2);
        System.out.println("Объединение:");
        union.print();

        Rectangle intersection = RectangleOperations.getIntersection(r1, r2);
        System.out.println("Пересечение:");
        if (intersection != null) {
            intersection.print();
        } else {
            System.out.println("Прямоугольники не пересекаются.");
        }
    }
}
