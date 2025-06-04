public class demo {
    public static void main(String[] args) {
        String str = "NIKESH";
        char[] ch = str.toCharArray();
        int first = 0, last = ch.length - 1;
        while (first < last) {
            char temp = ch[first];
            ch[first] = ch[last];
            ch[last] = temp;
            first++;
            last--;

        }
        String str1 = new String(ch);
        System.err.println(str1);
    }

}
