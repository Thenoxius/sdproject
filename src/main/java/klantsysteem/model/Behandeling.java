package klantsysteem.model;

import java.time.LocalDateTime;
import java.util.Date;

public class Behandeling {
    private Date behandelDatum;
    private LocalDateTime beginTijd;
    private LocalDateTime eindTijd;
    private double totaalPrijs;
    private Klant klant;
    private String opmerking;
}
