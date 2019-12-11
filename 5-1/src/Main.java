import Studentai.StudentaiImpl;

import java.util.Collections;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {

        StudentaiImpl pirmas = new StudentaiImpl(84521255, "Justas Pavardenis", "2001 24 07", "j18", 5.5);
        StudentaiImpl antas = new StudentaiImpl(54206682, "Tomas Pavardenis", "2004 08 12", "a4", 9.1);
        StudentaiImpl trecias = new StudentaiImpl(16030171, "Kestas Pavardenis", "2000 04 20", "a4", 8.5);
        StudentaiImpl ketvirtas = new StudentaiImpl(95986750, "Domas Pavardenis", "2001 05 27", "j18", 4.6);
        StudentaiImpl penktas = new StudentaiImpl(29762199, "Mantas Pavardenis", "2003 11 13", "j18", 6.4);
        StudentaiImpl sestas = new StudentaiImpl(33545471, "Agne Pavardene", "1999 12 05", "a4", 8.0);
        StudentaiImpl septintas = new StudentaiImpl(87336585, "Simas Pavardenis", "2002 03 22", "t13", 6.6);
        StudentaiImpl astuntas = new StudentaiImpl(50828419, "Dominykas Pavardenis", "1998 09 01", "t13", 9.9);
        StudentaiImpl devintas = new StudentaiImpl(81596456, "Egle Pavardene", "2003 10 13", "j18", 6.9);
        StudentaiImpl desimtas = new StudentaiImpl(50720399, "Simona Pavardene", "2005  07 22", "t13", 3.5);

        ArrayList<StudentaiImpl> list = new ArrayList<>();
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
        System.out.println("---------------------------------------------");
        System.out.println("|Studentu sarasas");
        System.out.println(" ");
        System.out.println(list);

        ArrayList<StudentaiImpl> studentaiList = new ArrayList<>();
        ArrayList<StudentaiImpl> groupList = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            studentaiList.add(list.get(i));
            groupList.add(list.get(i));
        }

        System.out.println("---------------------------------------------");
        System.out.println("|Ar norite perziureti kokios nors grupes studentus? ( y/n )|");
        System.out.println(" ");
        Scanner a = new Scanner(System.in);
        String choice = a.nextLine();
        if (choice.equals("y")) {
            System.out.println("|Kokios grupes studentus norite perziureti?|");
            System.out.println("| j18 - a4 - t13|");
            Scanner s = new Scanner(System.in);
            String group = s.nextLine();
            groupList.removeIf(studentai -> !studentai.getGrupe().equals(group));
            System.out.println("---------------------------------------------");
            System.out.println(groupList);
        }
        System.out.println("---------------------------------------------");
        System.out.println("|studentai isrikiuoti pagal vidurki|");
        System.out.println(" ");
        Collections.sort(studentaiList);
        System.out.println(studentaiList);


        studentaiList.removeIf(ateate -> ateate.getVidurkis() < 4.0);
        System.out.println("|sarasas po istrinimo|");
        System.out.println(" ");
        System.out.println(studentaiList);
    }
}