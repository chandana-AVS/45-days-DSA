import java.util.*;
class MergeIntervals {
    public int[][] merge(int[][] intervals) {

        //this function is used to sort the inetrvals based on the element at index 0 so that it would be easily identified if the intervals are overlapping or not


        Arrays.sort(intervals, Comparator.comparingInt(row -> row[0])); 
        
        //overlapping means if there are 2 time intervals such as [1,4] and [2,5] which means the start interval or end interval from 2nd set of intervals is included in the first set of intervals then we can merge the intervals and make it [1,5] because 2 is included in 1 and 4 is included in 5 so we can merge the intervals and make it [1,5]
        
        List<List<Integer>> arr = new ArrayList<>();
        for(int[] i :intervals){
            if(arr.isEmpty()||arr.get(arr.size()-1).get(1)<i[0]){
                 arr.add(
                    Arrays.asList(i[0], i[1]));
            }
            else{
                int m=Math.max(arr.get(arr.size()-1).get(1),i[1]);
                arr.get(arr.size()-1).set(1,m);
            }
        }
            // 1. Create the final 2D array with the size of your merged list
int[][] result = new int[arr.size()][2];

// 2. Copy data from the List into the 2D array
for (int l = 0; l < arr.size(); l++) {
    result[l][0] = arr.get(l).get(0); // Start time
    result[l][1] = arr.get(l).get(1); // End time
}
        
       return result;
       
    }
    
}

class RunMergeIntervals{
    public static void main(String[] args) {
        MergeIntervals mi=new MergeIntervals();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of intervals:");
        int n=sc.nextInt();
        int[][] intervals=new int[n][2];
        System.out.println("Enter the intervals (start and end):");
        for(int i=0;i<n;i++){
            intervals[i][0]=sc.nextInt();
            intervals[i][1]=sc.nextInt();
        }
        int[][] mergedIntervals = mi.merge(intervals);
        System.out.println("Merged Intervals:");
        for (int[] interval : mergedIntervals) {
            System.out.println(interval[0] + " " + interval[1]);
        }
        sc.close();
    }
}


/*o/p:
Enter the number of intervals:
4
Enter the intervals (start and end):
1 2
4 6
3 5
4 8
Merged Intervals:
1 2
3 8 */
