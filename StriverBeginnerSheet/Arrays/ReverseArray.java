public class ReverseArray 
{
    public static void reverseArray(ArrayList<Integer> arr, int m)
    {
        // Write your code here.
        int n = arr.size();
        int  i= m+1;
        int j = n-1;

        while(i < j){

            int temp  = arr.get(j);
            arr.set(j, arr.get(i));
            arr.set(i, temp);
            i++;
            j--;
        }

    }
}