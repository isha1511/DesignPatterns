public class BridgeTest {

    public static void main(String[] args) {
        Shape tri = new Triangle(new RedColor());
        tri.applyColor();

        Shape pent = new Square(new GreenColor());
        pent.applyColor();
    }

}