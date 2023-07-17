package JavaAdvanced.DevelhopeJavaAdvanced.inheritance;

public class Testing {
    public static void main(String[] args) {
        Circle shape2 = new Circle(5.0);
        Square shape3 = new Square(4, 10.0);
        Rectangle shape4 = new Rectangle(4, 5.0, 8.0);
        Triangle shape5 = new Triangle(3, 3.0, 4.0, 5.0);

        String shapeCircle = shape2.getShapeDetails();
        String shapeSquare = shape3.getShapeDetails();
        String shapeRectangle = shape4.getShapeDetails();
        String shapeTriangle = shape5.getShapeDetails();

        System.out.println(shapeCircle);
        System.out.println(shapeRectangle);
        System.out.println(shapeSquare);
        System.out.println(shapeTriangle);
    }
}
