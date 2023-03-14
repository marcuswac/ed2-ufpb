package exemplos.complexidade;

import java.util.Arrays;

import exemplos.Utils;

public class ThreeWayDisjoint {
    /** 
     * Returns true if there is no element common to all three arrays. 
    */
    public static boolean disjoint1(int[] a, int[] b, int[] c) {
        for (int x : a)
            for (int y : b)
                for (int z : c)
                    if ((x == y) && (y == z))
                        return false;
        return true;
    }
    
    public static boolean disjoint2(int[] a, int[] b, int[] c) {
        for (int x : a)
            for (int y : b)
                if (x == y)
                    for (int z : c)
                        if (x == z)
                            return false;
        return true;
    }

    public static void main(String[] args) {
        int[] a = Utils.randomArray(1000, 0, 100000);
        int[] b = Utils.randomArray(1000, 0, 100000);
        int[] c = Utils.randomArray(1000, 0, 100000);
        
        long initTime = System.currentTimeMillis();
        boolean todosDiferentes = disjoint1(a, b, c);
        long durationMs = System.currentTimeMillis() - initTime;
        System.out.println("Arrray a: " + Arrays.toString(a));
        System.out.println("Arrray b: " + Arrays.toString(b));
        System.out.println("Arrray c: " + Arrays.toString(c));
        System.out.println("Todos os elementos são diferentes? " + todosDiferentes);
        System.out.println("Tempo: " + durationMs + "ms");
    }
}
