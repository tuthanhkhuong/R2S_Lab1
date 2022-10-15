package Lab5.Bai2;

public class Rectangle {
    private double x;

    private double y;

    public Rectangle() {
    }

    public Rectangle(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double doPerimeter(){
        return (x+y)*2;
    }

    public double doArea(){
        return (x*y);
    }

    public void Result(){
        String info = String.format("Chu vi hình chữ nhât: %.2f \nDiện tích hình chữ nhât: %.2f \n",doPerimeter(),doArea());
        System.out.printf(info);
    }
}
