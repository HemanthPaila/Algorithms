package algorithms.string_matching;

import java.util.ArrayList;

public class best_kmp {

    // This KMP algorithm is easy to understand and with time complexity of O(n+m);
    public static void main(String[] args) {
        String txt = "acccbaaacccbaaac";
        String pat = "baaac";
        ArrayList<Integer> ans = new ArrayList<Integer>();
        int[] lsp = new int[pat.length()];
        lsp[0] = 0;
        int i = 1;
        int j = 0;
        while (i < pat.length()) {
            if (pat.charAt(i) == pat.charAt(j)) {
                j++;
                lsp[i] = j;
                i++;
            } else {
                if (j != 0) {
                    j = lsp[j - 1];
                } else {
                    lsp[i] = j;
                    i++;
                }
            }
        }
        i = 0;
        j = 0;
        while (i < txt.length()) {
            if (txt.charAt(i) == pat.charAt(j)) {
                i++;
                j++;
            }
            if (j == pat.length()) {
                ans.add(i - (pat.length() - 1));
                j = lsp[j - 1];
            } else if (i < txt.length() && txt.charAt(i) != pat.charAt(j)) {
                if (j != 0) {
                    j = lsp[j - 1];
                } else {
                    i++;
                }
            }
        }
        System.out.println(ans);
    }

}
