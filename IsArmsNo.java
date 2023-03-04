import java.util.*;
public class IsArmsNo {
    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    int n = sc.nextInt();

    if(checkNo(n)){
    System.out.println(n+ " is armstrong number");
    }
    else
    System.out.println(n+ " is not armstrong number");
        
    }

   public static boolean checkNo(int n){
     int originalno=n;
     int sum=0;
     while(n>0){
        int rem=n%10;
        n=n/10;
        sum= sum+rem*rem*rem;
        }
    return sum==originalno;
   }

}
