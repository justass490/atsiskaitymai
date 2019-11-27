package isvestine;

import bazine.MoketojasImpl;

public class InternetasImpl extends MoketojasImpl implements Internetas {

    private String ip;

    public InternetasImpl(int kodas, String vardas, String pavarde, String adresas, double suma, String ip) {
        super(kodas, vardas, pavarde, adresas, suma);
        this.ip = ip;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
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