import org.junit.Test;

import static org.junit.Assert.*;

public class PieceProductTest {
    PieceProduct pieceProduct = new PieceProduct();


    @Test
    public void setWeightGoodTest() {
        pieceProduct.setWeight(1000);
    }

    @Test(expected = IllegalArgumentException.class)
    public void setWeightBadTest() {
        pieceProduct.setWeight(0);
    }

    @Test
    public void getWeightTest() {
        assertEquals(10, pieceProduct.getWeight(), 0.1);
    }

    @Test
    public void testEqualsTest() {
        PieceProduct pieceProduct2 = pieceProduct;
        assertEquals(pieceProduct2, pieceProduct);
    }

    @Test
    public void testToStringTest() {
        assertEquals("Name: PieceProduct, description: Description, weight: 10,00", pieceProduct.toString());
    }


}
