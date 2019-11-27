import bazine.MoketojasImpl;

public class Main {
    public static void main(String[] args) {

        //kodas: 456513 | vardas: Vardenis | pavarde: Pavardenis | adresas: partizanu g. 11a 24 | suma: 26e | numeris: 37062867943 | ip: 192.168.0.1 | sildymas: 20 m3 |

        MoketojasImpl pirmas = new MoketojasImpl(81426957, "Jonas", "Smuklys", "adresas1 g. 12a 25", 73);
        MoketojasImpl antras = new MoketojasImpl(81426957, "Kestas", "Smuklys", "adresas2 g. 6a 13", 52);
        MoketojasImpl trecias = new MoketojasImpl(81426957, "Vilius", "Smuklys", "adresas3 g. 8a 33", 65);
        MoketojasImpl ketvirtas = new MoketojasImpl(81426957, "Paulius", "Smuklys", "adresas4 g. 14a 25", 89);
        MoketojasImpl penktas = new MoketojasImpl(81426957, "Justas", "Smuklys", "adresas5 g. 34a 21", 70);
        MoketojasImpl sestas = new MoketojasImpl(81426957, "Andrius", "Smuklys", "adresas6 g. 4a 31", 64);
        MoketojasImpl septintas = new MoketojasImpl(81426957, "Matas", "Smuklys", "adresas7 g. 73a 28", 91);
        MoketojasImpl astuntas = new MoketojasImpl(81426957, "Tomas", "Smuklys", "adresas8 g. 25a 24", 33);
        MoketojasImpl devintas = new MoketojasImpl(81426957, "Deividas", "Smuklys", "adresas9 g. 63a 17", 76);
        MoketojasImpl desimtas = new MoketojasImpl(81426957, "Augustas", "Smuklys", "adresas10 g. 42a 11", 99);
        MoketojasImpl vienuoliktas = new MoketojasImpl(81426957, "Mindaugas", "Smuklys", "adresas11 g. 33a 12", 34);
        MoketojasImpl dvyliktas = new MoketojasImpl(81426957, "Dominykas", "Smuklys", "adresas12 g. 10a 22", 55);

        //skaiciavimas

        double result = pirmas.getSuma() + antras.getSuma() + trecias.getSuma() + ketvirtas.getSuma() + penktas.getSuma() + sestas.getSuma() + septintas.getSuma() + astuntas.getSuma() + devintas.getSuma() + desimtas.getSuma() + vienuoliktas.getSuma() + dvyliktas.getSuma();
        System.out.println("___________________________________");
        System.out.println("Bendra suma uz paslaugas: " + result + " €");
        System.out.println("___________________________________");
    }
}