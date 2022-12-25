import java.util.Objects;

public class PackagedWeightProduct extends PackagedProduct{
    private double weight;

    public void setWeight(double weight){
        if (weight<=0) throw new IllegalArgumentException("Weight of PWP can`t be less or equal zero");
        this.weight = weight;
    }

    public double getWeight(){
        return weight;
    }

    public PackagedWeightProduct(Product product, ProductPackage productPackage, double weight){
        super(product, productPackage);
        setWeight(weight);
    }
    public double getNetWeight() {
        return weight;
    }

    public double getGrossWeight() {
        return weight + productPackage.getWeight();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        PackagedWeightProduct that = (PackagedWeightProduct) o;
        return Double.compare(that.weight, weight) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), weight);
    }

    public String toString() {
        return super.toString()+String.format("netWeight: %.2f", weight);
    }
}
