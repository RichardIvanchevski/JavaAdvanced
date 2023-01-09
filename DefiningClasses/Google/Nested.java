package google;

public class Nested {
    protected  String firstName;
    protected  String secondName;

    public Nested(String firstName, String secondName) {
        this.firstName = firstName;
        this.secondName = secondName;
    }

    @Override
    public String toString() {
        return String.format("%s %s",firstName,secondName);
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }
}
