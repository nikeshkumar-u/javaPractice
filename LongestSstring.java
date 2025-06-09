public class LongestSstring {
    public static void main(String[] args){
        String s = "abcabcbb";
        String max = "";

        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                String sub = s.substring(i, j);

                if (!isRepeated(sub)) {
                    if (sub.length() > max.length()) {
                        max = sub;
                    }
                }
            }
        }

        System.out.println("Longest non-repeating substring: " + max);
    }

    // ✅ Corrected function to check if a string has any repeated characters
    public static boolean isRepeated(String str) {
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            for (int j = i + 1; j < str.length(); j++) {
                if (ch == str.charAt(j)) {
                    return true; // repeated character found
                }
            }
        }
        return false; // all characters unique
    }
}
