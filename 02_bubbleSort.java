import java.util.*;

// 2. bubble sort
public class BubbleSort{

     public static void main(String []args){
        int[] array = {4,1,10,5,8,7};
        int temp;
        
        //바로옆에것와 바꿈
        for(int j=0;j<array.length;j++){
            for(int i=j;i<array.length-1;i++){
                if(array[i]>array[i+1]){
                    temp=array[i];
                    array[i]=array[i+1];
                    array[i+1]=temp;
                }
            }
        }
        
        System.out.println("result = "+Arrays.toString(array));
     }
}