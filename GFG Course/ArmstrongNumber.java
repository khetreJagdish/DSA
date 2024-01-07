import java.util.*;

public class ArmstrongNumber {
    static String armstrongNumber(int n){        
         int originalNumber = n;
         int count = 0;
         int currentNum = n;
         int sum = 0;
         while(currentNum != 0){
            count++;
            currentNum /= 10;
         }
         
         while(n != 0){
            int lastDigit = n % 10;
            sum = sum + (int)Math.pow(lastDigit,count);
            n = n/10;
         }      
        return (originalNumber == sum) ? "Yes" : "No";
    }
}
