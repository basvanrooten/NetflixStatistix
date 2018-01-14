package com.netflixstatistix.session;

import com.netflixstatistix.connections.DatabaseConnection;
import com.netflixstatistix.connections.DatabaseInterface;

public class Session {

    // Required Dependencies
    private DatabaseInterface di = new DatabaseInterface();


    // Initial Variables
    private int abonneeID = 1215426;
    private String abonneeEmail;
    private String abonneeWachtwoord;
    private String abonneeNaam;
    private String abonneeStraat;
    private String abonneeHuisnummer;
    private String abonneePostcode;
    private String abonneeWoonplaats;

    private String[] profielArray;
    private String profielNaam;
    private String profielGeboortedatum;

    // Video Statistics
    private String[] latestVideoTitleArray;



    public Session() {
        DatabaseConnection.connect();
        this.abonneeID = 1215426;
        this.abonneeEmail = di.getEmailFromAccount(abonneeID);
        this.abonneeWachtwoord = di.getPasswordFromAccount(abonneeID);
        this.abonneeNaam = di.getNameFromAccount(abonneeID);
        this.abonneeStraat = di.getStreetFromAccount(abonneeID);
        this.abonneeHuisnummer = di.getHouseNumberFromAccount(abonneeID);
        this.abonneePostcode = di.getZipCodeFromAccount(abonneeID);
        this.abonneeWoonplaats = di.getCityFromAccount(abonneeID);

        this.profielArray = di.getProfielenFromAbonnee(abonneeID);
        this.profielNaam = profielArray[0];
        this.profielGeboortedatum = di.getDateOfBirthFromProfile(this.profielNaam, this.abonneeID);

        this.latestVideoTitleArray = di.getTopTenLastViewedMoviesAndSeries(this.profielNaam, this.abonneeID);




        DatabaseConnection.disconnect();
    }
    public int getAbonneeID() {
        return abonneeID;
    }

    public void setAbonneeID(int abonneeID) {
        this.abonneeID = abonneeID;
    }

    public String getAbonneeEmail() {
        return abonneeEmail;
    }

    public void setAbonneeEmail(String abonneeEmail) {
        this.abonneeEmail = abonneeEmail;
    }

    public String getAbonneeWachtwoord() {
        return abonneeWachtwoord;
    }

    public void setAbonneeWachtwoord(String abonneeWachtwoord) {
        this.abonneeWachtwoord = abonneeWachtwoord;
    }

    public String getAbonneeNaam() {
        return abonneeNaam;
    }

    public void setAbonneeNaam(String abonneeNaam) {
        this.abonneeNaam = abonneeNaam;
    }

    public String getAbonneeStraat() {
        return abonneeStraat;
    }

    public void setAbonneeStraat(String abonneeStraat) {
        this.abonneeStraat = abonneeStraat;
    }

    public String getAbonneeHuisnummer() {
        return abonneeHuisnummer;
    }

    public void setAbonneeHuisnummer(String abonneeHuisnummer) {
        this.abonneeHuisnummer = abonneeHuisnummer;
    }

    public String getAbonneePostcode() {
        return abonneePostcode;
    }

    public void setAbonneePostcode(String abonneePostcode) {
        this.abonneePostcode = abonneePostcode;
    }

    public String getAbonneeWoonplaats() {
        return abonneeWoonplaats;
    }

    public void setAbonneeWoonplaats(String abonneeWoonplaats) {
        this.abonneeWoonplaats = abonneeWoonplaats;
    }

    public String[] getProfielArray() {
        return profielArray;
    }

    public void setProfielArray(String[] profielArray) {
        this.profielArray = profielArray;
    }

    public String getProfielNaam() {
        return profielNaam;
    }

    public void setProfielNaam(String profielNaam) {
        this.profielNaam = profielNaam;
    }

    public String getProfielGeboortedatum() {
        return profielGeboortedatum;
    }

    public void setProfielGeboortedatum(String profielGeboortedatum) {
        this.profielGeboortedatum = profielGeboortedatum;
    }

    public String[] getLatestVideoTitleArray() {
        return latestVideoTitleArray;
    }

    public void setLatestVideoTitleArray(String[] latestVideoTitleArray) {
        this.latestVideoTitleArray = latestVideoTitleArray;
    }
}
