import java.util.Objects;

public class PieceProduct extends Product{
    private double weight;

    public PieceProduct(){
        super("PieceProduct","Description");
        setWeight(10);
    }

    public PieceProduct(PieceProduct pieceProduct){
        super(pieceProduct.getName(), pieceProduct.getDescription());
        setWeight(pieceProduct.getWeight());
    }

    public PieceProduct(String name, String description, double weight) {
        super(name, description);
        setWeight(weight);
    }

    public void setWeight(double weight){
        if (weight <= 0 ) throw new IllegalArgumentException("PieceProduct weight can`t be zero or below");
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        PieceProduct that = (PieceProduct) o;
        return Double.compare(that.weight, weight) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), weight);
    }

    public String toString(){
        return String.format("Name: %s, description: %s, weight: %.2f", getName(), getDescription(), weight);
    }
}
