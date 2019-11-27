package bazine;

public class TransportasImpl implements Transportas {

    private String tipas;
    private String variklis;
    private int metai;

    public TransportasImpl(String tipas, String variklis, int metai) {
        this.tipas = tipas;
        this.variklis = variklis;
        this.metai = metai;
    }

    public String getTipas() {
        return tipas;
    }

    public void setTipas(String tipas) {
        this.tipas = tipas;
    }

    public String getVariklis() {
        return variklis;
    }

    public void setVariklis(String variklis) {
        this.variklis = variklis;
    }

    public int getMetai() {
        return metai;
    }

    public void setMetai(int metai) {
        this.metai = metai;
    }
}