package it.itd.smallcountries.documents;

public class Hrv {
    String common;
    String official;

    public Hrv(String common, String official) {
        this.common = common;
        this.official = official;
    }

    public String getCommon() {
        return common;
    }

    public void setCommon(String common) {
        this.common = common;
    }

    public String getOfficial() {
        return official;
    }

    public void setOfficial(String official) {
        this.official = official;
    }
}
