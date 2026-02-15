import java.util.*;

class Solution2 {

    public boolean wordPattern(String pattern, String s) {
        String[] w = s.split(" ");
        if (pattern.length() != w.length) return false;

        HashMap<Object, Integer> map = new HashMap<>();

        for (int i = 0; i < pattern.length(); i++) {
            if (!Objects.equals(map.put(pattern.charAt(i), i),
                                map.put(w[i], i)))
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter pattern:");
        String pattern = sc.nextLine();

        System.out.println("Enter string:");
        String s = sc.nextLine();

        Solution2 obj = new Solution2();
        System.out.println("Output: " + obj.wordPattern(pattern, s));

        sc.close();
    }
}
