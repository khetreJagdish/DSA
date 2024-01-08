public class FindSecondSmallestandGreatestNumber{

  public int[] getSeoondLargestandSmallestNumber(int size,int[] a){
    int smallest = Integer.MAX_VALUE;
    int largest = Integer.MIN_VALUE;

    int secondSmallest = Integer.MAX_VALUE;
    int secondLargest = Integer.MIN_VALUE;

    for(int num=0; num<size;num++){
      smallest = Math.min(smallest,a[num]);
      largest = Math.max(largest,a[num]);
    }

    for(int number = 0; number<size;number++){
      if(a[number] > secondLargest  &&  a[number] != largest){
         secondLargest = a[number];
      }

        if(a[number] < secondSmallest  &&  a[number] != smallest){
         secondSmallest = a[number];
      }
    }

    return new int[] {secondLargest,secondSmallest};
  }
  
}
