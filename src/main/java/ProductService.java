import Filter.Filter;

public class ProductService {
    public static int countByFilter(ProductBatch productBatch, Filter filter) {
        if (productBatch == null) {
            throw new IllegalArgumentException("ProductBatch argument can`t be null");
        }
        if (filter == null) throw new IllegalArgumentException("Filter argument can`t be null");
        int result = 0;
        for (PackagedProduct product : productBatch.getProducts()) {
            if (filter.apply(product.getName())) {
                result++;
            }
        }
        return result;
    }
}
