public class Circle
{
    private double radius;

    public Circle(double radius)
    {
        this.radius = radius;
    }

    public double area()
    {
        return Math.pow(radius, 2) * Math.PI;
    }

    public double circumference()
    {
        return 2 * radius * Math.PI;
    }

    public void setRadius(double newRadius)
    {
        radius = newRadius;
    }

    public String getInfo()
    {
        return "radius: " + radius + "\narea: " + area() + "\nCircumference: " + circumference();
    }
}
