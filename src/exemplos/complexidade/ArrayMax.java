package exemplos.complexidade;

import java.util.Arrays;
import exemplos.Utils;

public class ArrayMax {

    /*
     *  Retorna o valor máximo de um array numérico
     */
    public static int arrayMax(int[] data) {
        int n = data.length;
        int currentMax = data[0];
        for (int j = 1; j < n; j++)
            if (data[j] > currentMax)
                currentMax = data[j];
        return currentMax;
    }

    public static void main(String[] args) {
        int[] a = Utils.randomArray(20, 0, 100);
        System.out.println("Array: " + Arrays.toString(a));
        System.out.println("Máximo: " + arrayMax(a));
    }
}