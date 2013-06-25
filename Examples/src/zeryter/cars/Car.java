package zeryter.cars;

public class Car extends Vehicle{

    String trans, engineType;
    int passengers;
    double cost;

    public Car(String make, String model, int year, double cost) {
        super(make, model, year, cost);

        this.make = make;
        this.model = model;
        this.year = year;
        this.cost = cost;

    }

    public String getInfo(){
        return("make:" + this.make + " model: " + this.model + " year " + this.year);
    }
}