/* ------DA Assignment--------
   Quick Sort program
   Developed by: Karthik Gunalan
   
   */
import java.util.*;
import java.io.*;
import java.text.*;
 
public class QuickSort_1{
    int Array[];
     
    /* In this function last element is chosen as pivot */
    public int partition(int start, int end){
        int pivot = Array[end]; // Choosing pivot element
        int initial = start; // Index of starting element
     
        for (int i = start; i <= end-1; i++) {
            if (Array[i] <= pivot){
                    int tp = Array[initial];
                    Array[initial] = Array[i];
                    Array[i] = tp;
                    initial = initial + 1;
            }
        }
        // this will take care of the last swap 
        int tp = Array[initial];
        Array[initial] = Array[end];
        Array[end] = tp;
        return initial;
    }
 
    public void quick_sort(int arr[], int start, int end){
        this.Array = arr;
        if (start < end){
            int pv = partition(start, end);
            quick_sort(Array, start, pv - 1);
            quick_sort(Array, pv + 1, end);
        }
    }


    public static void main() throws IOException
    {
    InputStreamReader in=new InputStreamReader(System.in);
    BufferedReader br=new BufferedReader(in);
    Scanner sc = new Scanner(System.in);
    String s;
    int n=0,n1=0;
     System.out.println("\nQuick Sort\nEnter the an option number");
     System.out.println("\n1. user given input array");
     System.out.println("\n2. sorted array in ascending order with a specific length");
     System.out.println("\n3. Random array with a specific length");
    s=br.readLine();
    n=Integer.parseInt(s);
    if(n==1)
        {System.out.println("Enter the length of the array");
            n1=sc.nextInt();
            int ar[] = new int[ n1 ];
            System.out.println("enter "+n1+" elements that are to be added to the array");
     for(int i = 0; i < n1; i++)
        {   ar[i] = sc.nextInt();}
         
         long initialTime = System.currentTimeMillis();
         QuickSort_1 obj = new QuickSort_1();
         obj.quick_sort(ar, 0, n1-1);
        
         /* Calculating the run time complexity of the QuickSort Algorithm */
     long endTime = System.currentTimeMillis();
     NumberFormat fm = new DecimalFormat("#0.00000");
	 System.out.println("Run time is " + fm.format((endTime - initialTime) / 1000d) + " ms");
     System.out.println("Array after sorting: ");
         System.out.println(Arrays.toString(ar)); 
        }
      if(n==2)
    {
     System.out.println("Enter the length of the array");
     
     n1=sc.nextInt();
         int arr[] = new int[ n1 ];
           
     for(int i = 0; i < n1; i++)
        {   arr[i] = i;}
         
         long initialTime = System.currentTimeMillis();
         QuickSort_1 obj = new QuickSort_1();
         obj.quick_sort(arr, 0, n1-1);
        
         /* Calculating the run time complexity of the QuickSort Algorithm */
     long endTime = System.currentTimeMillis();
     NumberFormat fm = new DecimalFormat("#0.00000");
	 System.out.println("\nRun time is " + fm.format((endTime - initialTime) / 1000d) + " ms");
     System.out.println("\nArray after sorting: ");
         System.out.println(Arrays.toString(arr)); 
        }
     if(n==3)
            {System.out.println("Enter the length of the array");
                n1=sc.nextInt();
                int arr[] = new int[ n1 ];
                
                for(int i = 0; i < n1; i++)
        {   arr[i] = (int)( Math.random()*1000);}
         
         long initialTime = System.currentTimeMillis();
         QuickSort_1 obj = new QuickSort_1();
         obj.quick_sort(arr, 0, n1-1);
        
         /* Calculating the run time complexity of the QuickSort Algorithm */
     long endTime = System.currentTimeMillis();
     NumberFormat fm = new DecimalFormat("#0.00000");
	 System.out.println("Run time is " + fm.format((endTime - initialTime) / 1000d) + " ms");
     System.out.println("Array after sorting: ");
         System.out.println(Arrays.toString(arr));  
        }
        }
}