import java.util.*;

public class AlphabetCoverageHashSet {
    public static String checkWords(String[] S) {
        HashSet<Character> set = new HashSet<>();

        for (String word : S) {
            char firstChar = Character.toLowerCase(word.charAt(0));
            set.add(firstChar);
        }

        return (set.size() == 26) ? "Yes" : "No";
    }

    public static void main(String[] args) {
        String S[] = { "Element", "fog", "great", "hen", "ok", "ios", "Kim", "Parrot", "quiz", "mango", "nature",
                "apple", "ball", "lime", "cat", "dog", "ruby", "shine", "tin", "ultra", "volleyball", "xerox", "wow",
                "yak", "Joke", "zenon" };

        System.out.println(checkWords(S));
    }
}
