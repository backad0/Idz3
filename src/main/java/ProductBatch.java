import java.util.Arrays;
import java.util.Objects;

public class ProductBatch {
    private String description;
    private PackagedProduct[] products;

    public ProductBatch(String description, PackagedProduct... products) {
        if (description == null) throw new IllegalArgumentException("Description of a PB can`t be null");
        this.description = description;
        this.products = products;
    }

    public String getDescription() {
        return description;
    }

    public PackagedProduct[] getProducts() {
        return products;
    }

    public double getWeight() {
        double result = 0;
        for (PackagedProduct product : products) {
            if (product instanceof PackagedPieceProduct packagedPieceProduct) {
                result += packagedPieceProduct.getGrossWeight();
            }
            if (product instanceof PackagedWeightProduct packagedWeightProduct) {
                result += packagedWeightProduct.getGrossWeight();
            }
        }
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductBatch that = (ProductBatch) o;
        return Objects.equals(description, that.description) && Arrays.equals(products, that.products);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(description);
        result = 31 * result + Arrays.hashCode(products);
        return result;
    }

    public String toString() {
        return String.format("Product Batch: %s \nProducts: %s", description, Arrays.toString(products));
    }
}
