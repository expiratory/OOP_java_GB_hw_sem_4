public class Employee implements Printable {
    private String firstName;
    private String secondName;
    private Enum position;

    public Employee(String firstName, String secondName, Enum position) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.position = position;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public Enum getPosition() {
        return position;
    }

    public void setPosition(Enum position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return this.firstName + " " + this.secondName + " " + this.position;
    }

    @Override
    public void print() {
        System.out.println(this.toString());
    }
}
