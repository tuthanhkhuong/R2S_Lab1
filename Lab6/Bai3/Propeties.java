package Lab6.Bai3;

public class Propeties {
    private float a;

    private float b;

    private float c;

    public Propeties(float a, float b, float c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Propeties() {

    }

    public float getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public float getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public float getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public void timDelta(){
        System.out.println("---------KET QUA---------");
        if (a == 0) {
            if (b == 0) {
                System.out.println("Phương trình vô nghiệm!");
            } else {
                System.out.println("Phương trình có một nghiệm: " + "x = " + (-c / b));
            }
        } else {
            float delta = b*b - 4*a*c;
            float x1;
            float x2;

            if (delta > 0) {
                x1 = (float) ((-b + Math.sqrt(delta)) / (2*a));
                x2 = (float) ((-b - Math.sqrt(delta)) / (2*a));
                System.out.println("Phương trình có 2 nghiệm là: " + "x1 = " + x1 + " và x2 = " + x2);
            } else if (delta == 0) {
                x1 = (-b / (2 * a));
                System.out.println("Phương trình có nghiệm kép: " + "x1 = x2 = " + x1);
            } else {
                System.out.println("Phương trình vô nghiệm!");
            }
        }
    }




}
