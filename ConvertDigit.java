import java.util.*;
public class ConvertDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str= Integer.toString(n);
        for(int i=0;i<str.length();i++){
            
            System.out.println(str.charAt(i));
        }
    }
    
}
