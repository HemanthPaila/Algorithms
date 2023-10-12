// In the KMP we will build the longest prefix also suffix array.
//This is how to build the longest prefix also suffix array.
package algorithms.string_matching;

public class KMP {

    public static void main(String[] args) {
        String str = "acccbaaacccbaaac"; // perfect test case to understand for building an LSP array
        String str1 = "baaac";
        int[] lsp = new int[str.length()];
        lsp[0] = 0;
        int q = 0;
        int n = str.length();
        int m = str1.length();
        for (int i = 1; i < str.length(); i++) {
            int j = lsp[i - 1];
            while (j > 0 && str.charAt(i) != str.charAt(j)) {
                j = lsp[j - 1];
            }
            if (str.charAt(i) == str.charAt(j))
                j++;
            lsp[i] = j;
        }
        // For comparing the strings and moving the based on the lsp array
        for (int i = 0; i < n; i++) {
            while (q > 0 && str.charAt(i) != str1.charAt(q)) {
                q = lsp[q];
            }
            if (str.charAt(i) == str1.charAt(q)) {
                q = q + 1;
            }
            if (q == m) {
                System.out.println(i - (m - 1) + 1);
                q = lsp[q - 1];
            }
        }
    }

}
// This algorithm run time complexity of O(m log m)+O(n log m)
// Then comparing the string with the pattern and if an unmatch occurred then
// make a move based on the longest prefix also suffix array(LSP).