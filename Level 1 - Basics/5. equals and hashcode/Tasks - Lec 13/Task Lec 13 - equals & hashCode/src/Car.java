import java.util.Objects;

public class Car {
    String plateNumber;
    String color;

    Car(String plateNumber, String color) {
        this.plateNumber = plateNumber;
        this.color = color;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Car))
            return false;

        Car other = (Car) obj;

        return this.plateNumber.equals(other.plateNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(plateNumber);
    }

    @Override
    public String toString() {
        return "Car{" +
                "plateNumber='" + plateNumber + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
