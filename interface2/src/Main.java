import bazine.TransportasImpl;
import isvestine.AutomobilisImpl;

public class Main{

    public static void main(String[] args) {

        //tipas: oro | variklis: taip | metai: 2001 | marke: audi | durys: 4 | varomasElektra: ne |

        TransportasImpl transportas1 = new TransportasImpl("sausumos", "taip", 2006);
        TransportasImpl transportas2 = new TransportasImpl("oro", "taip", 1997);
        TransportasImpl transportas3 = new TransportasImpl("vandens", "ne", 1980);
        TransportasImpl transportas4 = new TransportasImpl("vandens", "taip", 2011);
        TransportasImpl transportas5 = new TransportasImpl("sausumos", "ne", 2010);
        AutomobilisImpl transportas6 = new AutomobilisImpl("sausumos", "taip", 2008, "BMW", 4, "ne");
        AutomobilisImpl transportas7 = new AutomobilisImpl("sausumos", "taip", 2010, "Audi", 4, "ne");
        AutomobilisImpl transportas8 = new AutomobilisImpl("sausumos", "taip", 2016, "Volkswagen", 4, "ne");
        AutomobilisImpl transportas9 = new AutomobilisImpl("sausumos", "ne", 2019, "Tesla", 4, "taip");
        AutomobilisImpl transportas10 = new AutomobilisImpl("sausumos", "ne", 2016, "Tesla", 4, "taip");

        TransportasImpl[] list = {transportas1, transportas2, transportas3, transportas4, transportas5, transportas6, transportas7, transportas8, transportas9, transportas10};
        System.out.println("_____________________________________________________");
        System.out.println("Automobiliai, varomi elektra: ");
        for(TransportasImpl variklis : list) {
            if (variklis instanceof AutomobilisImpl){
                if (((AutomobilisImpl) variklis).getVaromasElektra().equals("taip")){
                    System.out.println("Tipas: " + variklis.getTipas() + " | " + "Metai: " + variklis.getMetai() + " | " + "Marke: " + ((AutomobilisImpl) variklis).getMarke() + " | " + ((AutomobilisImpl) variklis).getDurys() + " duru");
                }
            }
        }
        System.out.println("_____________________________________________________");
    }
}