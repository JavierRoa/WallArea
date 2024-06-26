public class Wall {
    private double width;
    private double height;

    public Wall() {}
    public Wall(double width, double height) {
        this.width = Math.max(width, 0);
        this.height = Math.max(height, 0);
    }
    public double getArea() {
        return width * height;
    }
    public double getWidth() {
        return width;
    }
    public double getHeight() {
        return height;
    }
    public void setWidth(double width) {
        this.width = Math.max(width, 0);
    }
    public void setHeight(double height) {
        this.height = Math.max(height, 0);
    }
}
