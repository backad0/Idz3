import org.junit.Test;

import static org.junit.Assert.*;

public class ProductTest {

    @Test
    public void testToString() {
        Product product = new Product("1", "1");
        assertEquals("Name: 1, description: 1", product.toString());
    }

    @Test
    public void testEquals() {
        Product product1 = new Product("1", "1");
        Product product2 = new Product("1", "2");
        assertEquals(false, product1.equals(product2));
    }
}
