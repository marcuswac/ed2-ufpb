package exemplos;
import java.util.Random;

public class Utils {
    public static int[] randomArray(int n, int from, int to) {
        return new Random().ints(n, from, to).toArray();
    }
}
