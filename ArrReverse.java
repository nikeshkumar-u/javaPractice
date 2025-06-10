import java.util.Arrays;

public class ArrReverse {
    public static void main(String[] args) {
        int arr[] = {2,4,5,6,3,6};
        int i=0,j=arr.length-1;
        while(i<j){
           
           int temp=arr[i];
           arr[i]=arr[j];
           arr[j]=temp;
           i++;
           j--;
        }
        System.out.println(Arrays.toString(arr));
    }
    
}
