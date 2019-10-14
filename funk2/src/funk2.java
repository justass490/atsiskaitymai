import java.util.Scanner;
public class funk2 {
    public static void main(String[] args) {
        double sk1, sk2, result;
        String veiksmas, restart;
        boolean r = true;
        do {System.out.println("Įveskite pirmą skaicių...");
            Scanner s = new Scanner(System.in);
            sk1 = s.nextDouble();
            System.out.println("Įveskite antra skaicių...");
            sk2 = s.nextDouble();
            System.out.println("Įveskite veiksmą");
            veiksmas = s.next();
            switch (veiksmas) {
                case "+":
                    sudeti(sk1, sk2);
                    break;
                case "-":
                    atimti();
                    break;
                case "*":
                    dauginti(sk1, sk2);
                    break;
                case "/":
                    dalinti();
                    break;
                case "#":
                    funkcija(sk1, sk2);
                    break;
                default:
                    System.out.println("Pasirinktas netinkamas veiksmas");
            }
            System.out.println("Ar norėtumėte pradėti iš naujo?: (y/n)");
            restart = s.next();
            switch (restart){
                case "y":
                    r = true;
                    break;
                case "n":
                    r = false;
                    break;
            }
        }while (r);
    }
    //daugyba
    public static void dauginti(double sk1, double sk2){
        System.out.println(sk1 + " * " + sk2 + " = " + (sk1 * sk2));
        sk1 = sk1 * sk2;
    }
    //dalyba
    public static void dalinti(){
        System.out.println("Iveskite pirma skaiciu");
        Scanner s = new Scanner(System.in);
        double sk1 = s.nextDouble();
        System.out.println("Iveskite antra skaiciu");
        double sk2 = s.nextDouble();
        if (sk2 == 0){
            System.out.println("Dalyba iš 0 yra negalima");
        }
        else{
            System.out.println(sk1 + " / " + sk2 + " = " + (sk1 / sk2));
        }
    }
    //sudetis
    public static double sudeti(double sk1, double sk2){
        System.out.println(sk1 + " + " + sk2 + " = " + (sk1 + sk2));
        sk1 = sk1 + sk2;
        return sk1;
    }
    //atimtis
    public static double atimti(){
        System.out.println("Iveskite pirma skaiciu");
        Scanner s = new Scanner(System.in);
        double sk1 = s.nextDouble();
        System.out.println("Iveskite antra skaiciu");
        double sk2 = s.nextDouble();
        System.out.println(sk1 + " - " + sk2 + " = " + (sk1 - sk2));
        sk1 = sk1 - sk2;
        return sk1;
    }
    //uzduotis (#)
    public static double funkcija(double sk1, double sk2){
        for (int i = 101; i <= 199; i++){
            double result = (sk2 + sk1) * sk2 + (sk2 -sk1) / sk1 * i;
            if ( result < 100){
                System.out.println("(" + sk2 + " * " + sk1 + ") * " + sk2 + " + (" + sk2 + " - " + sk1 + " ) /" + sk1 + " * " + i + " = " + result + " < 100" );
            }
            else if ( result == 100){
                System.out.println("(" + sk2 + " * " + sk1 + ") * " + sk2 + " + (" + sk2 + " - " + sk1 + " ) /" + sk1 + " * " + i + " = " + result + " = 100" );
            }
            else if ( result > 100){
                System.out.println("(" + sk2 + " * " + sk1 + ") * " + sk2 + " + (" + sk2 + " - " + sk1 + " ) /" + sk1 + " * " + i + " = " + result + " > 100" );
            }
        }
    return 0;}
}