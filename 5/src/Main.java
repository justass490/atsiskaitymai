import java.util.ArrayList;
import java.util.Iterator;
import java.util.Collections;

public class Main{
    private static void sort(ArrayList<Darbininkas> list) {
    }

    //vardas, detale, detaliuKiekis, detalesKaina
    public static void main(String[] args) {
        Darbininkas pirmas = new Darbininkas("Jonas", "a", 1001, 110);
        Darbininkas antras = new Darbininkas("Justas", "b", 230, 15);
        Darbininkas trecias = new Darbininkas("Kestas", "c", 1030, 25);
        Darbininkas ketvirtas = new Darbininkas("Petras", "d", 170, 80);
        Darbininkas penktas = new Darbininkas("Domas", "e", 150, 60);
        Darbininkas sestas = new Darbininkas("Dominykas", "f", 200, 70);
        Darbininkas septintas = new Darbininkas("Simas", "g", 1005,30);
        Darbininkas astuntas = new Darbininkas("Tomas", "h", 300, 20);
        Darbininkas devintas = new Darbininkas("Dovydas", "i", 150, 30);
        Darbininkas desimtas = new Darbininkas("Lukas","j", 240, 70);

        ArrayList<Darbininkas> list = new ArrayList<>();
        list.add(pirmas);
        list.add(antras);
        list.add(trecias);
        list.add(ketvirtas);
        list.add(penktas);
        list.add(sestas);
        list.add(septintas);
        list.add(astuntas);
        list.add(devintas);
        list.add(desimtas);
        System.out.println("---------------------------------------------");
        System.out.println("|Sarasas|");
        System.out.println(" ");
        for (Darbininkas i : list){
            System.out.println(i);
        }
        System.out.println("---------------------------------------------");
        System.out.println("|Pagamintu detaliu dienos suvestine|");
        System.out.println(" ");
        for (Darbininkas i : list){
            double suma = i.getDetalesKaina() * i.getDetaliuKiekis();
            System.out.println("<detale: " + i.getDetale() + " > <kiekis: " + i.getDetaliuKiekis() + " > <suma: " + suma);
        }
        System.out.println("---------------------------------------------");
        System.out.println("|Suvestine pagal detaliu skaiciu|");
        System.out.println(" ");
        for (Darbininkas i : list){
            double suma = i.getDetalesKaina() * i.getDetaliuKiekis();
            System.out.println("<detale: " + i.getDetale() + " > <kiekis: " + i.getDetaliuKiekis() + " > <suma: " + suma);
        }
        System.out.println("---------------------------------------------");
        System.out.println("|Normos ivykdymas|");
        System.out.println(" ");
        Iterator<Darbininkas> i = list.iterator();
        while (i.hasNext()) {
            Darbininkas zmogus = i.next();
            if (zmogus.getDetaliuKiekis() < 1000) {
                System.out.println("darbininkas: " + zmogus.getVardas() + ", detale " + zmogus.getDetale() + ", kiekis: "
                        + zmogus.getDetaliuKiekis() + ", kaina: " + zmogus.getDetalesKaina() + " - norma neivykdita");
            } else{
                System.out.println("darbininkas: " + zmogus.getVardas() + ", detale " + zmogus.getDetale() + ", kiekis: "
                        + zmogus.getDetaliuKiekis() + ", kaina: " + zmogus.getDetalesKaina() + " - norma ivykdyta");
            }
            if (zmogus.getDetalesKaina() > 100)
                i.remove();
        }
        System.out.println("---------------------------------------------");
        System.out.println("|Detales, zemesnes nei 100e|");
        System.out.println(" ");
        System.out.println(list);
        System.out.println("---------------------------------------------");
    }
}