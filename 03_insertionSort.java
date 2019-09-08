import java.util.*;

// 3. insertion sort
public class InsertionSort{

     public static void main(String []args){
        int[] array = {4,1,10,5,8,7};
        int temp;
        int j;
        
        for(int i=0;i<array.length-1;i++){
            j=i;
            // 값 비교 시 클 경우에만 바꿔줌
            while(j >=0 && array[j] > array[j+1]){
                temp = array[j];
                array[j] = array[j+1];
                array[j+1] = temp;
                j--;
            }
        }
        
        System.out.println("result = "+Arrays.toString(array));
     }
}