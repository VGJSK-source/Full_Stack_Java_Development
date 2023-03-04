import java.util.*;
public class CheckPrime{ 

	public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a= sc.nextInt();
        if(checkPrime(a))
           System.out.println(a+" prime number");
        else
           System.out.println(a+" not prime");
        
        
	}
	public static boolean checkPrime(int a){
	    if(a<=1) return false;
	    for(int i=2;i<Math.sqrt(a);i++){
	        if(a%i==0)
	        return false;
	        }
	    return true;
	}
	 
}
