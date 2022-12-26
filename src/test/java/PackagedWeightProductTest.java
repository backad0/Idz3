import org.junit.Test;

import static org.junit.Assert.*;

public class PackagedWeightProductTest {

    PackagedWeightProduct packagedWeightProduct = new PackagedWeightProduct(new Product("PieceProduct", "Description"), new ProductPackage("ProductPackage", 100), 100);

    @Test
    public void getNetWeightTest() {
        double net = 100;
        assertEquals(net, packagedWeightProduct.getWeight(), 0.1);
    }

    @Test
    public void getGrossWeightTest() {
        double gross = 100 + 100;
        assertEquals(gross, packagedWeightProduct.getGrossWeight(), 0.1);
    }

}
