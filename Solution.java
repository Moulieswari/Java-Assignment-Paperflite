import java.util.Scanner;

public class Solution {

    public int singleNumber(int[] nums) {
        int result = 0;

        for (int i = 0; i < nums.length; i++) {
            result = result ^ nums[i];
        }

        return result;
         
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter numbers (space separated):");
        String input = sc.nextLine();

        String[] parts = input.trim().split("\\s+");
        int[] nums = new int[parts.length];

        for (int i = 0; i < parts.length; i++) {
            nums[i] = Integer.parseInt(parts[i]);
        }

        Solution sol = new Solution();
        int answer = sol.singleNumber(nums);

        System.out.println("Single number is: " + answer);

        sc.close();
    }
}
