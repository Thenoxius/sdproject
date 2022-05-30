package klantsysteem.model;

import java.util.Objects;

public class Product {
    private String productNaam;
    private double productPrijs;
    private int aantalBesschikbaar;

    public Product(String productNaam, double productPrijs) {
        this.productNaam = productNaam;
        this.productPrijs = productPrijs;
    }

    public String getProductNaam() {
        return productNaam;
    }

    public void setProductNaam(String productNaam) {
        this.productNaam = productNaam;
    }

    public double getProductPrijs() {
        return productPrijs;
    }

    public void setProductPrijs(double productPrijs) {
        this.productPrijs = productPrijs;
    }

    public int getAantalBesschikbaar() {
        return aantalBesschikbaar;
    }

    public void setAantalBesschikbaar(int aantalBesschikbaar) {
        this.aantalBesschikbaar = aantalBesschikbaar;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Double.compare(product.productPrijs, productPrijs) == 0 && aantalBesschikbaar == product.aantalBesschikbaar && Objects.equals(productNaam, product.productNaam);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productNaam, productPrijs, aantalBesschikbaar);
    }
}
