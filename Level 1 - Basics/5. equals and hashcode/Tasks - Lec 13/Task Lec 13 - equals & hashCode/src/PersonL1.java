public class PersonL1 {
    String name;
    int id;

    PersonL1(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof PersonL1))
            return false;

        PersonL1 other = (PersonL1) obj;

        return this.id == other.id;
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(id);
    }
}