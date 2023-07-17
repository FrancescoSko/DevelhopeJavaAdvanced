package JavaAdvanced.DevelhopeJavaAdvanced.inheritance;

public class Rectangle extends Shape {


    public Rectangle(int edges, double edge1, double edge2) {
        super();
        shapeName = "Rectangle";
        numberOfEdges = edges;
        System.out.println("A new object " + shapeName + " has been created");
    }
}
