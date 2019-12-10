import java.util.Comparator;

public class Studentai implements Comparable{
    private long pazymejimoNr;
    private String vardasPavarde;
    private String gimimoData;
    private String grupe;
    private double vidurkis;

    public Studentai(long pazymejimoNr, String vardasPavarde, String gimimoData, String grupe, double vidurkis){
        this.pazymejimoNr = pazymejimoNr;
        this.vardasPavarde = vardasPavarde;
        this.gimimoData = gimimoData;
        this.grupe = grupe;
        this.vidurkis = vidurkis;
    }
    public long getPazymejimoNr(){
        return pazymejimoNr;
    }
    private void  setPazymejimoNr(long pazymejimoNr){
        this.pazymejimoNr = pazymejimoNr;
    }
    public String getVardasPavarde(){
        return vardasPavarde;
    }
    private void setVardasPavarde(String vardasPavarde){
        this.vardasPavarde = vardasPavarde;
    }
    public String getGimimoData(){
        return gimimoData;
    }
    private void setGimimoData(String gimimoData){
        this.gimimoData = gimimoData;
    }
    public String getGrupe(){
        return grupe;
    }
    private void setGrupe(String grupe){
        this.grupe = grupe;
    }
    public double getVidurkis(){
        return vidurkis;
    }
    private void setVidurkis(double vidurkis){
        this.vidurkis = vidurkis;
    }

    @Override
    public String toString() {
        return "Studentai " +
                "pazymejimoNr = " + pazymejimoNr +
                ", vardasPavarde = '" + vardasPavarde + '\'' +
                ", gimimoData = " + gimimoData +
                ", grupe = '" + grupe + '\'' +
                ", vidurkis = " + vidurkis +
                "\n";
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
