import java.util.Objects;

public class Product {
    private String name, description;

    public void setName(String name) {
        if (name == null) throw new IllegalArgumentException("Name of product can`t be null");
        if (name.equals("")) throw new IllegalArgumentException("Name of product can`t be empty");
        this.name = name;
    }

    public void setDescription(String description) {
        if (description == null) throw new IllegalArgumentException("Description of product can`t be null");
        if (description.equals("")) throw new IllegalArgumentException("Description of product can`t be empty");
        this.description = description;
    }

    public String getName(){
        return name;
    }
    public String getDescription(){
        return description;
    }

    public Product(String name, String description){
        setDescription(description);
        setName(name);
    }
    public Product(Product product) {
        setDescription(product.getDescription());
        setName(product.getName());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return name.equals(product.name) && description.equals(product.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description);
    }

    public String toString(){
        return String.format("Name: %s, description: %s", name, description);
    }
}
