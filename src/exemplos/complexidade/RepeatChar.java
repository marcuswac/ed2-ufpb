 package exemplos.complexidade;
 
 public class RepeatChar {
 
    public static String repeat(char c, int n) {
        String answer = "";
        for (int j = 0; j < n; j++)
            answer += c;
        return answer;
    }

    public static void main(String[] args) {
        long initTime = System.currentTimeMillis();
        String res = repeat('a', 100000);
        long durationMs = System.currentTimeMillis() - initTime;
        System.out.println("String: " + res);
        System.out.println("Tempo: " + durationMs + "ms");
    }
 }