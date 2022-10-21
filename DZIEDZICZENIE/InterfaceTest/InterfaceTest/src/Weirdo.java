import java.time.LocalDate;
import java.util.Objects;

public class Weirdo {

    private String lastName;
    private String firsName;
    private LocalDate dob;

    public Weirdo(String lastName) {

    }

    public Weirdo(String lastName, String firsName, LocalDate dob) {
        this.lastName = lastName;
        this.firsName = firsName;
        this.dob = dob;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirsName() {
        return firsName;
    }

    public void setFirsName(String firsName) {
        this.firsName = firsName;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Weirdo weirdo = (Weirdo) o;
        return Objects.equals(lastName, weirdo.lastName) && Objects.equals(firsName, weirdo.firsName) && Objects.equals(dob, weirdo.dob);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lastName, firsName, dob);
    }
}
