package algorithms.strings;

public class string_compression {
    public static void main(String[] args) {
        String str = "aabcccccaa";
        char ch = ' ';
        int count = 0;
        String ans = "";
        for (int i = 0; i < str.length(); i++) {
            if (ch == ' ') {
                ch = str.charAt(i);
                count++;
            } else if (ch == str.charAt(i)) {
                count++;
            } else {
                ans = ans + ch + Integer.toString(count);
                ch = str.charAt(i);
                count = 1;
            }
        }
        System.out.println(ans + ch + Integer.toString(count));
    }
}
