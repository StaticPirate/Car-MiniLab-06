public class Car {

    // variables for the car objects
    private int year;
    private String make;
    private String model;
    private int miles;
    private double fuelTank;

    public void Car(int year, String make, String model, int miles, double fuel) {
        this.year = year;
        this.make = make;
        this.model = model;
        this.miles = miles;
        this.fuelTank = fuel;
    }

    public int getYear() {
        return this.year;
    }

    public String getMake() {
        return this.make;
    }

    public String getModel() {
        return this.model;
    }

    public int getMiles() {
        return this.miles;
    }

    public double getFuelTank() {
        return this.fuelTank;
    }

    public void addMiles(int milesToAdd) {
        this.miles = this.miles + milesToAdd;
    }

    public void modifyFuelTank(int miles) {

    }

    public boolean isFuelTankEmpty() {
        if (this.fuelTank == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {

    }
}
