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

    public static int countByFilterDeep(ProductBatch productBatch, Filter filter) {
        if (productBatch == null) throw new IllegalArgumentException("ProductBatch argument can`t be null");
        if (filter == null) throw new IllegalArgumentException("Filter argument can`t be null");
        int result = 0;
        for (PackagedProduct product : productBatch.getProducts()) {
            if (product instanceof PackagedProductSet packagedProductSet) {
                for (PackagedProduct productFromSet : packagedProductSet.getProducts()) {
                    if (filter.apply(productFromSet.getName())) {
                        result++;
                    }
                }
            } else {
                if (filter.apply(product.getName())) {
                    result++;
                }
            }
        }
        return result;
    }
    public static boolean checkAllWeighted(ProductBatch productBatch) {
        if (productBatch == null) throw new IllegalArgumentException("ProductService checkAllWeighted: productBatch argument is null");
        boolean result = true;
        for (PackagedProduct product : productBatch.getProducts()) {
            if (product instanceof PackagedProductSet packagedProductSet) {
                for (PackagedProduct productFromSet : packagedProductSet.getProducts()) {
                    if (!(productFromSet instanceof PackagedWeightProduct)) {
                        result = false;
                        break;
                    }
                }
            } else if (!(product instanceof PackagedWeightProduct)) {
                result = false;
                break;
            }
        }
        return result;
    }
}
