package google;

public class Children extends Parent{

    public Children(String firstName, String secondName) {
        super(firstName, secondName);
    }
    @Override
    public String toString() {
        Nested nested = new Nested(firstName, secondName);
        return String.format("%s %s",nested.getFirstName(),nested.getSecondName());
    }
}
