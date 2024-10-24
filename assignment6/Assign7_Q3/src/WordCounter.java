import java.util.HashMap;

public class WordCounter {

    public static void countWordsInLine(String line) {
        HashMap<String, Integer> wordCountMap = new HashMap<>();
        
        String[] words = line.split("\\s+"); 

        for (String word : words) {
            word = word.toLowerCase(); 
            wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
        }

     
        System.out.println("Word counts:");
        for (String word : wordCountMap.keySet()) {
            System.out.println(word + ": " + wordCountMap.get(word));
        }
    }

    public static void main(String[] args) {
        String line = "This is a test. This test is only a test.";
        countWordsInLine(line);
    }
}
