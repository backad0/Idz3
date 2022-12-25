import java.util.Objects;

public class ProductPackage {
    private String name;
    private double weight;

    public void setName(String name){
        if (name == null) throw new IllegalArgumentException("Name of package can`t be null");
        if (name.equals("")) throw new IllegalArgumentException("Name of package can`t be empty");
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setWeight(double weight){
        if (weight <= 0 ) throw new IllegalArgumentException("Package weight can`t be zero or below");
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public ProductPackage(String name, double weight){
        setName(name);
        setWeight(weight);
    }

    /*public int hashCode(){
        int res = name.hashCode() + weight.hashCode();
        return res;
    }

    public  boolean equals(ProductPackage productPackage){
        if (productPackage == null) throw new IllegalArgumentException("Element being compared must exist");
        return hashCode() == productPackage.hashCode();
    }*/

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductPackage that = (ProductPackage) o;
        return Double.compare(that.weight, weight) == 0 && name.equals(that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, weight);
    }

    public String toString() {
        return String.format("Name: %s, weight: %.2f", name, weight);
    }
}
