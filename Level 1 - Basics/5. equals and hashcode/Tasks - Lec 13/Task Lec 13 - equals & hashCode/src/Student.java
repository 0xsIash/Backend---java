import java.util.Objects;

public class Student {
    int id;
    String email;

    Student(int id, String email) {
        this.id = id;
        this.email = email;
    }


    // Case 1: equality based on id

    public boolean equalsById(Object obj) {
        if (!(obj instanceof Student))
            return false;

        Student other = (Student) obj;

        return this.id == other.id;
    }

    public int hashCodeById() {
        return Integer.hashCode(id);
    }


    // Case 2: equality based on email

    public boolean equalsByEmail(Object obj) {
        if (!(obj instanceof Student))
            return false;

        Student other = (Student) obj;

        return this.email.equals(other.email);
    }

    public int hashCodeByEmail() {
        return Objects.hash(email);
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", email='" + email + '\'' +
                '}';
    }
}
