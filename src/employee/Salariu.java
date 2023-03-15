package employee;

import java.time.Month;
import java.util.Objects;

public class Salariu {
    Month month;
    Long suma;

    public Salariu(Month month, Long suma) {
        this.month = month;
        this.suma = suma;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Salariu salariu = (Salariu) o;
        return month == salariu.month && Objects.equals(suma, salariu.suma);
    }

    @Override
    public int hashCode() {
        return Objects.hash(month, suma);
    }
}
