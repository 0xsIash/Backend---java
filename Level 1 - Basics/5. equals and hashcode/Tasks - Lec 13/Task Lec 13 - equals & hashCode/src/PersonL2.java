import java.util.Objects;

public class PersonL2 {
    String name;
    int id;

    PersonL2(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof PersonL2))
            return false;

        PersonL2 other = (PersonL2) obj;

        boolean namesEquals = this.name.equals(other.name);

        return (this.id == other.id) && namesEquals;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}