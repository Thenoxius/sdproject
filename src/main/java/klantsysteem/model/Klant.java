package klantsysteem.model;

import java.util.ArrayList;
import java.util.Date;

public class Klant {
    private String naam;
    private Date geboorteDatum;
    private int telefoonNummer;
    private String straat;
    private String woonPlaats;
    private String postcode;
    private ArrayList<String> huidkenmerken;

    public Klant(String naam, Date geboorteDatum, int telefoonNummer, String straat, String woonPlaats, String postcode) {
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

    public Date getGeboorteDatum() {
        return geboorteDatum;
    }

    public void setGeboorteDatum(Date geboorteDatum) {
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

    @Override
    public String toString() {
        String s = "naam: "+ naam + " geboortedatum: " + geboorteDatum + " telefoonnummer: " + telefoonNummer + " woont op adres: " + straat + " " + postcode + " " + woonPlaats;
        return s;
    }
}
