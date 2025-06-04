public class Slargest {
    public static void main(String[] args) {
        int[] a = { 5, 8, 7, 6, 4, 6, 4, 56 };
        int primecount = 0, sum = 0;
        for (int arr : a) {
            if (isPrime(arr)) {
                primecount++;
                sum += arr;
                System.out.print("Prime number" + arr + " ");
            } else {
                System.out.println("Consonent " + arr);
            }
        }
        System.out.println("Prime Number count:" + primecount);
        System.out.println("Prime Number sum:" + sum);

    }

    public static boolean isPrime(int arr) {
        if (arr == 0 || arr == 1)
            return false;
        for (int i = 2; i < Math.sqrt(arr); i++) {
            if (arr % i == 0) {
                return false;
            }
        }
        return true;
    }

}
