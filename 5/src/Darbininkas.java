import java.util.Comparator;

public class Darbininkas {
    private String vardas;
    private String detale;
    private int detaliuKiekis;
    private int detalesKaina;

    public Darbininkas(String vardas, String detale, int detaliuKiekis, int detalesKaina){
        this.vardas = vardas;
        this.detale = detale;
        this.detaliuKiekis = detaliuKiekis;
        this.detalesKaina = detalesKaina;
    }
    public String getVardas(){
        return vardas;
    }
    public void setVardas(String vardas){
        this.vardas = vardas;
    }
    public String getDetale(){
        return detale;
    }
    public void setDetale(String detale){
        this.detale = detale;
    }
    public int getDetaliuKiekis(){
        return detaliuKiekis;
    }
    public void setDetaliuKiekis(int detaliuKiekis){
        this.detaliuKiekis = detaliuKiekis;
    }
    public int getDetalesKaina(){
        return detalesKaina;
    }
    public void setDetalesKaina(int detalesKaina){
        this.detalesKaina = detalesKaina;
    }

    @Override
    public String toString() {
        return "Darbininkas{" +
                "vardas='" + vardas + '\'' +
                ", detale='" + detale + '\'' +
                ", detaliuKiekis=" + detaliuKiekis +
                ", detalesKaina=" + detalesKaina +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        return Comparator.comparing(Darbininkas::getDetaliuKiekis)
                .reversed()
                .thenComparing(Darbininkas::getDetale)
                .compare(this,(Darbininkas) o );
    }
}