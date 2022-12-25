import org.junit.Test;

import static org.junit.Assert.*;

public class ProductPackageTest {

    @Test
    public void testToString() {
        ProductPackage pp1 = new ProductPackage("1",1);
        assertEquals("Name: 1, weight: 1,00", pp1.toString());
    }


    @Test
    public void testEquals1() {
        assertEquals(true, new ProductPackage("1", 1).equals(new ProductPackage("1", 1)));
    }
    @Test
    public void testEquals2() {
        assertEquals(false, new ProductPackage("1", 1).equals(new ProductPackage("1", 2)));
    }

    @Test
    public void testHashCode() {
        ProductPackage pp1 = new ProductPackage("1", 0.01);
        ProductPackage pp2 = new ProductPackage("1", 0.02);
        assertEquals(false, pp1.equals(pp2));
    }
}
