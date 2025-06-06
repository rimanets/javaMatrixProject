package rectangle;

public class RectangleOperations extends Rectangle {

    public RectangleOperations(int x, int y, int width, int height) {
        super(x, y, width, height);
    }

    // Метод объединения двух прямоугольников
    public static Rectangle getUnion(Rectangle r1, Rectangle r2) {
        int x1 = Math.min(r1.x, r2.x);
        int y1 = Math.min(r1.y, r2.y);
        int x2 = Math.max(r1.x + r1.width, r2.x + r2.width);
        int y2 = Math.max(r1.y + r1.height, r2.y + r2.height);

        return new Rectangle(x1, y1, x2 - x1, y2 - y1);
    }

    // Метод пересечения двух прямоугольников
    public static Rectangle getIntersection(Rectangle r1, Rectangle r2) {
        int x1 = Math.max(r1.x, r2.x);
        int y1 = Math.max(r1.y, r2.y);
        int x2 = Math.min(r1.x + r1.width, r2.x + r2.width);
        int y2 = Math.min(r1.y + r1.height, r2.y + r2.height);

        if (x1 < x2 && y1 < y2) {
            return new Rectangle(x1, y1, x2 - x1, y2 - y1);
        } else {
            return null; // Пересечения нет
        }
    }
}
