public class Prime {
    public static void main(String[]args){
        int []a={4,5,8,6,85,4,6,4};
        int primecount=0,sum=0;
        for (int arr:a){
            if(isPrime(arr)){
                System.out.print(arr+" ");
                primecount++;
                sum += arr;
              }
        }
        System.out.println(primecount);
        System.out.println(sum);
    }
    public static boolean isPrime(int arr){
        for (int i=2;i<=arr/2;i++){
            if(arr%i==0){
                return false;
            }
            
        }
        return true;
    }
    
}
