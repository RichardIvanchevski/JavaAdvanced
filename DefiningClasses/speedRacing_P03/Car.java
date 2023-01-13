package speedRacing_P03;

public class Car {
    private String model;
    private double fuelAmount;
    private double fuelCost;
    private int travelledKM;

    public Car(String model, double fuelAmount, double fuelCost) {
        this.model = model;
        this.fuelAmount = fuelAmount;
        this.fuelCost = fuelCost;
        setTravelledKM(0);
    }

    public double calculateRequiredFuel(int distance){
        return this.getFuelCost() * distance;
    }

    public boolean hasEnoughGas(int distance){
        return fuelAmount >= calculateRequiredFuel(distance);
    }
    public void drive(int distance){
        if (hasEnoughGas(distance)){
            this.fuelAmount -= calculateRequiredFuel(distance);
            this.travelledKM += distance;
        }else {
            System.out.println("Insufficient fuel for the drive");
        }
    }


    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getFuelAmount() {
        return fuelAmount;
    }

    public void setFuelAmount(double fuelAmount) {
        this.fuelAmount = fuelAmount;
    }

    public double getFuelCost() {
        return fuelCost;
    }

    public void setFuelCost(double fuelCost) {
        this.fuelCost = fuelCost;
    }

    public int getTravelledKM() {
        return travelledKM;
    }

    public void setTravelledKM(int travelledKM) {
        this.travelledKM = travelledKM;
    }

    @Override
    public String toString() {
        return String.format("%s %.2f %d%n",model , fuelAmount, travelledKM);
    }
}
