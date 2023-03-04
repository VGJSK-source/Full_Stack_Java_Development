import java.util.*;
public class LuckyNo {
    public static int counter = 2;
 
    
    static boolean isLucky(int n)
    {
        if (counter > n)
            return true;
        if (n % counter == 0)
            return false;
        int next_position = n - (n / counter);
        counter++;
        return isLucky(next_position);
    }
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
    
         if (isLucky(n))
         System.out.println(n + " is a lucky no.");
         else
         System.out.println(n + " is not a lucky no.");
    }
}

   

