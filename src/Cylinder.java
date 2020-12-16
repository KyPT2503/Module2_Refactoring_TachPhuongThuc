public class Cylinder {
    public static double getVolume(int radius, int height){
        double baseArea = getBaseArea(radius);
        double perimeter = getPerimeter(radius, 2, Math.PI);
        double volume = getVolume(height, baseArea, perimeter);
        return volume;
    }

    private static double getVolume(int height, double baseArea, double perimeter) {
        return perimeter * height + 2 * baseArea;
    }

    private static double getPerimeter(int radius, double i, double pi) {
        return i * pi * radius;
    }

    private static double getBaseArea(int radius) {
        return getPerimeter(radius, Math.PI, radius);
    }
}