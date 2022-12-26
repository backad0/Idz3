import java.util.Objects;

public class PackagedPieceProduct extends PackagedProduct{
    private int amount;
    private PieceProduct pieceProduct;

    public void setAmount(int amount){
        if (amount <= 0) throw new IllegalArgumentException("Amount of a PPP can`t be zero or below");
        this.amount = amount;
    }

    public int getAmount(){
        return amount;
    }

    public PackagedPieceProduct(PieceProduct pieceProduct, int amount, ProductPackage productPackage){
        super(pieceProduct,productPackage);
        setAmount(amount);
        this.pieceProduct=pieceProduct;
    }

    public double getNetWeight() {
        return amount*pieceProduct.getWeight();
    }

    public double getGrossWeight() {
        return amount*pieceProduct.getWeight() + productPackage.getWeight();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        PackagedPieceProduct that = (PackagedPieceProduct) o;
        return amount == that.amount && Objects.equals(pieceProduct, that.pieceProduct);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), amount, pieceProduct);
    }

    public String toString(){
        return String.format("Name: %s\nDescription: %s\nWeight: %f\nAmount: %d\nPackage Title: %s\nPackage Weight: %f\n", pieceProduct.getName(), pieceProduct.getDescription(), pieceProduct.getWeight(), amount, productPackage.getName(), productPackage.getWeight());
    }
}
