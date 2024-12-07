public class Car {

    // variables for the car objects
    private int year;
    private String make;
    private String model;
    private int miles;
    private double fuelTank;

    public Car(int year, String make, String model, int miles, double fuelPercentage) {
        this.year = year;
        this.make = make;
        this.model = model;
        this.miles = miles;
        this.fuelTank = Math.min(Math.max(fuelPercentage, 0), 100);
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
        double fuelConsumedPercentage = (miles / 360.0) * 100;

        this.fuelTank -= fuelConsumedPercentage;

        if (this.fuelTank < 0) {
            this.fuelTank = 0;
        }
    }

    public boolean isFuelTankEmpty() {
        if (this.fuelTank == 0) {
            return true;
        } else {
            return false;
        }
    }

    public String drive(int milesToDrive) {
        if (isFuelTankEmpty()) {
            return String.format("The %d %s %s's fuel tank is empty!", year, make, model);
        }

        double maxMiles = (fuelTank / 100.0) * 300;
        int actualMiles = (int) Math.min(milesToDrive, maxMiles);

        addMiles(actualMiles);
        modifyFuelTank(actualMiles);

        String status = String.format("The %d %s %s drove %d miles, for a total mileage of %d and a fuel tank level of %.1f%%.",
                year, make, model, actualMiles, miles, fuelTank);

        return status;
    }


    public static void main(String[] args) {
        Car myCar = new Car(2019, "Honda", "CR-V", 11000, 100);
        Car myCar3 = new Car(2001, "Toyota", "Forerunner", 38000, 100);
        Car myCar2 = new Car(2015, "Subaru", "Forester", 25000, 100);

        String result = myCar.drive(150);
        String result2 = myCar2.drive(190);
        String result3 = myCar3.drive(120);

        System.out.println(result);
        System.out.println(result2);
        System.out.println(result3);
    }
}
