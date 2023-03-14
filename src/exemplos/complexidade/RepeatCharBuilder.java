 package exemplos.complexidade;
 
 public class RepeatCharBuilder {
 
    public static String repeat(char c, int n) {
        StringBuilder builder = new StringBuilder();
        for (int j = 0; j < n; j++)
            builder.append(c);
        return builder.toString();
    }

    public static void main(String[] args) {
        long initTime = System.currentTimeMillis();
        String res = repeat('a', 100000);
        long durationMs = System.currentTimeMillis() - initTime;
        System.out.println("String: " + res);
        System.out.println("Tempo: " + durationMs + "ms");
    }
 }