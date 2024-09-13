import java.math.BigInteger;
public class SumofDigitsofStringAfterConvert_1945_BruteForce {
    public int getLucky(String s, int k) {
    
    HashMap<Character,Integer> hashMap = new HashMap<>();
        int count  = 0;
        for(int  i = 97; i<= 122; i++){
            char c = (char)i;
            hashMap.put(c,++count);
        }
     System.out.println(hashMap.values());
     String s1 = "";
     for(int i =0; i<s.length(); i++){
         int num = hashMap.get(s.charAt(i));
         s1 += num;
     }
     System.out.println("String S1 : "+s1);
     
     BigInteger  num = new BigInteger(s1);
     BigInteger sum  = BigInteger.ZERO;
     
     
     while(k > 0){
         sum = BigInteger.ZERO;
         while(num.compareTo(BigInteger.ZERO) > 0){
             sum = sum.add(num.mod(BigInteger.TEN));
             num = num.divide(BigInteger.TEN);
         }
         k--;
         num = sum;
     }
    return sum.intValue();
    }
}