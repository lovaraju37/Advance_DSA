import java.util.*;

public class AlphabetCoverageHashMap {
    public static String checkWords(String[] S) {
        HashMap<Character, Boolean> map = new HashMap<>();

        for (char ch = 'a'; ch <= 'z'; ch++) {
            map.put(ch, false);
        }

        for (String word : S) {
            char firstChar = Character.toLowerCase(word.charAt(0));
            map.put(firstChar, true);
        }

        for (char ch = 'a'; ch <= 'z'; ch++) {
            if (!map.get(ch)) return "No";
        }

        return "Yes";
    }

    public static void main(String[] args) {
        String S[] = { "Element", "fog", "great", "hen", "ok", "ios", "Kim", "Parrot", "quiz", "mango", "nature",
                "apple", "ball", "lime", "cat", "dog", "ruby", "shine", "tin", "ultra", "volleyball", "xerox", "wow",
                "yak", "Joke", "zenon" };

        System.out.println(checkWords(S));
    }
}
