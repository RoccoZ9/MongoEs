package it.itd.smallcountries.documents;

public class Name {
    String common;
    NativeName natives;
    String official;

    public Name(String common, NativeName natives, String official) {
        this.common = common;
        this.natives = natives;
        this.official = official;
    }

    public String getCommon() {
        return common;
    }

    public void setCommon(String common) {
        this.common = common;
    }

    public NativeName getNatives() {
        return natives;
    }

    public void setNatives(NativeName natives) {
        this.natives = natives;
    }

    public String getOfficial() {
        return official;
    }

    public void setOfficial(String official) {
        this.official = official;
    }
}
