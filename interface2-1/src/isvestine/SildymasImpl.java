package isvestine;

import bazine.MoketojasImpl;

public class SildymasImpl extends MoketojasImpl implements Sildymas {

    private double kubai;

    public SildymasImpl(int kodas, String vardas, String pavarde, String adresas, double suma, double kubai) {
        super(kodas, vardas, pavarde, adresas, suma);
        this.kubai = kubai;
    }

    public double getKubai() {
        return kubai;
    }

    public void setKubai(double kubai) {
        this.kubai = kubai;
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
