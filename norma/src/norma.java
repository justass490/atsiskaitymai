import java.util.Scanner;

public class norma {

    public static void main(String[] args) {
        double suma, atlyginimas = 0, k1 = 0.5, k2 = 1, k3 = 1.5;
        String norma;
        Scanner s = new Scanner(System.in);
        System.out.println("Įveskite atlyginimą");
        suma = s.nextDouble();
        System.out.println("Įveskite normą");
        norma = s.next();
        switch (norma){
            case "žemiau":
                System.out.println("Atlyginimas yra: " + (suma * k1));
                break;
            case "norma":
                System.out.println("Atlyginimas yra: " + (suma * k2));
                break;
            case "aukščiau":
                System.out.println("Atlyginimas yra: " + (suma * k3));
                break;
            default:
                System.out.println("Prašome įvesti tinkamą sumą");
        }
    }
}