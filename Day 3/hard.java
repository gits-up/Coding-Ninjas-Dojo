public class Solution {

    public static int numsWithProductK(int l, int r, int k) {
        int count = 0;

        for (int num = l; num <= r; num++) {
            int product = 1;
            int temp = num;

            // Calculate the product of digits
            while (temp > 0) {
                int digit = temp % 10;
                product *= digit;
                temp /= 10;
            }

            // Check if the product matches 'k'
            if (product == k) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int T = scanner.nextInt();
        for (int t = 0; t < T; t++) {
            int L = scanner.nextInt();
            int R = scanner.nextInt();
            int K = scanner.nextInt();

            int result = numsWithProductK(L, R, K);
            System.out.println(result);
        }

        scanner.close();
    }
}
