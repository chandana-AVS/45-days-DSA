
import java.util.Scanner;
class SortColors {
    public void sortColors(int[] nums) {
        int z=0;int o=0;int t=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                z++;
            }
            else if(nums[i]==1){
                o++;
            }
            else{
                t++;
            }
        }
        int index=0;
        while(z-->0){
             nums[index++]=0;
        }
        while(o-->0){
             nums[index++]=1;
        }
        while(t-->0){
             nums[index++]=2;
        }
    }
}
class RunSortColors{
    public static void main(String[] args) {
        SortColors sc=new SortColors();
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number of elements in the array:");
        int n=s.nextInt();
        int[] nums=new int[n];
        System.out.println("Enter the elements of the array:(0,1,2)");

        for(int i=0;i<n;i++){
            nums[i]=s.nextInt();
        }
        sc.sortColors(nums);
        for(int i:nums){
            System.out.print(i+" ");
        }
        s.close();
    }
}



/*o/p
Enter the number of elements in the array:
5
Enter the elements of the array:(0,1,2)
1 0 2 1 0
0 0 1 1 2   */