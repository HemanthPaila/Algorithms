// In the KMP we will build the longest prefix also suffix array.
//This is how to build the longest prefix also suffix array.
package algorithms.string_matching;

public class KMP {

    public static void main(String[] args) {
        String str = "acccbaaacccbaac";
        int[] lsp = new int[str.length()];
        lsp[0] = 0;
        for (int i = 1; i < str.length(); i++) {
            int j = lsp[i - 1];
            while (j > 0 && str.charAt(i) != str.charAt(j)) {
                j = lsp[j - 1];
            }
            if (str.charAt(i) == str.charAt(j))
                j++;
            lsp[i] = j;
        }
        for (int i = 0; i < lsp.length; i++) {
            System.out.println(lsp[i]);
        }
    }

}
// Then comparing the string with the pattern and if an unmatch occurred then
// make a move based on the longest prefix also suffix array(LSP).