package algorithms.string_matching;

import java.util.ArrayList;

public class rabin_karp {

	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		String txt = "hqghumeaylnlfdxfircvscxggbwkfnqduxwfnfozvsrscxggbwk";
		String pattern = "scxggbwk";
		int m = pattern.length();
		int n = txt.length();
		int i, j;
		int p = 0;
		int t = 0;
		int h = 1;
		int d = 10;
		int q = 13;
		int size = 0;

		for (i = 0; i < m - 1; i++)
			h = (h * d) % q;
		for (i = 0; i < m; i++) {
			p = (d * p + pattern.charAt(i)) % q;
			t = (d * t + txt.charAt(i)) % q;
		}
		for (i = 0; i <= n - m; i++) {
			if (p == t) {
				for (j = 0; j < m; j++) {
					if (txt.charAt(i + j) != pattern.charAt(j))
						break;
				}
				if (j == m)
					arr.add(i + 1);
			}
			if (i < n - m) {
				t = (int) (d * (t - txt.charAt(i) * Math.pow(d, m - 1) % q) + txt.charAt(i + m)) % q;
				if (t < 0)
					t = (t + q);
			}
		}
		size = arr.size();
		for (i = 0; i < size; i++) {
			System.out.println(arr.get(i));
		}
	}
}