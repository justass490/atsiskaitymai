import bazine.Transportas;

public class Main {

    public static void main(String[] args) {
        //Automobilis(String tipas, String variklis, int pagaminimoMetai, String marke, int duruSkaicius, String varomasEletkra)
        Transportas transportas1 = new Transportas("automobilis", "taip", 1997, "Volvo", 4, "ne");
        Transportas transportas2 = new Transportas("automobilis", "taip", 2004, "Nissan", 4, "ne");
        Transportas transportas3 = new Transportas("automobilis", "taip", 2006, "Bmw", 4, "ne");
        Transportas transportas4 = new Transportas("automobilis", "taip", 2002, "Golf", 4, "ne");
        Transportas transportas5 = new Transportas("automobilis", "ne", 2016, "Tesla", 4, "taip");
        Transportas transportas6 = new Transportas("lektuvas", "taip", 1970, "Boeing", 6, "ne");
        Transportas transportas7 = new Transportas("yachta", "taip", 2009, "Sunseeker", 1, "ne");
        Transportas transportas8 = new Transportas("lektuvas", "taip", 1995, "Boeing", 6, "ne");
        Transportas transportas9 = new Transportas("dviratis", "ne", 2010, "Firmstrong", 0, "taip");
        Transportas transportas10 = new Transportas("valtis", "taip", 2009, "Alumacraft", 0, "ne");

        System.out.println("Transporto priemones varomos elektra: ");
        for ( int i = 1; i < 11; i++) {
            if (transportas1.getVaromasEletkra().equals("taip")) {
                System.out.println("tipas: " + transportas1.getVaromasEletkra() + " | " + "variklis: " + transportas1.getVariklis() + " | " + "pagaminimo metai: " + transportas1.getPagaminimoMetai() + " | " + "marke: " + transportas1.getMarke() + " | " + "duru skaicius: " + transportas1.getDuruSkaicius());
            }
        }
    }

}
