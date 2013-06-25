package zeryter.cars;

class Vehicle{

    String make;
    String model;
    int year;

    private double cost;

    public Vehicle(String make, String model, int year, double cost )
    {
        this.make=make;
        this.model=model;
        this.year=year;
        this.cost=cost;
    }

    public String GetInfo( )
    {
        String str =this.make+","+this.model+","+this.year;     return str;
    }
}
