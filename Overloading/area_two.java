// Importing the Scanner class
public class area_two {
    // Area of Spehere
    void area(double r) {
        // formula => 4 * pie r^2
        double res = 4 * 22 / 7 * r * r;
        System.out.println("Area of the Sphere is : " + res);
    }

    // Area of Cuboid
    void area(int l, int b, int h) {
        // formula => length * breath * height
        int res = 2 * (l*b +b*h + h*l);
        System.out.println("Area of the Cuboid is : " + res);
    }

    // Area of Cube
    void area(int s) {
        // Formula => 6 (side * side)
        int res = 6 * (s * s);
        System.out.println("Area of the Cube is : " + res);
    }

    public static void main(String[] args) {
        area_two ob = new area_two();

        // area of Sphere
        ob.area(7.10);

        // Area of Cuboid
        ob.area(8, 14,4);

        // Area of Cube
        ob.area(6);
    }
}
