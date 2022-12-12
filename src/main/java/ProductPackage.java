public class ProductPackage {
    private String name;
    private double weight;

    public void setName(String name){
        if (name == null) throw new IllegalArgumentException("Name can`t be null");
        if (name.equals("")) throw new IllegalArgumentException("Name can`t be empty");
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

    public int hashCode(){
        int res = name.hashCode() + (int)weight;
        return res;
    }

    public  boolean equals(ProductPackage productPackage){
        if (productPackage == null) throw new IllegalArgumentException("Element being compared must exist");
        return hashCode() == productPackage.hashCode();
    }

    public String toString() {
        return String.format("Name: %s, weight: %.2f", name, weight);
    }
}
