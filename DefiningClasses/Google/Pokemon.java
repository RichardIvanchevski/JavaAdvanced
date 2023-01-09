package google;

public class Pokemon extends Nested{
    public Pokemon(String firstName, String secondName) {
        super(firstName, secondName);
    }
    public String toString() {
        Nested nested = new Nested(firstName, secondName);
        return String.format("%s %s",nested.getFirstName(),nested.getSecondName());
    }
}
