import java.util.Scanner;

public class WordCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int wordCount = 0;

        // Read until end of input
        while (sc.hasNext()) {
            sc.next();   // read next word
            wordCount++;
        }

        sc.close();

        System.out.println("Number of words: " + wordCount);
    }
}
