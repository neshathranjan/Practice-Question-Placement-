import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of items: ");
        int n = sc.nextInt();

        int[] val = new int[n];
        int[] wt = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter value and weight of item " + (i + 1) + ": ");
            val[i] = sc.nextInt();
            wt[i] = sc.nextInt();
        }

        System.out.print("Enter knapsack capacity: ");
        int W = sc.nextInt();

        int[] dp = new int[W + 1];
        for (int i = 0; i <= W; i++) {
            dp[i] = 0;
        }
        for (int i = 0; i < n; i++) {
            for (int w = W; w >= wt[i]; w--) {
                if (dp[w - wt[i]] + val[i] > dp[w]) {
                    dp[w] = dp[w - wt[i]] + val[i];
                }
            }
        }

        System.out.println("Maximum value in knapsack = " + dp[W]);

        sc.close();
    }
}
