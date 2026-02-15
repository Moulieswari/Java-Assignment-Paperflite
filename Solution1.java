import java.util.Scanner;

class Solution1 {

    public String removeKdigits(String num, int k) {
        StringBuilder sb = new StringBuilder(num);

        for (int i = 0; i < k; i++) {
            int j = 0;
            while (j < sb.length() - 1 && sb.charAt(j) <= sb.charAt(j + 1))
                j++;
            sb.deleteCharAt(j);
        }

        while (sb.length() > 1 && sb.charAt(0) == '0')
            sb.deleteCharAt(0);

        return sb.length() == 0 ? "0" : sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number:");
        String num = sc.nextLine();

        System.out.println("Enter k:");
        int k = sc.nextInt();

        Solution1 sol = new Solution1();
        System.out.println("Output: " + sol.removeKdigits(num, k));

        sc.close();
    }
}
