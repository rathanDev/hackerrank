package jana;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WordLadder {

    private int findCharDifference(String word1, String word2) {
        if (word1 == null) throw new RuntimeException("word1 is null");
        if (word2 == null) throw new RuntimeException("word2 is null");
        if (word1.length() != word2.length()) throw new RuntimeException("no equal lenght");
        int difference = 0;
        for (int i=0; i<word1.length(); i++) {
            char chWord1 = word1.charAt(i);
            char chWord2 = word2.charAt(i);

            if (chWord1 != chWord2) difference++;
        }
        return difference;
    }

    private String findBestTransformedWord(String startWord, String endWord, List<String> words) {

        System.out.println("startWord = " + startWord);
        System.out.println("endWord = " + endWord);
        System.out.println("words = " + words);

        List<String> possibleWords = new ArrayList<String>();
        for (String word: words) {
            if (findCharDifference(startWord, word) == 1) possibleWords.add(word);
        }

        int lowestDifference = startWord.length();
        String bestWord = possibleWords.get(0);

        for (String possibleWord : possibleWords) {
            int charDifference = findCharDifference(endWord, possibleWord);
            if(charDifference < lowestDifference) {
                bestWord = possibleWord;
                lowestDifference = charDifference;
            }
        }

        System.out.println("bestWord = " + bestWord);
        return bestWord;
    }

    public static void main(String[] args) {
        String startWord = "hit";
        String endWord = "cog";
        List<String> words = new ArrayList(Arrays.asList("hot", "dot", "dog", "lot", "log"));

        WordLadder wordLadder = new WordLadder();
        words.add(endWord);
        for (int i=0;;i++) {
            System.out.println("Startword: " + startWord);
            startWord = wordLadder.findBestTransformedWord(startWord, endWord, words);
            words.remove(startWord);
            if (startWord.equals(endWord)) {
                System.out.println("times " + (i+1));
                break;
            }

            System.out.println();
        }
    }

}
