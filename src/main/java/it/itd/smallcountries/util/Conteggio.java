package it.itd.smallcountries.util;

public class Conteggio {
    String _id;
    Integer count;

    public Conteggio(String _id, Integer count) {
        this._id = _id;
        this.count = count;
    }

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }
}
