//without using inbuilt functions
package algorithms.string_matching;

public class naive_approach {

    public static void main(String[] args) {
        String txt = "hemanth";
        String patt = "nth";
        int i, j;
        for (i = 0; i < txt.length(); i++) {
            for (j = 0; j < patt.length(); j++) {
                if (txt.charAt(i + j) != patt.charAt(j)) {
                    break;
                }
            }
            if (j == patt.length()) {
                System.out.println("Pattern matches at " + i);
            }
        }
    }

}