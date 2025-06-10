import java.util.Arrays;

public class StringOperation {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");
        sb.append(" World!");
        sb.insert(5," java");
        sb.replace(5,10," C++");
        StrB(sb);
        //sb.reverse();
        String str = new String(sb);
        String[]st=str.split("");
        //System.out.println(Arrays.toString(st));
        //System.out.println(sb);
    }
    public static void StrB(StringBuffer sb){
        String original = sb.toString();
        String reverse = (sb.reverse()).toString();
       if (original.equals(reverse)){
        System.out.println("Palindrom");
       }
       else{
        System.out.println("Not Palindrom");
       }
       System.out.println(original);
       System.out.println(reverse);
    }
    
}
