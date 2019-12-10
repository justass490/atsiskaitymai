import java.util.Iterator;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Studentai pirmas = new Studentai(84521255,"Justas Pavardenis", "2001 24 07", "j18", 5.5);
        Studentai antas = new Studentai(54206682,"Tomas Pavardenis", "2004 08 12", "a4", 9.1);
        Studentai trecias = new Studentai(16030171,"Kestas Pavardenis", "2000 04 20", "a4", 8.5);
        Studentai ketvirtas = new Studentai(95986750,"Domas Pavardenis", "2001 05 27", "j18", 4.6);
        Studentai penktas = new Studentai(29762199,"Mantas Pavardenis", "2003 11 13", "j18", 6.4);
        Studentai sestas = new Studentai(33545471,"Agne Pavardenis", "1999 12 05", "a4", 8.0);
        Studentai septintas = new Studentai(87336585,"Simas Pavardenis", "2002 03 22", "t13", 6.6);
        Studentai astuntas = new Studentai(50828419,"Dominykas Pavardenis", "1998 09 01", "t13", 9.9);
        Studentai devintas = new Studentai(81596456,"Egle Pavardenis", "2003 10 13", "j18", 6.9);
        Studentai desimtas = new Studentai(50720399,"Simona Pavardenis", "2005  07 22", "t13", 3.5);

        ArrayList<Studentai> list = new ArrayList<>();
        list.add(pirmas);
        list.add(antas);
        list.add(trecias);
        list.add(ketvirtas);
        list.add(penktas);
        list.add(sestas);
        list.add(septintas);
        list.add(astuntas);
        list.add(devintas);
        list.add(desimtas);
        System.out.println("|Studentu sarasas");
        System.out.println(list);

        System.out.println("Kokios grupes studentus norite perziureti?");
        System.out.println("| j18 - a4 - t13|");
        Scanner s = new Scanner(System.in);
        String group = s.nextLine();

        list.removeIf(studentai -> studentai.getGrupe() != group);
        System.out.println(list);
    }
}
