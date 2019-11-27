package isvestine;

import bazine.MoketojasImpl;

public class TelefonasImpl extends MoketojasImpl implements Telefonas {
    private String numeris;

    public TelefonasImpl(int kodas, String vardas, String pavarde, String adresas, double suma, String numeris) {
        super(kodas, vardas, pavarde, adresas, suma);
        this.numeris = numeris;
    }

    public String getNumeris() {
        return numeris;
    }

    public void setNumeris(String numeris) {
        this.numeris = numeris;
    }



    public void setKodas() {
    }

    public void setVardas() {
    }

    public void setPavarde() {
    }

    public void setAdresas() {
    }

    public void setSuma() {
    }
}
