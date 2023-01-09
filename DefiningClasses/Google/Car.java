package google;

public class Car {
    private String carModel;
    private String topSpeed;

    public Car(String carModel, String topSpeed) {
        this.carModel = carModel;
        this.topSpeed = topSpeed;
    }

    @Override
    public String toString() {
        return String.format("%s %s",carModel,topSpeed);
    }
}

