import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int arrayLength = 10;
        int[] a = enterArray(arrayLength);
        System.out.println("masyvas: ");
        printOut(a);
        if (add(a) > 0) System.out.println("Masyvo lyginiu elementu vidurkis: " + average(a));
        else System.out.println("Masyve lyginių elementų nera");
        switchPlace(a, smallValue(a), bigValue(a));
        System.out.println("Masyvas po didziausio ir maziausio sukeitimo elementu:");
        printOut(a);
        lowVallue(a);
    }
    //array skaiciu ivedimas
    public static int[] enterArray(int arrayLength){
        int[] array = new int[arrayLength];
        System.out.println("Iveskite " + arrayLength + " sveiku skaiciu");
        for (int i = 0; i < arrayLength; i++){
            while (true){
                Scanner a = new Scanner(System.in);
                try{
                    System.out.println("iveskite " + (i + 1) + " skaiciu:");
                    array[i] = a.nextInt();
                    break;
                }catch (Exception e){
                    System.out.println("netinkamas skaicius");
                }
            }
        } return array;
    }
    //atprintina array
    private static void printOut(int[] array){
        for (int value : array){
            System.out.println(value + " ");
        }
        System.out.println();
    }
    //sudeda lygias reiksmes
    private static int add(int[] array){
        int sum = 0;
        for (int value : array){
            if (value % 2 == 0) {
                sum += value;
            }
        }
        return sum;
    }
    //
        private static int count(int[] array) {
            int count = 0;
            for (int value : array) {
                if (value != 0 && value % 2 == 0) {
                    count++;
                }
            }
            return count;
    }
    //lyginiu skaiciu vidurkis
    private static double average(int[] array){
        return (double) add(array) / count(array);
    }
    //sukeicia didziausios masyvo reksmes vieta
    private static int bigValue(int[] array){
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > array[index]) index = i;
        }
        return index;
    }
    //sukeicia maziausios masyvo reiksmes vieta
    private static int smallValue(int[] array){
        int index = 0;
        for (int i = 0; i < array.length; i++){
            if (array[i] < array[index]) index = i;
        }
        return index;
    }
    //pakeistas masyvas
    private static void switchPlace(int[] array, int index1, int index2){
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
    //suranda maziausia lygini neigiama skaiciu
    public static void lowVallue(int[] array){
        int krt = 0;
        for (int i = 0; i < array.length; i++){
            if (array[i] % 2 == 0){
                if (array[i] < krt){
                    krt = array[i];
                }
            }
        }
        System.out.println("maziausias lyginis skaicius: " + krt);
    }
}