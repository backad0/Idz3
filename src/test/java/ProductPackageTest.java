import org.junit.Test;

import static org.junit.Assert.*;

public class ProductPackageTest {

    @Test
    public void testToString() {
        ProductPackage pp1 = new ProductPackage("1",1);
        assertEquals("Name: 1, weight: 1,00", pp1.toString());
    }
}
