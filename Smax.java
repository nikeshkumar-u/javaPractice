public class Smax {
    public static void main(String[] args) {
        int [] a={4,5,78,6,4,6,1,2,88};
        int max=Integer.MIN_VALUE,Smax=Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++){
            if (a[i]>max) {
                Smax=max;
                max=a[i];
            }
            else if(a[i]>Smax && Smax!=max){
                Smax=a[i];
            }
        }
        System.out.println("largest:"+max);
        System.out.println("Second largest:"+Smax);
    }
}
