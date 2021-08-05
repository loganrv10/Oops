public class Square extends Rectangle{
  public int side;

    public Square(int side) {
        super(side, side);
        this.side = side;
    }

    @Override
    public void area() {
        System.out.println(side * side);
    }

    @Override
    public void perimeter() {
        System.out.println(4 * side);
    }
}
