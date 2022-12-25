import java.util.Objects;

public class PackagedProduct extends Product {
    public ProductPackage productPackage;

    public ProductPackage getProductPackage() {
        return productPackage;
    }

    public void setProductPackage(ProductPackage productPackage){
        if (productPackage==null) throw new IllegalArgumentException("ProductPackage can`t be null");
        this.productPackage = productPackage;
    }

    public PackagedProduct(String name, String description, ProductPackage productPackage) {
        super(name, description);
        setProductPackage(productPackage);
    }

    public PackagedProduct() {
        super("PackagedProduct", "PackagedProduct Description");
        setProductPackage(new ProductPackage("ProductPackage", 1));
    }

    public PackagedProduct(PackagedProduct packagedProduct){
        super(packagedProduct.getName(),packagedProduct.getDescription());
        setProductPackage(packagedProduct.getProductPackage());
    }

    public PackagedProduct(Product product, ProductPackage productPackage){
        super(product);
        setProductPackage(productPackage);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        PackagedProduct that = (PackagedProduct) o;
        return Objects.equals(productPackage, that.productPackage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), productPackage);
    }

    public String toString() {
        return super.toString()+productPackage.toString();
    }
}
