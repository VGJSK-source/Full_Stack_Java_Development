import java.util.*;
import java.util.Scanner;
public class RotateNumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int temp = n;
        int count =0;
        while(temp>0){
            temp=temp/10;
            count++;
        }
        int div=1;
        int mul=1;
        k=k%count;   //when k is so large
        if(k<0){         // when k is negative
            k=k+count;
        }
        for(int i=1;i<=count;i++){
            if(i<=k){
                div=div*10;
            }
            else{
                mul=mul*10;
            }
        }
        int qu=n/div;
        int rd=n%div;
        rd=rd*mul+qu;
        System.out.println(rd);
        
        
    }
    
}
