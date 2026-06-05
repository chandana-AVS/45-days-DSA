import java.util.Scanner;
class BestTimeStock {
    public int maxProfit(int[] prices) {
        int l=0;
        int r=1;
        int mp=0;
        while(r<prices.length){
            if(prices[l]<prices[r]){
                int p=prices[r]-prices[l];
                mp=Math.max(mp,p);}
            else{
                 l=r;
            }
            r++  ;
        }
        return mp;
        
    }
}

class RunBest{
    Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        BestTimeStock bts=new BestTimeStock();
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number of elements in the array:");
        int n=s.nextInt();
        int[] prices=new int[n];
        System.out.println("Enter the elements of the array:");
        for(int i=0;i<n;i++){
            prices[i]=s.nextInt();
        }
        System.out.println(bts.maxProfit(prices));
        s.close();
    }
}


/*o/p:
Enter the number of elements in the array:
6
Enter the elements of the array:
7 1 5 3 6 4
5    */
