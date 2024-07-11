import java.util.*;
public class LengthOfLastWord {

    public static int LenLastWrd(String s){
        s= s.trim();
        int len =0;
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)!=' '){
                len++;
            }
            else if(len > 0){
                break;
            }
        }
        return len;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(LenLastWrd(s));
        
    }
    
}
