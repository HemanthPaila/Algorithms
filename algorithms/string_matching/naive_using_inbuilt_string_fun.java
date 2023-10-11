package algorithms.string_matching;

public class naive_using_inbuilt_string_fun {
    public static void main(String[] args) {
        int ans = 0;
        String str = "hemanth";
        int window = 3;
        String target = "ann";
        for (int i = 0; i < (str.length() - target.length()) + 1; i++) {
            String s = str.substring(i, window + i);
            if (s.equals(target)) {
                ans = 1;
                break;
            }
        }
        if (ans == 1) {
            System.out.println("Found");
        } else {
            System.out.println("Not found");
        }
    }

}
