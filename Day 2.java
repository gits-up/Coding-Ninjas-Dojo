public class Solution 
{
    public static int elementThatAppearsOnce(int[] arr) 
    {
        int ones = 0, twos = 0, commonMask;

        for (int i = 0; i < arr.length; i++) 
        {
            
            twos |= (ones & arr[i]);

            
            ones ^= arr[i];

            
            commonMask = ~(ones & twos);

            
            ones &= commonMask;
            twos &= commonMask;
        }

        return ones;
    }

    public static void main(String[] args) 
    {
        
        int[] arr1 = {1, 2, 1, 1};
        System.out.println(elementThatAppearsOnce(arr1)); 

        int[] arr2 = {1, 3, 3, 3, 1, 1, 4};
        System.out.println(elementThatAppearsOnce(arr2)); 
    }
}
