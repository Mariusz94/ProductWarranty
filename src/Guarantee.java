import java.time.LocalDate;

public class Guarantee {
    private Product product;
    private String validUntil;

    public Guarantee(Product product, String validUntil) {
        this.product = product;
        this.validUntil = validUntil;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public String getValidUntil() {
        return validUntil;
    }

    public void setValidUntil(String validUntil) {
        this.validUntil = validUntil;
    }
}
