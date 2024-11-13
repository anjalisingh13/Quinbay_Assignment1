package Question3;

import java.time.LocalDate;
import java.util.Objects;

public class Employee {
    private String id;
    private String name;
    private int age;
    private LocalDate dateOfJoining;

    // Constructor to initialize Employee details
    public Employee(String id, String name, int age, LocalDate dateOfJoining) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.dateOfJoining = dateOfJoining;
    }

    // Getters and Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public LocalDate getDateOfJoining() {
        return dateOfJoining;
    }

    public void setDateOfJoining(LocalDate dateOfJoining) {
        this.dateOfJoining = dateOfJoining;
    }

    // Override equals to compare Employee objects based on their ID
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Employee employee = (Employee) obj;
        return id.equals(employee.id);  // Compare based on ID
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);  // Ensure the hash code is based on the ID
    }

    @Override
    public String toString() {
        return "Employee [ID=" + id + ", Name=" + name + ", Age=" + age + ", Date of Joining=" + dateOfJoining + "]";
    }
}
