import java.util.Scanner;

public class SeedNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        if(checkSeedNo(x, y)){
            System.out.println(x+" is a seed of "+y);
        }
        else
        System.out.println(x+" is not a seed of "+y);
    }
    static boolean checkSeedNo(int x, int y){
        int sum=x;
        while(x>0){
            int rem=x%10;
            x=x/10;
            sum= sum*rem;
        }
        return (sum==y);
    }
    
}
