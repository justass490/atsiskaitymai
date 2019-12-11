import Darbininkai.DarbininkaiImpl;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Collections;

public class Main{
    private static void sort(ArrayList<DarbininkaiImpl> list) {
    }

    //vardas, detale, detaliuKiekis, detalesKaina
    public static void main(String[] args) {
        DarbininkaiImpl pirmas = new DarbininkaiImpl("Jonas", "a", 1001, 110);
        DarbininkaiImpl antras = new DarbininkaiImpl("Justas", "b", 230, 15);
        DarbininkaiImpl trecias = new DarbininkaiImpl("Kestas", "c", 1030, 25);
        DarbininkaiImpl ketvirtas = new DarbininkaiImpl("Petras", "d", 170, 80);
        DarbininkaiImpl penktas = new DarbininkaiImpl("Domas", "e", 150, 60);
        DarbininkaiImpl sestas = new DarbininkaiImpl("Dominykas", "f", 200, 70);
        DarbininkaiImpl septintas = new DarbininkaiImpl("Simas", "g", 1005,30);
        DarbininkaiImpl astuntas = new DarbininkaiImpl("Tomas", "h", 300, 20);
        DarbininkaiImpl devintas = new DarbininkaiImpl("Dovydas", "i", 150, 30);
        DarbininkaiImpl desimtas = new DarbininkaiImpl("Lukas","j", 240, 70);

        ArrayList<DarbininkaiImpl> list = new ArrayList<>();
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
        for (DarbininkaiImpl i : list){
            System.out.println(i);
        }
        System.out.println("---------------------------------------------");
        System.out.println("|Pagamintu detaliu dienos suvestine|");
        System.out.println(" ");
        for (DarbininkaiImpl i : list){
            double suma = i.getDetalesKaina() * i.getDetaliuKiekis();
            System.out.println("<detale: " + i.getDetale() + " > <kiekis: " + i.getDetaliuKiekis() + " > <suma: " + suma);
        }
        System.out.println("---------------------------------------------");
        System.out.println("|Suvestine pagal detaliu skaiciu|");
        System.out.println(" ");
        list.sort(Comparator.comparing(DarbininkaiImpl::getDetaliuKiekis, Collections.reverseOrder()).thenComparing(DarbininkaiImpl::getDetale));
                System.out.println(list);

        System.out.println("---------------------------------------------");
        System.out.println("|Normos ivykdymas|");
        System.out.println(" ");
    Iterator<DarbininkaiImpl> i = list.iterator();
        while (i.hasNext()) {
            DarbininkaiImpl zmogus = i.next();
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