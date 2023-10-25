package it.itd.smallcountries.documents;

public class Translation {
    Deu deu;
    Fin fin;
    Fra fra;
    Ita ita;
    Jap jpn;
    Nlh nld;
    Por por;
    Rus rus;
    Spa spa;
    public Translation(Deu deu, Fin fin, Fra fra, Ita ita, Jap jpn, Nlh nld, Por por, Rus rus, Spa spa) {
        this.deu = deu;
        this.fin = fin;
        this.fra = fra;
        this.ita = ita;
        this.jpn = jpn;
        this.nld = nld;
        this.por = por;
        this.rus = rus;
        this.spa = spa;
    }
    public Deu getDeu() {
        return deu;
    }

    public void setDeu(Deu deu) {
        this.deu = deu;
    }

    public Fin getFin() {
        return fin;
    }

    public void setFin(Fin fin) {
        this.fin = fin;
    }

    public Fra getFra() {
        return fra;
    }

    public void setFra(Fra fra) {
        this.fra = fra;
    }

    public Ita getIta() {
        return ita;
    }

    public void setIta(Ita ita) {
        this.ita = ita;
    }

    public Jap getJap() {
        return jpn;
    }

    public void setJap(Jap jpn) {
        this.jpn = jpn;
    }

    public Nlh getNlh() {
        return nld;
    }

    public void setNlh(Nlh nld) {
        this.nld = nld;
    }

    public Por getPor() {
        return por;
    }

    public void setPor(Por por) {
        this.por = por;
    }

    public Rus getRus() {
        return rus;
    }

    public void setRus(Rus rus) {
        this.rus = rus;
    }

    public Spa getSpa() {
        return spa;
    }

    public void setSpa(Spa spa) {
        this.spa = spa;
    }
}
