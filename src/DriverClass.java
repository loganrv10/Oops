import java.util.Scanner;

public class DriverClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int len = scanner.nextInt();
        int bred = scanner.nextInt();
        int side = scanner.nextInt();

        Rectangle rectangle = new Rectangle(len,bred);
        rectangle.area();
        rectangle.perimeter();

        System.out.println(".......................................................................");

        Square square = new Square(side);
        square.area();
        square.perimeter();

        System.out.println(".......................................................................");

        int side1 = scanner.nextInt();
        Square square1 = new Square(side1);
        square1.area();

        System.out.println(".......................................................................");

        int side2 = scanner.nextInt();
        Square square2 = new Square(side2);
        square2.area();



        System.out.println(".......................................................................");

        int side3 = scanner.nextInt();
        Square square3 = new Square(side3);
        square3.area();


        System.out.println(".......................................................................");

        int side4 = scanner.nextInt();
        Square square4 = new Square(side4);
        square4.area();

    }

}
