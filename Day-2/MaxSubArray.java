import java.util.Scanner;
import java.util.Arrays;
class MaxSubArray {
    public int maxsubarray(int[] nums) {
        int n=nums.length;
        int ms=0;int s=0;
        //this method is used to check if all the elements in the array are negative or positive
        if(Arrays.stream(nums).allMatch(x -> x < 0)){
            return Arrays.stream(nums).max().getAsInt();
        }
        else{
            if(n==1){
                return nums[0];
            }
            else{
                for(int i=0;i<n;i++){
                    s=s+nums[i];
                    ms=Math.max(ms,s);
                    if(s<0){
                        s=0;
                    }
                }
            }
        }

       return ms; 
    }
}

class RunMaxSubArray{
    public static void main(String[] args) {
        MaxSubArray msa=new MaxSubArray();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements in the array:");
        int n=sc.nextInt();
        int[] nums=new int[n];
        System.out.println("Enter the elements of the array:");
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        System.out.println(msa.maxsubarray(nums));
        sc.close();
    }
}


/*o/p:
Enter the number of elements in the array:
5
Enter the elements of the array:
5 4 -1 7 8
23    */