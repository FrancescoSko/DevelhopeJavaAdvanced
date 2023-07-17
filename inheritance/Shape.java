package JavaAdvanced.DevelhopeJavaAdvanced.inheritance;

public class Shape {
    String shapeName;
    int numberOfEdges;


    public Shape() {
        shapeName = "Undefined Shape";
        System.out.println("The new object has been created");
    }

    public String getShapeDetails() {
        return shapeName + " has: " + numberOfEdges + " edges";
    }

}

























