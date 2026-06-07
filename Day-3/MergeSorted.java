import java.util.Scanner;
class MergeSorted {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=m-1;
        int j=n-1;
        int k=m+n-1;
        while(i>=0 && j>=0){
            if(nums1[i]>nums2[j]){
                nums1[k--]=nums1[i--];
            }
            else{
                nums1[k--]=nums2[j--];
            }
        }
        while(j>=0){
            nums1[k--]=nums2[j--];
        } 
    }
}
class RunMergeSorted{
    public static void main(String[] args) {
        MergeSorted ms=new MergeSorted();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements in the first array:");
        int m=sc.nextInt();

        System.out.println("Enter the number of elements in the second array:");
        int n=sc.nextInt();

        int[] nums1=new int[m+100]; // Assuming nums1 has enough space to hold all elements
        System.out.println("Enter the elements of the first array:");
        for(int i=0;i<m;i++){
            nums1[i]=sc.nextInt();
        }
        
        int[] nums2=new int[n];
        System.out.println("Enter the elements of the second array:");
        for(int i=0;i<n;i++){
            nums2[i]=sc.nextInt();
        }
        ms.merge(nums1, m, nums2, n);
        System.out.println("Merged array:");
        for(int i=0;i<m+n;i++){
            System.out.print(nums1[i] + " ");
        }
        sc.close();
    }
}


/*o/p:
Enter the number of elements in the first array:
4
Enter the number of elements in the second array:
3
Enter the elements of the first array:
1 3 4 5
Enter the elements of the second array:
2 4 6
Merged array:
1 2 3 4 4 5 6    */