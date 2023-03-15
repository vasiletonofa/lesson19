package employee;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Objects;

public class Employee {


    LocalDateTime createdAt;
    LocalDateTime deletedAt;
    String name;
    int age;

    HashSet<Salariu> salary;

    public void addSalary(Salariu salariu) {
        salary.add(salariu);
    }

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return age == employee.age && Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {   // Ce grup va avea elementul ?
        return age;  // 24   hashCode == grup
    }
}
