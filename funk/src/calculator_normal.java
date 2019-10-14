import java.util.Scanner;
public class calculator_normal {
    public static void main(String[] args) {
        double sk1, sk2, result;
        String veiksmas;
            System.out.println("Įveskite pirmą skaicių...");
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
    }
    //daugyba
    public static void dauginti(double sk1, double sk2){
        System.out.println("Jusu rezultatas: " + sk1 + "*" + sk2 + "=" + (sk1 * sk2));
        sk1 = sk1 * sk2;
    }
    //dalyba
    public static void dalinti(){
        System.out.println("Iveskite pirmaji skaiciu");
        Scanner S = new Scanner(System.in);
        double sk1 = S.nextDouble();
        System.out.println("Iveskite antraji skaiciu");
        double sk2 = S.nextDouble();
        System.out.println("Jusu rezultatas: " + sk1 + "/" + sk2 + "=" + (sk1 / sk2));
    }
    //sudetis
    public static double sudeti(double sk1, double sk2){
        System.out.println("Jusu rezultatas: " + sk1 + "+" + sk2 + "=" + (sk1 + sk2));
        sk1 = sk1 + sk2;
        return sk1;
    }
    //atimtis
    public static double atimti(){
        System.out.println("Iveskite pirmaji skaiciu");
        Scanner S = new Scanner(System.in);
        double sk1 = S.nextDouble();
        System.out.println("Iveskite antraji skaiciu");
        double sk2 = S.nextDouble();
        System.out.println("Jusu rezultatas: " + sk1 + "-" + sk2 + "=" + (sk1 - sk2));
        sk1 = sk1 - sk2;
        return sk1;
    }
}