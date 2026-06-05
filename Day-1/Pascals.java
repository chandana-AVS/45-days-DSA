import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
class Pascals {
    public List<List<Integer>> generate(int numRows) {
            List<List<Integer>> triangle = new ArrayList<>();
            if(numRows<=0){
                return triangle;
            }
            for(int i=0;i<numRows;i++){
                List <Integer>row=new ArrayList<>();
                long val=1;
                row.add((int)val);
                for(int j=1;j<=i;j++){
                    val=val*(i-j+1)/j;
                    row.add((int)val);
                }
                triangle.add(row);
            }
            return triangle;
    }
}
class RunPascals{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the number of rows for Pascal's Triangle:");
        int numRows=sc.nextInt();

        Pascals p=new Pascals();
        List<List<Integer>> triangle=p.generate(numRows);

        System.out.println("Full Pascal's Triangle Structure for " + numRows + " rows:");
        System.out.println(triangle);
        sc.close();
       
    }
}


/* o/p:
Enter the number of rows for Pascal's Triangle:
5
[1]
[1, 1]
[1, 2, 1]
[1, 3, 3, 1]
[1, 4, 6, 4, 1] */