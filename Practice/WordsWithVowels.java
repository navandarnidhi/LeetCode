public class WordsWithVowels {
    public static void main(String[] args) {
        String s = "aaa bbbb ccc ddd ef ei ooo abbbaad sdfsdf";

        String[] words = s.split(" ");

        System.out.println("Words containing vowels:");
        for (String word : words) {
            if (word.matches(".*[aeiouAEIOU].*")) { 
                System.out.println(word);
            }
        }
    }
}
