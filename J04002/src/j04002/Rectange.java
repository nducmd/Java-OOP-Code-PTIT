
package j04002;
/**
 *
 * @author nducmd
 */

public class Rectange {
    private double width;
    private double height;
    private static String color;
    
    public Rectange() {
        this.width = 1;
        this.height = 1;
        color = "";
    }
    public Rectange(double width, double height, String color) {
        this.width = width;
        this.height = height;
        Rectange.color = color;
    }
    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public static String getColor() {
        return color;
    }
    public static void setColor(String color) {
        Rectange.color = color;
    }
    public double findArea() {
        return width * height;
    }
    public double findPerimeter() {
        return 2 * (width + height);
    }
}
