import java.util.Scanner;
import java.util.Arrays;
public class Easy {

/*Find the largest element in the given array */
    // Brute force approach
   /*  public static void largestele(int[] nums, int n){
        Arrays.sort(nums); // N(log n)
        System.out.println(nums[n-1]);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n = input.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i = 0; i < nums.length; i++){
            nums[i] = input.nextInt();
        }
        largestele(nums, n);
        input.close();
    }
} */

    // Optimal approach 
   /*  public static int largestele(int[] nums, int n){
        int largest = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length; i++){ // O(n)
            if(nums[i] > largest){
                largest = nums[i];
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n = input.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i = 0; i < nums.length; i++){
            nums[i] = input.nextInt();
        }
        int result = largestele(nums, n);
        System.out.println("Largest element in the array: " + Arrays.toString(nums) + " is: " + result);
        input.close();
    }
} */

/*Find the second largest element in the array */
// Brute force approach
/*public static void secondlargest(int[] nums, int n){
    Arrays.sort(nums);
    System.out.println(nums[n-2]);
}
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the value of n: ");
    int n = input.nextInt();

    int[] nums = new int[n];
    System.out.println("Enter the elements of the array: ");
    for(int i = 0; i < nums.length; i++){
        nums[i] = input.nextInt();
    }
    secondlargest(nums, n);
    input.close();
}
} */

// Better approach
/*public static int secondlargest(int[] nums, int n){
    int largest = 0;
    int secondlarge = Integer.MIN_VALUE;

    for(int i = 0; i < nums.length; i++){ // O(n)
        if(nums[i] > largest){
            largest = nums[i];
        }
    }
    for(int i = 0; i < nums.length; i++){
        if(nums[i] > secondlarge && nums[i] != largest){ // O(n)
            secondlarge = nums[i];
        }
    }
    return secondlarge;
}
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the value of n: ");
    int n = input.nextInt();

    int[] nums = new int[n];
    System.out.println("Enter the elements of the array: ");
    for(int i = 0; i < nums.length; i++){
        nums[i] = input.nextInt();
    }
    int result = secondlargest(nums, n);
    System.out.println("Second largest element in the array: " + Arrays.toString(nums) + " is: " + result);
    input.close();
}
} */


