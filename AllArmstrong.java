import java.util.*;
public class AllArmstrong {
    public static void main(String[] args) {
        double N;
        int i;
        Scanner scanner;
        scanner = new Scanner(System.in);
        System.out.println("Enter a Number");
        N = scanner.nextFloat();
        System.out.println("Armstrong Number between 0 to " + (int) N);
         
        for (i = 0; i < N; i++) {
            if (isArmstrongNumber(i)) {
                System.out.println(i + " ");
            }
        } 
    }

    public static boolean isArmstrongNumber(int num) {
        int sum = 0, rm, temp;
        temp = num;
        while (temp != 0) {
            rm = temp % 10;
            sum = sum + (rm * rm * rm);
            temp = temp / 10;
        }
 
        if (sum == num) {
            // N is armstrong number
            return true;
        } else {
            // N is not an armstrong number
            return false;
        }
    }

    
}
