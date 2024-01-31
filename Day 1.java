import java.io.*;
import java.util.*;

public class Solution {

    public static int findMajority(int[] arr, int n) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        
        for (int num : arr) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() > n / 2) {
                return entry.getKey();
            }
        }

        
        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            
            int t = scanner.nextInt();

            for (int i = 0; i < t; i++) {
                
                int n = scanner.nextInt();

                
                int[] arr = new int[n];
                for (int j = 0; j < n; j++) {
                    arr[j] = scanner.nextInt();
                }

                
                int result = findMajority(arr, n);
                System.out.println(result);
            }
        } catch (NoSuchElementException e) {
            
        }
    }
}
