package Lab9.exercise2;

public class Ellipse extends Shape {
    private double majorAxis;
    private double minorAxis;

    public Ellipse(){
        super("Ellipse");
        setMajorAxis(0);
        setMinorAxis(0);
    }
    public Ellipse(double majorAxis,double minorAxis)
    {
        super("Ellipse");
        setMajorAxis(majorAxis);
        setMinorAxis(minorAxis);
    }

    public double getMajorAxis() {
        return majorAxis;
    }

    public void setMajorAxis(double majorAxis) {
        this.majorAxis = majorAxis;
    }

    public double getMinorAxis() {
        return minorAxis;
    }

    public void setMinorAxis(double minorAxis) {
        this.minorAxis = minorAxis;
    }

    public String toString(){
        return "Shape type "+type+"\nArea: "+area()+"\nPerimeter: "+perimeter();
    }

    public double area()
    {
        double area = Math.PI*(majorAxis)*(minorAxis);
        return area;
    }
    public double perimeter()
    {
        double perimeter = 2*Math.PI*Math.sqrt((Math.pow(majorAxis,2)+Math.pow(minorAxis,2))/2);
        return perimeter;
    }
}
