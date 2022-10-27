package Lab8.Bai2;

public class Car {
    private String name;
    private String producer;
    private String year;
    private float seat;
    private float price;

    public Car() {
    }

    public Car (String name, String producer, String year, float seat, float price){
        this.name = name;
        this.producer = producer;
        this.year = year;
        this.seat = seat;
        this.price = price;
    }

    public String getName() {
        return name;
    }
    public float getPrice() {
        return price;
    }
    public float getSeat() {
        return seat;
    }
    public String getProducer() {
        return producer;
    }
    public String getYear() {
        return year;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setPrice(float price) {
        this.price = price;
    }
    public void setProducer(String producer) {
        this.producer = producer;
    }
    public void setSit(float seat) {
        this.seat = seat;
    }
    public void setYear(String year) {
        this.year = year;
    }
    public double calculateTax() {
        double t;
        if (seat < 7)
            t = seat * 0.6;
        else
            t = seat * 0.7;
        return t;
    }

    public double calculatePrice() {
        return price + calculateTax();
    }

    public void getInfor() {
        System.out.println(getName() + " Car produced by "
                + getProducer() + " in " + getYear() +
                " has " + getSeat() +
                " seats with the total price is " + getPrice() + "$.");
    }
}
