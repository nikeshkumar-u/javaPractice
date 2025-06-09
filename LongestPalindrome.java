public class LongestPalindrome {
    public static void main(String[] args) {
        String[] words = { "madam", "malayalam", "racecar", "Greenapple", "moon", "banana" };
        String longest = words[0];
        for (String str : words) {
            if (isPalindrom(str)) {
                if (str.length() > longest.length()) {
                    longest = str;
                }

            }
        }
        System.out.println(longest);
    }

    public static boolean isPalindrom(String str) {
        str = str.toLowerCase();
        int left = 0;
        int right = str.length() - 1;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }

        }
        return true;
    }
}
