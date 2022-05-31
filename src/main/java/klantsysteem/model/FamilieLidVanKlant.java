package klantsysteem.model;

public class FamilieLidVanKlant {
    private String naam;
    private int leeftijd;
    private String titel;
    public FamilieLidVanKlant(String naam, int leeftijd, String titel, Klant klant) {
        this.naam = naam;
        this.leeftijd = leeftijd;
        this.titel = titel;
        assignToKlant(klant);
    }
    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public int getLeeftijd() {
        return leeftijd;
    }

    public void setLeeftijd(int leeftijd) {
        this.leeftijd = leeftijd;
    }

    public String getTitel() {
        return titel;
    }

    public void setTitel(String titel) {
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
