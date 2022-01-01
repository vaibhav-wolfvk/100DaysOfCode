/*
Monk's best friend Micro, who happen to be an awesome programmer, got him an integer matrix M of size n*n
 for his birthday. Monk is taking coding classes from Micro. They have just completed array inversions and
  Monk was successful in writing a program to count the number of inversions in an array. Now, Micro has
  asked Monk to find out the number of inversion in the matrix M. Number of inversions, in a matrix is
  defined as the number of unordered pairs of cells {(i,j),(p,q)} such that M[i][j]>M[p][q] & i<=p&j<=q.
Monk is facing a little trouble with this task and since you did not got him any birthday gift,
you need to help him with this task.
*/

import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {

        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t>0){
            int n=  s.nextInt();
            int arr[][]= new int[n][n];
            for(int i=0;i<n;i++){
                //  arr[i]=new int[n];
                for(int j=0;j<n;j++){
                    arr[i][j]= s.nextInt();
                }
            }
            int count =0;
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    for(int v=i;v<n;v++){
                        for(int k= j;k<n;k++){
                            if(arr[i][j]>arr[v][k])
                                count++;
                        }
                    }
                }

            }

            System.out.println(count);
            t--;
        }



    }
}
