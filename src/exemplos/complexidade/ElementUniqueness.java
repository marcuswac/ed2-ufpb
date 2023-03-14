package exemplos.complexidade;

import java.util.Arrays;

import exemplos.Utils;

public class ElementUniqueness {

    /**
     * Returns true if there are no duplicate elements in the array. 
    */ 
    public static boolean unique1(int[ ] data) {
        int n = data.length;
        for (int j=0; j < n-1; j++)
            for (int k=j+1; k < n; k++)
                if (data[j] == data[k])
                    return false;
        return true;
    }

    public static void main(String[] args) {
        int[] a = Utils.randomArray(1000, 0, 100000);
        long initTime = System.currentTimeMillis();
        boolean isUnique = unique1(a);
        long durationMs = System.currentTimeMillis() - initTime;
        System.out.println("Array: " + Arrays.toString(a));
        System.out.println("Todos os elementos são diferentes? " + isUnique);
        System.out.println("Tempo: " + durationMs + "ms");
        
    }
}
