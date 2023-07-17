package JavaAdvanced.DevelhopeJavaAdvanced.inheritance;

public class Square extends Shape {


    public Square(int edges, double edgeLength) {
        super();
        shapeName = "Square";
        numberOfEdges = edges;
        System.out.println("A new object " + shapeName + " has been created");
    }
}
