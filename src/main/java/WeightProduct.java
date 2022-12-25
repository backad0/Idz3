public class WeightProduct extends Product{
    public WeightProduct(String name, String description) {
        super(name, description);
    }

    public WeightProduct(){
        super("WeightProduct", "Description");
    }

    public WeightProduct(WeightProduct weightProduct){
        super(weightProduct.getName(), weightProduct.getDescription());
    }
}
