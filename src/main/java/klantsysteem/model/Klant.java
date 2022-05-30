package klantsysteem.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

public class Klant {
    private String naam;
    private LocalDate geboorteDatum;
    private int telefoonNummer;
    private String straat;
    private String woonPlaats;
    private String postcode;
    private ArrayList<String> huidkenmerken;
    private ArrayList<Product> gekochteProducten;
    private ArrayList<Behandeling> mijnBehandelingen;
    private ArrayList<FamilieLidVanKlant> familieVan;

    public Klant(String naam, LocalDate geboorteDatum, int telefoonNummer, String straat, String woonPlaats, String postcode) {
        this.naam = naam;
        this.geboorteDatum = geboorteDatum;
        this.telefoonNummer = telefoonNummer;
        this.straat = straat;
        this.woonPlaats = woonPlaats;
        this.postcode = postcode;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public LocalDate getGeboorteDatum() {
        return geboorteDatum;
    }

    public void setGeboorteDatum(LocalDate geboorteDatum) {
        this.geboorteDatum = geboorteDatum;
    }

    public int getTelefoonNummer() {
        return telefoonNummer;
    }

    public void setTelefoonNummer(int telefoonNummer) {
        this.telefoonNummer = telefoonNummer;
    }

    public String getStraat() {
        return straat;
    }

    public void setStraat(String straat) {
        this.straat = straat;
    }

    public String getWoonPlaats() {
        return woonPlaats;
    }

    public void setWoonPlaats(String woonPlaats) {
        this.woonPlaats = woonPlaats;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public ArrayList<String> getHuidkenmerken() {
        return huidkenmerken;
    }

    public void addHuidkenmerken(String kenmerk) {
        huidkenmerken.add(kenmerk);
    }

    public void removeHuidkenmerk(String kenmerk) {
        for (String huidkenmerk : huidkenmerken){
            if (huidkenmerk.equals(kenmerk)){
                huidkenmerken.remove(huidkenmerk);
            }
        }
    }

    public void koop(Product product, LocalDate aanschafDatum){
        product.setAanschafDatum(aanschafDatum);
        gekochteProducten.add(product);
    }

    public void addBehandeling(Behandeling behandeling){
        mijnBehandelingen.add(behandeling);
    }

    public void addFamilieLid(FamilieLidVanKlant fam){
        familieVan.add(fam);
    }

    @Override
    public String toString() {
        String s = "naam: "+ naam + " geboortedatum: " + geboorteDatum + " telefoonnummer: " + telefoonNummer + " woont op adres: " + straat + " " + postcode + " " + woonPlaats + "\n";
        if (!gekochteProducten.isEmpty()){
            s+="en heeft de volgende producten gekocht:\n";
            for (Product product: gekochteProducten)
                s += product;
        }
        return s;
    }

    public double maakRekening(LocalDate beginDatum, LocalDate eindDatum){
        ArrayList<Behandeling> eindafrekeningBehandelingen = new ArrayList<>();
        for (Behandeling behandeling : mijnBehandelingen){
            if (behandeling.getBehandelDatum().isBefore(eindDatum) && behandeling.getBehandelDatum().isAfter(beginDatum)){
                eindafrekeningBehandelingen.add(behandeling);
            }
        }
        double totaalkosten = 0;
        for (Behandeling behandeling : eindafrekeningBehandelingen){
            totaalkosten += behandeling.getTotaalPrijs();
        }
        ArrayList<Product> eindafrekeningproducten = new ArrayList<>();
        for (Product product : gekochteProducten){
            if (product.getAanschafDatum().isBefore(eindDatum) && product.getAanschafDatum().isAfter(beginDatum)){
                eindafrekeningproducten.add(product);
            }
        }
        for (Product product : eindafrekeningproducten){
            totaalkosten += product.getProductPrijs();
        }
        return totaalkosten;
    }
}
