package klantsysteem.model;

public class FamilieLidVanKlant {
    private String naam;
    private int leeftijd;
    private String titel;
    public FamilieLidVanKlant(String naam, int leeftijd, String titel) {
        this.naam = naam;
        this.leeftijd = leeftijd;
        this.titel = titel;
    }
    public String toString() {
        String s = naam + " is de " + titel + " van de klant en is " + leeftijd + " jaar oud";
        return s;
    }
    public void assignToKlant(Klant klant){
        klant.addFamilieLid(this);
    }
}
