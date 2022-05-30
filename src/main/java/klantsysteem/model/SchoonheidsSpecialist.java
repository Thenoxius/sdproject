package klantsysteem.model;

import javax.xml.crypto.Data;
import java.time.LocalDate;
import java.util.ArrayList;

public class SchoonheidsSpecialist {
    private String loginNaam;
    private String wachtwoord;
    private ArrayList<Klant> mijnKlanten;

    public String getLoginNaam() {
        return loginNaam;
    }

    public void setWachtwoord(String oudWachtwoord, String nieuwWachtwoord) {
        if(this.wachtwoord.equals(oudWachtwoord)){
            wachtwoord = nieuwWachtwoord;
        }
    }

    public ArrayList<Klant> getMijnKlanten() {
        return mijnKlanten;
    }

    public void addKlant(Klant klant){
        if (!mijnKlanten.contains(klant)){
            mijnKlanten.add(klant);
        }
    }

    public double maakEindafrekening(LocalDate begindatum, LocalDate einddatum){
        double totaalkosten = 0;
        for (Klant klant : mijnKlanten){
            totaalkosten += klant.maakRekening(begindatum, einddatum);
        }
        return totaalkosten;
    }
}
