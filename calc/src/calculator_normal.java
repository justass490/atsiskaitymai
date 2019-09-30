import java.util.Scanner;
public class calculator_normal {
    public static void main(String[] args) {
        double sk1, sk2, result;
        String veiksmas, restart;
        boolean r = true;
        do {
            System.out.println("Įveskite pirmą skaicių...");
            Scanner s = new Scanner(System.in);
            sk1 = s.nextDouble();
            System.out.println("Įveskite antra skaicių...");
            sk2 = s.nextDouble();
            System.out.println("Įveskite veiksmą");
            veiksmas = s.next();
            switch (veiksmas) {
                case "+":
                    System.out.println(sk1 + " + " + sk2 + " = " + (sk1 + sk2));
                    break;
                case "-":
                    System.out.println(sk1 + " - " + sk2 + " = " + (sk1 - sk2));
                    break;
                case "*":
                    System.out.println(sk1 + " * " + sk2 + " = " + (sk1 * sk2));
                    break;
                case "/":
                    if (sk2 == 0){
                        System.out.println("Dalyba iš 0 yra negalima");
                    }
                    else{
                        System.out.println(sk1 + " / " + sk2 + " = " + (sk1 / sk2));
                    }
                    break;
                case "#":
                    for (int i = 13; i <= 25; i++){
                        result = sk1 * sk2 + (sk2 - sk1) / sk1 * i;
                        if ( result < 6){
                            System.out.println(sk1 + " * " + sk2 + " + (" + sk2 + " - " + sk1 + ") / " + sk1 + " * " + i + " = " + result + " < 6 ");
                        }
                        else if ( result == 6){
                            System.out.println(sk1 + " * " + sk2 + " + (" + sk2 + " - " + sk1 + ") / " + sk1 + " * " + i + " = " + result + " = 6 ");
                        }
                        else if ( result > 6){
                            System.out.println(sk1 + " * " + sk2 + " + (" + sk2 + " - " + sk1 + ") / " + sk1 + " * " + i + " = " + result + " > 6 ");
                        }
                    }
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
}