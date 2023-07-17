package JavaAdvanced.DevelhopeJavaAdvanced.inheritance;

public class Triangle extends Shape {


    public Triangle(int edges, double edge1, double edge2, double edge3) {
        super();
        shapeName = "Triangle";
        numberOfEdges = edges;
        System.out.println("A new object " + shapeName + " has been created");
    }
}
