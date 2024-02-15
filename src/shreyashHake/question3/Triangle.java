package shreyashHake.question3;

/** Question 3*/
public class Triangle {
    private float height;
    private float base;
    private float hypothenus;

    public Triangle() {
        this.height = 3;
        this.base = 4;
        this.hypothenus = 5;
    }

    public Triangle(float height, float base, float hypothenus) {
        this.height = height;
        this.base = base;
        this.hypothenus = hypothenus;
    }

    private float getPerimeter(){
        return base + height + hypothenus;
    }

    private float getArea() {
        return (float) (0.5 * base * height);
    }

    public static void main(String[] args) {
        Triangle instanceDefault = new Triangle();
        System.out.println("Area of triangle: " + instanceDefault.getArea());
        System.out.println("Perimeter of triangle: " + instanceDefault.getPerimeter());
    }
}
