import java.util.Arrays;

public class FindLargestElemenInAnArray {

	public static void main(String[] args) {	
  int[] LargeNum = {1,9,7,05,11};
  System.out.println("Before sort "+LargeNum);
  Arrays.sort(LargeNum);
 
  System.out.println("After Sort "+LargeNum);
  System.out.println("Largest Element In The Array:"+ LargeNum[LargeNum.length-1]);
}
}