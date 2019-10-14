import java.util.*;
public class main{
public static void main(String[]args){
    int[] array = new int[9];
    array[0] = 1;
    array[1] = 3;
    array[2] = 7;
    array[3] = 9;
    array[4] = 4;
    array[5] = 5;
    array[6] = -3;
    array[7] = -5;
    array[8] = -1;
        int res = 0;
        for (int i=0; i < array.length; i++){
            if (array[i] > 0){
                res++;
            }
        }
    System.out.println("teigiamu elementu skaicius: " + res);
    int res2 = 0;
    for (int i=0; i < array.length; i++){
        if (array[i] < 0) {
            res2++;
        }
    }
    System.out.println("neigiamu elementu skaicius: " + res2);
    System.out.println("elementu skaicius: " + array.length);
}
}