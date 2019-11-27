package bazine;

public class MoketojasImpl implements Moketojas {
    private int kodas;
    private String vardas;
    private String pavarde;
    private String adresas;
    private double suma;

    public MoketojasImpl(int kodas, String vardas, String pavarde, String adresas, double suma) {
        this.kodas = kodas;
        this.vardas = vardas;
        this.pavarde = pavarde;
        this.adresas = adresas;
        this.suma = suma;
    }


    public int getKodas() {
        return kodas;
    }

    public String getVardas() {
        return vardas;
    }

    public String getPavarde() {
        return pavarde;
    }

    public String getAdresas() {
        return adresas;
    }

    public double getSuma() {
        return suma;
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