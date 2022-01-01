/*
Monk loves to preform different operations on arrays, and so being the principal of Hackerearth School,
 he assigned a task to his new student Mishki. Mishki will be provided with an integer array A of size N
 and an integer K , where she needs to rotate the array in the right direction by K steps and then print
 the resultant array. As she is new to the school, please help her to complete the task.
*/
import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner s =new Scanner(System.in);
        int t =s.nextInt();
        while(t != 0)
        { --t;
            int n =s.nextInt();
            int k =s.nextInt();
            k=k%n;
            int arr[] = new int[n];

            for(int i=0 ;i<n;i++){
                arr[i] = s.nextInt();
            }
            for(int j=0;j<k;j++){
                int temp=arr[0];
                arr[0]=arr[n-1];
                for(int i=1;i<n;i++){
                    int temp2 =arr[i];
                    arr[i]=temp;
                    temp=temp2;
                }
            }

            for(int num : arr){
                System.out.printf(num+" ");
            }
            System.out.println();
        }
    }
}
