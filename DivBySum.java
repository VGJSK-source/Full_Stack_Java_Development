import java.util.*;
public class DivBySum {
    public static void main(String[] args) {
            Scanner sc= new Scanner(System.in);
            int n= sc.nextInt();
           
            if(diviOfSum(n)){
                System.out.println(n+" is divisible by sum of its digits");

            }
            else
            System.out.println(n+ " is not divisible by its digits");
         }
        static boolean diviOfSum(int n){
        int original=n;
        int sum=0;
        while(n>0){
            int rem=n%10;
            n=n/10;
            sum= sum+rem;
        }
        return (original%sum)==0;
        
    }
    
}
