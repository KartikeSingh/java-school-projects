// Importing the Scanner class
public class Volume {
    // volume of Sphere
    void volume(double r) {
        // formula => 4 / 3 * pie radius^3
        double res = 4 / 3 * 22 / 7 * r * r * r;
        System.out.println("volume of the Sphere is : " + res);
    }

    // volume of Cuboid
    void volume(int l, int b, int h) {
        // formula => length * breath * height
        int res = l * b * h;
        System.out.println("volume of the Cuboid is : " + res);
    }

    // volume of Cube
    void volume(int s) {
        // Formula => side * side * side
        int res = s * s * s;
        System.out.println("volume of the Cube is : " + res);
    }

    // volume of Cone
    void volume(int r, long h) {
        // Formula => 1 / 3 * pi * radius^2 * height
        long res = (22 / 7 * r * r * h) / 3;
        System.out.println("volume of the Cone is : " + res);
    }

    public static void main(String[] args) {
        Volume ob = new Volume();

        // volume of Sphere
        ob.volume(7.10);

        // volume of Cone
        ob.volume(10, 20l);

        // volume of Cuboid
        ob.volume(8, 14,5);

        // volume of Cube
        ob.volume(6);
    }
}
