package DSA;
import java.util.*;
public class selectionsort {
    public static void selectionsort(int arr[]){
        for(int i=0;i<arr.length-1;i++){// 0 to lenth-2
            int min=arr[i];
            int minIndex=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<min){
                    min=arr[j];
                    minIndex=j;
                }

            }
            if(minIndex!=i){
       arr[minIndex]=arr[i];
       arr[i]=min;
            }

        }
   
    }
    public static void main(String [] args ){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the size of the element");
    int n=sc.nextInt();
    int arr[]=new int[n];
    System.out.println("Enter the elements of the array");
    for(int i=0;i<arr.length;i++){
        arr[i]=sc.nextInt();
    }

        selectionsort(arr);
    for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
    }  
  }
}
