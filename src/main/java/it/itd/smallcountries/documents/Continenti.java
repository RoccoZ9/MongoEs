package it.itd.smallcountries.documents;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.geo.GeoJson;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "countriesDb")
public class Continenti {
    @Id
    String id;
    String[] altSpellings;
    int area;
    String[] borders;
    String[] callingCode;
    String capital;
    String cca2;
    String cca3;
    String ccn3;
    String cioc;
    String[] currency;
    String demonym;
    boolean landlocked;
    Languages languages;
    double[] latlng;
    Name name;
    String region;
    String subregion;
    String[] tld;
    Translation translations;

    public Continenti(String id, String[] altSpellings, int area, String[] borders, String[] callingCode, String capital, String cca2, String cca3, String ccn3, String cioc, String[] currency, String demonym, boolean landlocked, Languages languages, double[] latlng, Name name, String region, String subregion, String[] tld, Translation translations) {
        this.id = id;
        this.altSpellings = altSpellings;
        this.area = area;
        this.borders = borders;
        this.callingCode = callingCode;
        this.capital = capital;
        this.cca2 = cca2;
        this.cca3 = cca3;
        this.ccn3 = ccn3;
        this.cioc = cioc;
        this.currency = currency;
        this.demonym = demonym;
        this.landlocked = landlocked;
        this.languages = languages;
        this.latlng = latlng;
        this.name = name;
        this.region = region;
        this.subregion = subregion;
        this.tld = tld;
        this.translations = translations;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String[] getAltSpellings() {
        return altSpellings;
    }

    public void setAltSpellings(String[] altSpellings) {
        this.altSpellings = altSpellings;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public String[] getBorders() {
        return borders;
    }

    public void setBorders(String[] borders) {
        this.borders = borders;
    }

    public String[] getCallingCode() {
        return callingCode;
    }

    public void setCallingCode(String[] callingCode) {
        this.callingCode = callingCode;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public String getCca2() {
        return cca2;
    }

    public void setCca2(String cca2) {
        this.cca2 = cca2;
    }

    public String getCca3() {
        return cca3;
    }

    public void setCca3(String cca3) {
        this.cca3 = cca3;
    }

    public String getCcn3() {
        return ccn3;
    }

    public void setCcn3(String ccn3) {
        this.ccn3 = ccn3;
    }

    public String getCioc() {
        return cioc;
    }

    public void setCioc(String cioc) {
        this.cioc = cioc;
    }

    public String[] getCurrency() {
        return currency;
    }

    public void setCurrency(String[] currency) {
        this.currency = currency;
    }

    public String getDemonym() {
        return demonym;
    }

    public void setDemonym(String demonym) {
        this.demonym = demonym;
    }

    public boolean isLandlocked() {
        return landlocked;
    }

    public void setLandlocked(boolean landlocked) {
        this.landlocked = landlocked;
    }

    public Languages getLanguages() {
        return languages;
    }

    public void setLanguages(Languages languages) {
        this.languages = languages;
    }

    public double[] getLatlng() {
        return latlng;
    }

    public void setLatlng(double[] latlng) {
        this.latlng = latlng;
    }

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getSubregion() {
        return subregion;
    }

    public void setSubregion(String subregion) {
        this.subregion = subregion;
    }

    public String[] getTld() {
        return tld;
    }

    public void setTld(String[] tld) {
        this.tld = tld;
    }

    public Translation getTranslation() {
        return translations;
    }

    public void setTranslation(Translation translations) {
        this.translations = translations;
    }
}
