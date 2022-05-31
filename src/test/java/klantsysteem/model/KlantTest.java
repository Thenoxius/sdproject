package klantsysteem.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.Month;

import static org.junit.jupiter.api.Assertions.*;

class KlantTest {
    private Klant klant;
    private Product product;

    @BeforeEach
    public void init(){
        klant = new Klant("Mirna",  LocalDate.of(1954, Month.JANUARY, 16), "0652154875", "jan albrechtstraat", "Haastrecht", "2851ZQ");
        product = new Product("Cola zero", 1.50);
        product.setAantalBesschikbaar(20);
    }

    @Test
    public void koop_verlaagd_aantal_besschikbaar() {
        klant.koop(product, LocalDate.now(),4);
        assertEquals(16,product.getAantalBesschikbaar(),"het teruggegeven aantal klopt niet");
    }

    @Test
    public void koop_registreerd_aankoopdatum() {
        klant.koop(product, LocalDate.now(), 4);
        for (Object product : klant.getGekochteProducten()) {
            if (product instanceof Product) {
                assertEquals(((Product) product).getAanschafDatum(), LocalDate.now());
            }
        }
    }
}