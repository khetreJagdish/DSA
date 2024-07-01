public class AllDivisorsOptimized{
    public static List< Integer > printDivisors(int n) {
       // Write your code here

       List<Integer> list = new ArrayList<>();
       // TC : for loop will run till sqrt(n) 
        for(int i = 1; i<=Math.sqrt(n); i++){
            if(n % i == 0){
                list.add(i);

                if((n/i) != i){
                    list.add(n/i);
                }
            }
        }
        // list will contain m factors so for sorting TC : (mlog(m)) 
        Collections.sort(list);
        return list;
    }

    // overall TC sqrt(n)+m log(m)
  
}