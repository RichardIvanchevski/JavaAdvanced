package google;

public class Company extends Nested {
    private double salary;

    public Company(String firstName, String secondName, double salary) {
        super(firstName, secondName);
        this.salary = salary;
    }

    @Override
    public String toString() {
        Nested nested = new Nested(firstName, secondName);
        return String.format("%s %s %.2f",nested.getFirstName(),nested.getSecondName(),this.salary);
    }
}
