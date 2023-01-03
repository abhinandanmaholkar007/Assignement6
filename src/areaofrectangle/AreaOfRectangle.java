package areaofrectangle;

class Area
{
    private double length=10.00;
    private double breadth=20.00;
    private double area=length*breadth;

    public double getArea() {
        return area;
    }
}
public class AreaOfRectangle {
    public static void main(String[] args) {
    Area area=new Area();
    double areaOfRectangle=area.getArea();
    System.out.println(areaOfRectangle);

}}
