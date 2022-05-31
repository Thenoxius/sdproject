package klantsysteem.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.Month;

import static org.junit.jupiter.api.Assertions.*;

class FamilieLidVanKlantTest {
    private Klant klant;
    private FamilieLidVanKlant famv;

    @BeforeEach
    public void init(){
        klant = new Klant("Mirna",  LocalDate.of(1954, Month.JANUARY, 16), "0652154875", "jan albrechtstraat", "Haastrecht", "2851ZQ");
        famv = new FamilieLidVanKlant("Jantje", 11, "kleinzoon",klant);
    }

    @Test
    void nieuw_familielid_wordt_aan_klant_toegevoegd() {
        assertEquals(true, klant.getFamilieVan().contains(famv));
    }
}