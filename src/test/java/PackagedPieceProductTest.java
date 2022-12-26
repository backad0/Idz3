import org.junit.Test;

import static org.junit.Assert.*;

public class PackagedPieceProductTest {
    PackagedPieceProduct ppp= new PackagedPieceProduct(new PieceProduct("1n", "1d", 2), 5, new ProductPackage("PP", 1));


    @Test
    public void getNetWeight() {
        assertEquals(10, ppp.getNetWeight(), 0);
    }

    @Test
    public void getGrossWeight() {
        assertEquals(11, ppp.getGrossWeight(), 0);
    }
}
