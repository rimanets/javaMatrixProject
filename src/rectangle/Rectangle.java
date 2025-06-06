package rectangle;

public class Rectangle {
    protected int x, y; // координаты нижнего левого угла
    protected int width, height; // размеры

    public Rectangle(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    // Метод перемещения прямоугольника
    public void move(int dx, int dy) {
        x += dx;
        y += dy;
    }

    // Метод изменения размеров прямоугольника
    public void resize(int newWidth, int newHeight) {
        width = newWidth;
        height = newHeight;
    }

    // Вывод информации
    public void print() {
        System.out.println("Прямоугольник: (" + x + ", " + y + "), ширина = " + width + ", высота = " + height);
    }
}

