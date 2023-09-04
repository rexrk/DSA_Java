package List;

import java.util.Objects;

public class Employee {
    private String FirstName;
    private String LastName;
    private int id;

    public Employee() { }

    public Employee(String firstName, String lastName, int id) {
        FirstName = firstName;
        LastName = lastName;
        this.id = id;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id && Objects.equals(FirstName, employee.FirstName) && Objects.equals(LastName, employee.LastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(FirstName, LastName, id);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "FirstName='" + FirstName + '\'' +
                ", LastName='" + LastName + '\'' +
                ", id=" + id +
                '}';
    }
}
