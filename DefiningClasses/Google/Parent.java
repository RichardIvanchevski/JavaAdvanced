package google;

public class Parent extends Nested{


    public Parent(String firstName, String secondName) {
        super(firstName, secondName);
    }
    public String toString() {
        Nested nested = new Nested(firstName, secondName);
        return String.format("%s %s",nested.getFirstName(),nested.getSecondName());
    }
}
