import java.util.Arrays;

public class Fibonicc {
    public static void main(String[] args) {
        int [] a = new int [10];
        int first=0,second=1;
         a[0]=first;
         a[1]=second;
        for (int i=2;i<a.length;i++){
        
         int sum =first + second;
         a[i]= sum;
         int temp= second;
         second = sum;
         first = temp;

        }
        System.out.println(Arrays.toString(a));
    }
    
}
