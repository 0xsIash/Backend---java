import java.util.Objects;

public class Product {
    String code;
    double price;

    Product(String code, double price) {
        this.code = code;
        this.price = price;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Product))
            return false;

        Product other = (Product) obj;

        return this.code.equals(other.code);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code);
    }

    @Override
    public String toString() {
        return "Product{" +
                "code='" + code + '\'' +
                ", price=" + price +
                '}';
    }



}
