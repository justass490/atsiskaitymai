package bazine;

public class Transportas {
    private String tipas; //sausumos, oro, vandens
    private String variklis; // taip, ne
    private int pagaminimoMetai; // 1997
    private String marke; // Volvo, bmv, nissan
    private int duruSkaicius; // 4
    private String varomasEletkra; // taip, ne

    public Transportas(String tipas, String variklis, int pagaminimoMetai, String marke, int duruSkaicius, String varomasEletkra){

        this.tipas = tipas;
        this.variklis = variklis;
        this.pagaminimoMetai = pagaminimoMetai;
        this.marke = marke;
        this.duruSkaicius = duruSkaicius;
        this.varomasEletkra = varomasEletkra;
    }
    public String getTipas() {
        return tipas;
    }
    public void setTipas(String tipas) {
        this.tipas = tipas;
    }
    public String getVariklis(){
        return variklis;
    }
    public void setVariklis(String variklis){
        this.variklis = variklis;
    }
    public int getPagaminimoMetai(){
        return pagaminimoMetai;
    }
    public void setPagaminimoMetai(int pagaminimoMetai){
        this.pagaminimoMetai = pagaminimoMetai;
    }
    public String getMarke(){
        return marke;
    }
    public void setMarke(String marke){
        this.marke = marke;
    }
    public int getDuruSkaicius(){
        return duruSkaicius;
    }
    public void setDuruSkaicius(int duruSkaicius){
        this.duruSkaicius = duruSkaicius;
    }
    public String getVaromasEletkra(){
        return varomasEletkra;
    }
    public void setVaromasEletkra(String varomasEletkra){
        this.varomasEletkra = varomasEletkra;
    }
}