package TaskTwo;

public class Main {
    public static void main(String[] args) {
        Figure[] figurs = {
                new Circle(13),
                new Rectangle(3, 14),
                new Triangle(6, 3, 1)};

        for(Figure figure : figurs)
            System.out.println(figure.getName() + ": area = " + figure.getArea());
    }
}
