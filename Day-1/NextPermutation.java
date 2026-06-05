import java.util.Arrays;
import java.util.Scanner;
class NextPermutation {
    public void nextPermutation(int[] nums) {
        int n=nums.length;
        int i=n-2;
        while(i>=0 && nums[i]>=nums[i+1]){
            i--;
        }
        if(i>=0){
            int j=n-1;
            while(nums[j]<=nums[i]){
                j--;
            }
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
        }
        int l=i+1;
        int r=n-1;
        while(l<r){
            int t=nums[l];
            nums[l]=nums[r];
            nums[r]=t;
            l++;
            r--;
        }
    }
}


class RunPermutation {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        NextPermutation np= new NextPermutation();
        
        // 1. Get array size
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        
        int[] nums = new int[size];
        
        // 2. Get array elements
        System.out.println("Enter the array elements separated by space:");
        for (int i = 0; i < size; i++) {
            nums[i] = sc.nextInt();
        }
        
        // 3. Process the next permutation
        np.nextPermutation(nums);
        
        // 4. Output the updated array
        System.out.println("\nNext Permutation Result:");
        System.out.println(Arrays.toString(nums));
        
        sc.close();
    }
}


/*o/p:
Enter the size of the array: 4
Enter the array elements separated by space:
2 3 1 5

Next Permutation Result:
[2, 3, 5, 1]



Enter the size of the array: 3
Enter the array elements separated by space:
1 1 5

Next Permutation Result:
[1, 5, 1] */