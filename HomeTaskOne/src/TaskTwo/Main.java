package TaskTwo;

public class Main {
    public static void main(String[] args)  {

        Figure[] figurs = {
                new Circle(14),
                new Rectangle(3, 14),
                new Triangle(15, 23, 15)};

        for(Figure figure : figurs)
            System.out.println(figure.getName() + ": area = " + figure.getArea());
    }
}
