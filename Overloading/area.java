public class area {
    // Area of circle
    void area(double r) {
        // formula => pie r^2
        double res = 22 / 7 * r * r;
        System.out.println("Area of the Circle is : " + res);
    }

    // Area of Rectangle
    void area(int l, int b) {
        // formula => length * breath
        int res = l * b;
        System.out.println("Area of the Rectangle is : " + res);
    }

    // Area of Square
    void area(int s) {
        // Formula => side * side
        int res = s*s;
        System.out.println("Area of the Square is : " + res);
    }

    // Area of Triangle
    void area(int b, long h) {
        // Formula => 1 / 2 * base * height
        long res = (b * h)/2;
        System.out.println("Area of the triangle is : " + res);
    }

    public static void main(String[] args) {
        area ob = new area();

        // area of circle
        ob.area(7.10);

        // Area of triangle
        ob.area(10, 20l);

        // Area of Rectangle
        ob.area(8, 14);

        // Area of square
        ob.area(6);
    }
}
