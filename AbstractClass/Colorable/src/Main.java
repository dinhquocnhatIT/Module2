import shape.Square;

public class Main {
    public static void main(String[] args) {
        Square[] square = new Square[3];
        square[0] = new Square(2,3,5);
        square[1] = new Square(4,6,9);
        square[2] = new Square(5,6,10);
      for(Square squares : square) {
          System.out.println(squares);
          System.out.println(squares.howToColor());
      }
    }
}
