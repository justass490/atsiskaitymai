package isvestine;

import bazine.TransportasImpl;

public class AutomobilisImpl extends TransportasImpl implements Automobilis {

    private String marke;
    private int durys;
    private String varomasElektra;

    public AutomobilisImpl(String tipas, String variklis, int metai, String marke, int durys, String varomasElektra) {
        super(tipas, variklis, metai);
        this.marke = marke;
        this.durys = durys;
        this.varomasElektra = varomasElektra;
    }

    public String getMarke() {
        return marke;
    }

    public void setMarke(String marke) {
        this.marke = marke;
    }

    public int getDurys() {
        return durys;
    }

    public void setDurys(int durys) {
        this.durys = durys;
    }

    public String getVaromasElektra() {
        return varomasElektra;
    }

    public void setVaromasElektra(String varomasElektra) {
        this.varomasElektra = varomasElektra;
    }

    @Override
    public String toString() {
        return getTipas() + " | " + getVariklis() + " | " + getMetai() + " | " + getMarke() + " | " + getDurys() + " | " + getVaromasElektra();
    }
}