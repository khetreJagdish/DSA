public class CountDigits{
    static int evenlyDivides(int N){
        // code here
        
        int temp = N;
        int count =0;
        while(temp != 0){
            
            int num = temp % 10;
            if(num !=0 && N % num == 0) count++;
            temp = temp /10;
        }
        return count;
    }
}