public class LongSstring {
    public static void main(String[]args){
        String s ="abcabcbb";
        String max="";
        for(int i=0;i<s.length()-1;i++){
            for(int j=i+1;j<s.length();j++){
                String sub = s.substring(i,j);
                if (isRepeated(sub)) {
                    continue;
                }
                else if(sub.length()>max.length()){
                    max=sub;
                }
            }
            System.out.println("First longest subString :"+max);
            break;
        }
    }
    public static boolean isRepeated(String sub){
        for(int i=0;i<sub.length()-1;i++){
            char ch=sub.charAt(i);
            for(int j=i+1;j<sub.length();j++){
                if(ch==sub.charAt(j)){
                    return true;
                }
            }
        }
        return false;
    }
}
