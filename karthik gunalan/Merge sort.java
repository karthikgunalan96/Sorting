/* ------DA Assignment--------
   Merge Sort program
   Developed by: Karthik Gunalan
   
   */

import java.util.*;
import java.io.*;
import java.math.*;
import java.text.*;

public class MergeSort_1{
    public static void merge_sort(int[] array, int low, int high){
        // This is used to calculate the range for elements
        int limit = high - low;         
        if(limit<=1)
              return;
        int mid = low + limit/2;
 
        // This uses recursion methodology by calling the function by revoking the functionalities that are being used for the algorithm
        merge_sort(array, low, mid); 
        merge_sort(array, mid, high);
 
        // Merging the sub-arrays
        int[] temp = new int[limit];
        int i = low, j = mid;
        for (int k = 0; k < limit; k++){
            if (i == mid)  
                temp[k] = array[j++];
            else if (j == high) 
                temp[k] = array[i++];
            else if (array[j] < array[i]) 
                temp[k] = array[j++];
            else 
                temp[k] = array[i++];
        }    
        for (int k = 0; k < limit; k++) 
            array[low + k] = temp[k];         
        }

        
        public static void main() throws Exception{
            MergeSort_1 obj = new MergeSort_1();
            int n, i, n1;
            String s;
            
            InputStreamReader in=new InputStreamReader(System.in);
            BufferedReader br=new BufferedReader(in);
            Scanner sc=new Scanner(System.in);
            System.out.println("\nMerge Sort\nEnter an option number");
            System.out.println("\n1. user given input array");
            System.out.println("\n2. sorted array in ascending order with a specific length");
            System.out.println("\n3. Random array with a specific length");
            s=br.readLine();
            n=Integer.parseInt(s);
            if(n==1)
            {System.out.println("Enter the size of the array");
                n1=sc.nextInt();
                int array[] = new int[n1];
                  System.out.println("Enter"+n1+"elements ");
                for (i = 0; i < n1; i++)
                    
                    {array[i]=sc.nextInt();}
               long initialTime = System.currentTimeMillis(); 
                merge_sort(array, 0, n1);
                 long endTime = System.currentTimeMillis();
                System.out.println("\nAfter the Sorting ");        
                for (i = 0; i < n1; i++)
                    System.out.print(array[i]+" ");            
            NumberFormat fm = new DecimalFormat("#0.00000");
	 System.out.println("Run time is " + fm.format((endTime - initialTime) / 1000d) + " ms");
        }
                
            if(n==2)
            {   System.out.println("Enter the size of the array");
                n1=sc.nextInt(); 
                int array[] = new int[n1];
                  
                for (i = 0; i < n1; i++)
                   
                    {array[i]=i;}
               long initialTime = System.currentTimeMillis(); 
                merge_sort(array, 0, n1);
                 long endTime = System.currentTimeMillis();
                System.out.println("\nAfter the Sorting ");        
                for (i = 0; i < n1; i++)
                    System.out.println(array[i]+" ");            
            NumberFormat fm = new DecimalFormat("#0.00000");
	 System.out.println("\nRun time is " + fm.format((endTime - initialTime) / 1000d) + " ms");
        }
        if(n==3)
        {
            System.out.println("Enter the size of the array");
                n1=sc.nextInt();
                int array[] = new int[n1];
                  
                for (i = 0; i < n1; i++)
                    
                    {array[i] =(int)( Math.random()*1000);}
               long initialTime = System.currentTimeMillis(); 
                merge_sort(array, 0, n1);
                 long endTime = System.currentTimeMillis();
                System.out.println("\nAfter the Sorting ");        
                for (i = 0; i < n1; i++)
                    System.out.print(array[i]+" ");            
            NumberFormat fm = new DecimalFormat("#0.00000");
	 System.out.println("Run time is " + fm.format((endTime - initialTime) / 1000d) + " ms");
        }
        }    
}